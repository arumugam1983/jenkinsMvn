package com.aru.training.jenkinsMvn;

import static org.junit.Assert.*;

import org.junit.Test;

import com.aru.training.jenkinsmvn.JenkinsCalculator;

public class CalculatorTest {

	@Test
	public void addTest() {
		JenkinsCalculator jc = new JenkinsCalculator();
		assertEquals(10, jc.addNumber(5, 5));
		
	}
	
	/*
	 * @Test public void subTest() { JenkinsCalculator jc = new JenkinsCalculator();
	 * assertEquals(5, jc.subNumber(10, 5));
	 * 
	 * }
	 */
	
	
	/*
	 * public void subTest() { fail("Not yet implemented"); }
	 */

}
