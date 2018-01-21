package com.petreca.spring_demo;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.petreca.spring_demo.Tecnicos.Tecnico;
import com.petreca.spring_demo.confs.EsporteConfig;

public class JavaConfigDemoApp {

	public static void main(String[] args) {
		
		//Ler as classes 
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EsporteConfig.class);
		
		// carrega o bean do spring container
		Tecnico tecnico = context.getBean("tecnicoDeFutebol", Tecnico.class);
		
		// chama o metodo do bean
		System.out.println(tecnico.getExerciciosDoDia());
		System.out.println(tecnico.getSorteDoDia());
		
		// fecha o context
		context.close();
	}
}
