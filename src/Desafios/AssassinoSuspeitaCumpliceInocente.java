package Desafios;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class AssassinoSuspeitaCumpliceInocente {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<>();

		System.out.println("1 Telefonou para a vítima?");
		lista.add("s");
		System.out.println("2 Esteve no local do crime?");
		lista.add("s");
		System.out.println("3 Mora perto da vítima?");
		lista.add("n");
		System.out.println("4 Devia para a vítima?");
		lista.add("n");
		System.out.println("5 Já trabalhou com a vítima?");
		lista.add("n");

		int contadorSim = 0;
		for (int i = 0; i < lista.size(); i++) {
			if (lista.get(i) == "s")
				contadorSim++;
		}
		System.out.println(contadorSim);
		if ((contadorSim > 0) && (contadorSim < 3)) {
			System.out.println("Suspeito");
		} else if ((contadorSim > 2) && (contadorSim < 5)) {
			System.out.println("Cúmplice");
		} else if (contadorSim == 5) {
			System.out.println("Assassino");
		} else {
			System.out.println("Inocente");

		}

	}
//	package br.com.dio.collection.list;
//
//	import java.util.ArrayList;
//	import java.util.Iterator;
//	import java.util.List;
//	import java.util.Scanner;

	/*
	Utilizando listas, faça um programa que faça 5 perguntas para uma pessoa sobre um crime. As perguntas são:
	1. "Telefonou para a vítima?"
	2. "Esteve no local do crime?"
	3. "Mora perto da vítima?"
	4. "Devia para a vítima?"
	5. "Já trabalhou com a vítima?"
	Se a pessoa responder positivamente a 2 questões ela deve ser classificada como "Suspeita", entre 3 e 4 como
	"Cúmplice" e 5 como "Assassina". Caso contrário, ele será classificado como "Inocente".
	*/
	public class ExercicioProposto02 {
	    public static void main(String[] args) {
	        List<String> respostas = new ArrayList<>();
	        Scanner scanner = new Scanner(System.in);

	        System.out.println("Perguntas: ");
	        System.out.print("\nTelefonou para vítima? ");
	        String resposta = scanner.next();
	        respostas.add(resposta.toLowerCase());
	        System.out.print("Esteve no local do crime? ");
	        resposta = scanner.next();
	        respostas.add(resposta.toLowerCase());
	        System.out.print("Mora perto da vítima? ");
	        resposta = scanner.next();
	        respostas.add(resposta.toLowerCase());
	        System.out.print("Devia para vítima? ");
	        resposta = scanner.next();
	        respostas.add(resposta.toLowerCase());
	        System.out.print("Já trabalhou com a vítima? ");
	        resposta = scanner.next();
	        respostas.add(resposta.toLowerCase());

	        System.out.println(respostas);

	        int count = 0;
	        Iterator<String> contador = respostas.iterator();
	        while(contador.hasNext()){
	            String resp = contador.next();
	            if(resp.contains("s")) {
	                count ++;
	            }
	        }

	        switch(count) {
	            case 2:
	                System.out.println(">> SUSPEITA <<"); break;
	            case 3:
	            case 4:
	                System.out.println(">> CÚMPLICE <<"); break;
	            case 5:
	                System.out.println(">> ASSASSINO <<"); break;
	            default:
	                System.out.println(">> INOCENTE <<"); break;
	        }
	        scanner.close();
	        
	    }
	}

}
