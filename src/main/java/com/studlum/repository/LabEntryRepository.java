package com.studlum.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.studlum.model.LabEntry;

@Repository
public interface LabEntryRepository extends MongoRepository<LabEntry, String> {

}
