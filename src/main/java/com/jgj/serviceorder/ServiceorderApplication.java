package com.jgj.serviceorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ServiceorderApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceorderApplication.class, args);
	}

}


//DataSouces - Repositorys
//
//Interactor - Services // regras sobre o dominio
//
//Transporte - Controllers /orders ordemDto mapper -> order <- Service mapper -> orderEntity -> DataSorce -> Save(orderEntity);
//
//
//		regra: pelo menos 5 itens
//		conferir valor
//
//
//
//Domain - classes de negocio
//
//
