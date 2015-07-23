package com.studlum.service.entry;

import java.util.Date;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.studlum.model.BlogEntry;
import com.studlum.repository.BlogEntryRepository;

@Service
public class BlogEntryServiceImpl implements BlogEntryService {

	@Autowired
	private BlogEntryRepository blogEntryRepository;
	
	public List<BlogEntry> findAllBlogEntries() {
		return blogEntryRepository.findAll();
	}

	public BlogEntry findBlogEntry(String blogEntryId) {
		return blogEntryRepository.findOne(blogEntryId);
	}

	public void deleteBlogEntry(String blogEntryId) {
		blogEntryRepository.delete(blogEntryId);
	}

	public void deleteBlogEntry(BlogEntry blogEntry) {
		blogEntryRepository.delete(blogEntry);
	}

	public void deleteBlogEntries(Set<BlogEntry> blogEntries) {
		blogEntryRepository.delete(blogEntries);
	}

	@Transactional
	public BlogEntry updateBlogEntry(String blogEntryId, BlogEntry blogEntry) {
		
		BlogEntry oldBlogEntry = blogEntryRepository.findOne(blogEntryId);
		oldBlogEntry.setBannerImageUrl(blogEntry.getBannerImageUrl());
		oldBlogEntry.setBody(blogEntry.getBody());
		oldBlogEntry.setDescription(blogEntry.getDescription());
		oldBlogEntry.setTitle(blogEntry.getTitle());
		oldBlogEntry.setModifiedDate(new Date());

		return blogEntryRepository.save(oldBlogEntry);
	}

	@Transactional
	public BlogEntry createBlogEntry(BlogEntry blogEntry) {
		return blogEntryRepository.save(blogEntry);
	}
	
}
