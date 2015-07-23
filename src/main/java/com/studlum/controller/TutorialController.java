package com.studlum.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TutorialController {

	@RequestMapping(value="/tutorial/view/{tutorialId}", method=RequestMethod.GET)
	public String view(@PathVariable String tutorialId, Model model) {
		model.addAttribute("id", tutorialId);
		return "/tutorial/view";
	}
	
	@RequestMapping(value="/tutorial/admin/create", method=RequestMethod.GET)
	public String create() {
		return "/tutorial/admin/create";
	}
	
	@RequestMapping(value="/tutorial/admin/edit/{tutorialId}", method=RequestMethod.GET)
	public String edit(@PathVariable String tutorialId, Model model) {
		model.addAttribute("id", tutorialId);
		return "/tutorial/admin/edit";
	}
}
