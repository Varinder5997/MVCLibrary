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

import com.mindtree.library.dto.ModelDto;
import com.mindtree.library.dto.NewDto;
import com.mindtree.library.entity.Books;
import com.mindtree.library.entity.Library;
import com.mindtree.library.service.LibraryService;

@Controller
public class LibraryController {

	@Autowired
	LibraryService libraryService;

	@RequestMapping("/new")
	public String addNewLibrary(Model model) {
		Library library = new Library();
		model.addAttribute("library", library);
		return "New_Library";
	}

	@RequestMapping("/save")
	public String addLibrary(@ModelAttribute Library library) {
		int s= this.libraryService.addLibrary(library);
		if(s==1) {
		return "redirect:/";
		}
		else if(s==2) {
		return "AlreadyPresent";
		}
		else {
		return "validName";
		}
	}

	@RequestMapping("/")
	public String allLibrary(Model model) {

		List<Library> listLibrary = this.libraryService.allLibrary();
		model.addAttribute("listLibrary", listLibrary);
		return "HomePage";
	}

	@RequestMapping("/delete")
	public String allIndex(Model model) {
		List<Integer> allId = this.libraryService.allId();
		model.addAttribute("allId", allId);
		return "Delete_Library";
	}

	@RequestMapping("/details/{id}")
	public String books(@PathVariable(name = "id") int id, Model model) {
		ModelDto dto = new ModelDto();
		List<Books> listBooks = this.libraryService.books(id);
		dto.setBooks(listBooks);
		Library library = this.libraryService.update(id);
		dto.setLibrary(library);
		model.addAttribute("dto", dto);
		return "Books";
	}

	@RequestMapping("/update/{id}")
	public ModelAndView editLibrary(@PathVariable(name = "id") int id, Model model) {
		ModelAndView mav = new ModelAndView("Update_Library");
		Library library = this.libraryService.update(id);
		mav.addObject("library", library);

		return mav;
	}

	@RequestMapping("/d")
	public String deleteProduct(@RequestParam(name = "id") int id) {
		this.libraryService.deleteLibrary(id);
		return "redirect:/";
	}

}
