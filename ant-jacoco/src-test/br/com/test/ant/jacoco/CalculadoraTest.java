package br.com.test.ant.jacoco;

import org.junit.Assert;
import org.junit.Test;

public class CalculadoraTest {
	
	@Test
	public void somar1Mais2Iqual3Test(){
		Assert.assertEquals(3, new Calculadora().somar(1, 2));
	}
	
	@Test
	public void mainTest(){
		Assert.assertEquals(4, new Calculadora().somar(2, 2));
	}
}
