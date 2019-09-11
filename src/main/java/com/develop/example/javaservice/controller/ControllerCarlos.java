package com.develop.example.javaservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.develop.example.javaservice.modelo.Investimentos;
import com.develop.example.javaservice.repository.RepositoryCarlos;

@RestController
public class ControllerCarlos {

	@Autowired
	RepositoryCarlos repositoryCarlos;

	@PostMapping("/insere")
	public String primeiroRestController(@RequestBody Investimentos investimentos) {
		repositoryCarlos.save(investimentos);
		return "INSERIDO COM SUCESSO";
	}

	@PostMapping("/ok")
	public String ok() {
		return "INSERIDO COM SUCESSO";
	}
}
