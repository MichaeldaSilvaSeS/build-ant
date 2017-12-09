package br.com.test.ant.jacoco;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({ CalculadoraTest.class })
public class AllTests {
	
	@BeforeClass
	public static void beforeClazz(){
		System.out.println("before");
	}
	
	@AfterClass
	public static void afterClazz(){
		System.out.println("before");
	}

}
