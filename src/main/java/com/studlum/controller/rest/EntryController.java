package com.studlum.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studlum.model.Entry;
import com.studlum.service.entry.EntryService;

@RestController
public class EntryController {
	
	@Autowired
	private EntryService entryService;
	
	@RequestMapping(value="/api/entries", method=RequestMethod.GET)
	public @ResponseBody List<Entry> getAllEntries() {
		return entryService.findAllEntry();
	}
}
