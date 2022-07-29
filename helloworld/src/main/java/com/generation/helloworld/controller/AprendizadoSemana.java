package com.generation.helloworld.controller;

import java.util.ArrayList;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Aprendizado") 
public class AprendizadoSemana {
	
	@GetMapping
	public ArrayList <String> Semana() {
		ArrayList<String> SemanaList = new ArrayList<>();
		
		SemanaList.add(" * Lista de Aprendizagem *");
		SemanaList.add(" - MySQL");
		SemanaList.add(" - Spring tool");
		SemanaList.add(" - Responsabilidade pessoal");
		SemanaList.add(" - Kahoot");
		SemanaList.add(" - Ter impatia");
		SemanaList.add(" - Ter atenção");
		
		return SemanaList;
		
	}
}