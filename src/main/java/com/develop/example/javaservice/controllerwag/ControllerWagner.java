package com.develop.example.javaservice.controllerwag;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.develop.example.javaservice.modelo.Investimentos;
import com.develop.example.javaservice.repositorywag.RepositoryWagner;

@RestController
public class ControllerWagner {

	@Autowired
	RepositoryWagner repositoryWagner;

	@GetMapping("/recebe")
	public String oneCheckController(@RequestBody Investimentos investimentos) {
		repositoryWagner.save(investimentos);
		return "Serviço Ok";
	}

	@GetMapping("/okk")
	public String ok() {
		return "Serviço Ok";
	}

}
