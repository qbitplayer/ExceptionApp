package test;

import java.io.IOException;

import org.junit.Test;

import main.ExceptionsApp;

public class TestExceptions {

	
	@Test(expected = RuntimeException.class) 
	public void testIndexOutOfRange(){
		
		ExceptionsApp.checkIndex(-1); 
		
		 
	}
}
