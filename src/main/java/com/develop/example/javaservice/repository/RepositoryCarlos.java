package com.develop.example.javaservice.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.develop.example.javaservice.modelo.Investimentos;

public interface RepositoryCarlos extends MongoRepository<Investimentos, String> {


}
