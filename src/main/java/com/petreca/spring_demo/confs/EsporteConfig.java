package com.petreca.spring_demo.confs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.petreca.spring_demo.Tecnicos.Tecnico;
import com.petreca.spring_demo.Tecnicos.TecnicoDeFutebol;
import com.petreca.spring_demo.sortes.FelizSorteService;
import com.petreca.spring_demo.sortes.SorteService;

@Configuration
public class EsporteConfig {
	
	
	// Definindo um metodo para expor o bean
	@Bean
	public SorteService felizSorteService() {		
		return new FelizSorteService();
	}
	
	@Bean
	public Tecnico tecnicoDeFutebol() {
		TecnicoDeFutebol tecnicoDeFutebol = new TecnicoDeFutebol(felizSorteService());		
		return tecnicoDeFutebol;
	}

}
