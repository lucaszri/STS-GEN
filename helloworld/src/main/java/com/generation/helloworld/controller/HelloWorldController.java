package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping ("/hello-world")
public class HelloWorldController {
	
	@GetMapping
	public String helloworld() {
		return "Hello World";
	}
	
	@GetMapping ("/bsm") 
	public String Mentalidades() {
		return "Mentalidades: 1. Orientação ao futuro \n 2. Responsabilidade pessoal \n 3. Mentalidade de Crescimento"
				+ "\n Persistência \n 4. Trabalho em Equipe \n 5. Atenção aos detalhes \n 6. Proatividade \n 7. Comunicação ";
	}
	
	@GetMapping ("/Objetivos")
	public String ObjetivosSemana() {
		return "Objetivo da semana: Aprener MySQL e Spring!";
	}
		
}
