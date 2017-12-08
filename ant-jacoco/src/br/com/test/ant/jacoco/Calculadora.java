package br.com.test.ant.jacoco;

import org.joda.time.LocalDateTime;

public class Calculadora {
	
	public int somar(int a, int b){
		return a+b;
	}
	
	public static void main(String[] args) {
		System.out.println("Sucesso "+LocalDateTime.now());
	}

}
