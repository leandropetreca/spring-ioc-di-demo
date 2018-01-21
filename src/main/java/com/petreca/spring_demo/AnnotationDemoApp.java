package com.petreca.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.petreca.spring_demo.Tecnicos.Tecnico;
import com.petreca.spring_demo.confs.EsporteConfigComponentScan;

public class AnnotationDemoApp {

	public static void main(String[] args) {
		
		//Ler as classes 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsporteConfigComponentScan.class);
		
		// carrega o bean do spring container
		Tecnico tecnico = context.getBean("tecnicoPingPong", Tecnico.class);
		
		// chama o metodo do bean
		System.out.println(tecnico.getExerciciosDoDia());
		System.out.println(tecnico.getSorteDoDia());
		
		// fecha o context
		context.close();
	}
}
