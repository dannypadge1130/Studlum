package com.studlum.repository;

import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.studlum.repository.BlogEntryRepository;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration
public class BlogEntryRepositoryTests {

	@Autowired BlogEntryRepository repository;
	//TODO
}
