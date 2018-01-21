package com.petreca.spring_demo.Tecnicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.petreca.spring_demo.sortes.SorteService;

@Component
public class TecnicoPingPong implements Tecnico {
	
	@Autowired
	private SorteService sorteService;
	
	
	
	public TecnicoPingPong() {
		System.out.println("** TecnicoPingPong (dentro do contrutor)");
	}
	

	
	public String getExerciciosDoDia() {
		
		return "Pratique seu saque!";
	}

	public String getSorteDoDia() {
	
		return sorteService.getPrevisao();
	}

}
