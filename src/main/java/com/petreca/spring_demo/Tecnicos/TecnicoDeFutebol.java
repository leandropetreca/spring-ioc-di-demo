package com.petreca.spring_demo.Tecnicos;

import org.springframework.stereotype.Component;

import com.petreca.spring_demo.sortes.SorteService;

@Component
public class TecnicoDeFutebol implements Tecnico {
	
	private SorteService sorteService;
	
	public TecnicoDeFutebol( SorteService theSorteService) {
		sorteService = theSorteService;
	}

	public String getExerciciosDoDia() {
		
		return "Treino de cruzamento e penalts.";
	}

	public String getSorteDoDia() {
		
		return sorteService.getPrevisao();
	}

}
