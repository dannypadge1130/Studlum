package com.studlum.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studlum.model.TutorialEntry;

@Repository
public interface TutorialEntryRepository extends MongoRepository<TutorialEntry, String>{

}
