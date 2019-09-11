package com.develop.example.javaservice.repository;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import junit.framework.Assert;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TesteServiceTest {
	
	@Autowired
	TesteService service;

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
		String retorno = service.confirmacao();
		Assert.assertEquals(retorno, "OK");
	}

}
