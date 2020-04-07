package com.mindtree.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;
import com.mindtree.library.service.BookService;
import com.mindtree.library.service.LibraryService;

@Controller
public class BookController {

	@Autowired
	BookService bookService;
	@Autowired
	LibraryService libraryService;
	private int slibraryId;
	private int dlibraryId;
	private int ulibraryId;

	@RequestMapping("/new-book/{id}")
	public String addBook(@PathVariable int id, Model model) {
		Books book = new Books();
		slibraryId = id;
		System.out.println(id);
		model.addAttribute("book", book);
		return "New_Book";
	}

	@RequestMapping("/save-book")
	public String saveBook(@ModelAttribute Books book) {
		int count = 0;
		List<Books> allBooks = this.bookService.allBooks();
		for (Books books : allBooks) {
			if (books.getBookName().equalsIgnoreCase(book.getBookName())) {
				Library library = this.libraryService.update(slibraryId);
				books.getAllLibrary().add(library);
				library.getAllBooks().add(books);
				this.libraryService.saveLibrary(library);

				count++;
			}
		}
		if (count == 0) {
			this.bookService.addBook(book, slibraryId);
		}
		return "redirect:/details/" + slibraryId;

	}

	@RequestMapping("/edit-book")
	public String updateBook(@ModelAttribute Books book) {
		int count = 0;
		List<Books> allBooks = this.bookService.allBooks();
		for (Books books : allBooks) {
			if (books.getBookName().equalsIgnoreCase(book.getBookName())) {
				Library library = this.libraryService.update(ulibraryId);
				books.getAllLibrary().add(library);
				library.getAllBooks().add(books);
				this.libraryService.addLibrary(library);

				count++;
			}
		}
		if (count == 0) {
			this.bookService.addBook(book, ulibraryId);
		}
		return "redirect:/details/" + ulibraryId;

	}

	@RequestMapping("/delete-b/{lid}")
	public String allBooks(@PathVariable int lid, Model model) {
		List<Integer> allIds = this.bookService.allId(lid);
		dlibraryId = lid;
		model.addAttribute("allIds", allIds);
		return "Delete_Book";
	}

	@RequestMapping("/delete-book")
	public String deleteBook(@RequestParam(name = "id") int id) {
		this.bookService.deleteBook(id);
		return "redirect:/details/" + dlibraryId;
	}

	@RequestMapping("/update-b/{uid}")
	public String allBooksforUpdate(@PathVariable int uid, Model model) {
		List<Integer> allIds = this.bookService.allId(uid);
		ulibraryId = uid;
		model.addAttribute("allIds", allIds);
		return "Update_Book";
	}

	@RequestMapping("/Update-book-ofId")
	public ModelAndView update(@RequestParam(name = "id") int id, Model model) {
		ModelAndView mav = new ModelAndView("Update_Book_Name");
		Books book = this.bookService.find(id);
		mav.addObject("book", book);

		return mav;

	}

}
