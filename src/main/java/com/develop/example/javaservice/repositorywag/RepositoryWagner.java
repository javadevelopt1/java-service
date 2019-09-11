package com.develop.example.javaservice.repositorywag;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.develop.example.javaservice.modelo.Investimentos;

public interface RepositoryWagner extends MongoRepository<Investimentos, String> {	
	
}
