package com.studlum.service.entry;

import java.util.List;
import java.util.Set;

import com.studlum.model.TutorialEntry;

public interface TutorialEntryService {

	public List<TutorialEntry> findAllTutorialEntries();
	
	public TutorialEntry findTutorialEntry(String tutorialId);
	
	public void deleteTutorialEntry(String tutorialId);
	
	public void deleteTutorialEntry(TutorialEntry tutorialEntry);
	
	public void deleteTutorialEntries(Set<TutorialEntry> tutorialEntries);
	
	public TutorialEntry updateTutorialEntry(String tutorialId, TutorialEntry tutorialEntry);

	public TutorialEntry createTutorialEntry(TutorialEntry tutorialEntry);
}
