package com.heve.variable.entorno.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class demoController {
	
	@GetMapping("/saludo")
	public String saludar(){
		String saludo = "Hola mundo";
		
		if(System.getProperty("user")!=null){
			saludo = saludo + " " + System.getProperty("user");
		}
		
		return saludo;
	}

}
