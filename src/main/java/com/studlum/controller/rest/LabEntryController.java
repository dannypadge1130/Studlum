package com.studlum.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.studlum.model.LabEntry;
import com.studlum.service.entry.LabEntryService;

@RestController
public class LabEntryController {

	@Autowired
	LabEntryService labService;
	
	@RequestMapping(value="/api/labs", method=RequestMethod.GET) 
	public @ResponseBody List<LabEntry> getAllLabs() {
		return labService.findAllLabEntries();
	}
	
	@RequestMapping(value="/api/lab/{labId}", method=RequestMethod.GET)
	public @ResponseBody LabEntry getLab(@PathVariable String labId) {
		return labService.findLabEntry(labId);
	}
	
	@RequestMapping(value="/api/admin/lab/{labId}", method=RequestMethod.DELETE)
	public void deleteLab(@PathVariable String labId) {
		labService.deleteLabEntry(labId);
	}
	
	@RequestMapping(value="/api/admin/lab/{labId}", method=RequestMethod.POST)
	public @ResponseBody LabEntry updateLabEntry(@PathVariable String labId, @RequestBody LabEntry lab) {
		return labService.updateLabEntry(labId, lab);
	}
	
	@RequestMapping(value="/api/admin/lab", method=RequestMethod.POST)
	public @ResponseBody LabEntry createLabEntry(@RequestBody LabEntry lab) {
		return labService.createLabEntry(lab);
	}
}
