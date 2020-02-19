package edu.umb.cs.cs680.hw01;


import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;
import org.junit.Test;


public class CalculatorTest {

	@Test
	public void multiply3By4() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3, 4);
		float expected = 12;
		assertThat(actual, is(expected));
	}

	@Test
	public void divide3by2() {
		Calculator cut = new Calculator();
		float actual = cut.divide(3, 4);
		float expected = 0.75f;
		assertThat(actual, is(expected));
	}
	@Test(expected = IllegalArgumentException.class)
	public void divide5By0() {
		Calculator cut = new Calculator();
		cut.divide(5, 0);
		
	}
	
	@Test
	public void multiply3point5By4point5() {
		Calculator cut = new Calculator();
		float actual = cut.multiply(3.5f, 4.5f);
		float expected = 15.75f;
		assertThat(actual, is(expected));
	}
	
	@Test
	public void divide5By2() {
		Calculator cut = new Calculator();
		float actual = cut.divide(5.0f, 2.0f);
		float expected = 2.5f;
		assertThat(actual, is(expected));
	}
	
	}

