package com.studlum.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.config.AbstractMongoConfiguration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.mongodb.Mongo;
import com.mongodb.MongoClient;

@Configuration
@EnableMongoRepositories(basePackages="com.studlum.repository")
public class MongoConfig extends AbstractMongoConfiguration {

	@Override
	protected String getDatabaseName() {
		return "studlum";
	}

	@Override
	public Mongo mongo() throws Exception {
		MongoClient mongoClient = new MongoClient("localhost", 30000);
		return mongoClient;
	}
	
}
