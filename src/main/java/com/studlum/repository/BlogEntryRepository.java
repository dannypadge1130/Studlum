package com.studlum.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studlum.model.BlogEntry;

@Repository
public interface BlogEntryRepository extends MongoRepository<BlogEntry, String> {
	
}
