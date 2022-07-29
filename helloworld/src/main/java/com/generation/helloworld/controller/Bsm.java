package com.generation.helloworld.controller;

import java.util.ArrayList;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsm") 
public class Bsm {

	@GetMapping
	public ArrayList <String> bsm() {
		ArrayList<String> bsmList = new ArrayList<>();
		
		bsmList.add(" * Lista de BSM's *");
		bsmList.add(" - introdução as habilidades comportamentais e mentalidades");
		bsmList.add(" - Mentalidade de crescimento");
		bsmList.add(" - Responsabilidade pessoal");
		bsmList.add(" - Orientação ao futuro");
		bsmList.add(" - comunicação");
		bsmList.add(" - orientação aos detalhes");
		bsmList.add(" - Proatividade");
		bsmList.add(" - Trabalho em Equipe");
		bsmList.add(" - Dar e Receber");
	
		return bsmList;
		
	} 
}