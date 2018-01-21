package com.petreca.spring_demo.Tecnicos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.petreca.spring_demo.sortes.SorteService;

@Component
@Scope("prototype")
public class TecnicoVolei implements Tecnico {
	
	@Autowired
	private SorteService sorteService;
	
	
	
	public TecnicoVolei() {
		System.out.println("** TecnicoVolei (dentro do contrutor)");
	}
	

	
	public String getExerciciosDoDia() {
		
		return "Pratique seu saque e seu levantamento";
	}

	public String getSorteDoDia() {
	
		return sorteService.getPrevisao();
	}

}
