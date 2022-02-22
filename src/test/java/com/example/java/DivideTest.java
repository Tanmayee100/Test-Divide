package com.example.java;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;
import com.example.java.Divide;

/**
 * Unit test for DivideTest
 * @author hp
 *
 */
public class DivideTest {
	/**
	 * 
	 */
	@Test
	public void testDivide() {
		double expectedResult= 2.0;
		Divide divide= new Divide();
        double actualResult= divide.div(4,2);
		Assert.assertEquals(expectedResult,actualResult,2.5);
	}
	
	@Test
	public void testZero() {
		Divide divide= new Divide();
		try {
	    divide.div(4,0); 
	    fail("Expected ArithmeticException");
		}catch(ArithmeticException e) {
	}
	}		
}
