package com.halloWorld.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/hello")
@RestController
public class HelloController {

	@GetMapping
	public String hello ()  {
		return " As habilidades necessárias para o aprendizado de Spring Boot são Orientação aos Detalhes e persistencia."
				+ "Essa semana pretendo aprofundar mais meus conhecimentos de spring boot e de MySQL! ";
	}
	

}
