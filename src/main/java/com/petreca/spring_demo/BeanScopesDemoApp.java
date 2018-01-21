package com.petreca.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.petreca.spring_demo.Tecnicos.Tecnico;
import com.petreca.spring_demo.confs.EsporteConfigComponentScan;

public class BeanScopesDemoApp {

	public static void main(String[] args) {
		
		//Ler as classes 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsporteConfigComponentScan.class);
		
		// ##################
		// exemplo Sungleton
		// ##################
		Tecnico tecnicoA = context.getBean("tecnicoDeFutebol", Tecnico.class);		
		Tecnico tecnicoB = context.getBean("tecnicoDeFutebol", Tecnico.class);
		
		// vrifica se é o mesmo
		boolean resultadoSingleton = (tecnicoA == tecnicoB);
		
		// print out the results
		System.out.println("\nE o mesmo objeto?: " + resultadoSingleton);		
		System.out.println("\nMemoria para tecnicoA: " + tecnicoA);
		System.out.println("\nMemoria para tecnicoB: " + tecnicoB + "\n");
		
		// ##################
		// exemplo prototype
		// ##################
		Tecnico tecnicoC = context.getBean("tecnicoVolei", Tecnico.class);		
		Tecnico tecnicoD = context.getBean("tecnicoVolei", Tecnico.class);
		
		// vrifica se é o mesmo
		boolean resultadoPrototype = (tecnicoC == tecnicoD);
		
		// print out the results
		System.out.println("\nE o mesmo objeto?: " + resultadoPrototype);		
		System.out.println("\nMemoria para tecnicoC: " + tecnicoC);
		System.out.println("\nMemoria para tecnicoD: " + tecnicoD + "\n");
		
		
	
		// close the context
		context.close();
	}
}
