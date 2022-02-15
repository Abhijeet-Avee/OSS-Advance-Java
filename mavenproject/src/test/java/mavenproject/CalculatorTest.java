package mavenproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;


public class CalculatorTest {
	
	private Calculator calculator;
	
//	@BeforeClass
//	public static void setUpBeforeClass() throws Exception {
//		System.out.println("It runs only once at beginning");
//	}
//
//	@AfterClass
//	public static void tearDownAfterClass() throws Exception {
//		System.out.println("It runs only once at the end");
//	}
//
//	@Before
//	public void setUp() throws Exception {
//		System.out.println("This run before every test case");
//	}
//
//	@After
//	public void tearDown() throws Exception {
//		System.out.println("This run after every test case");
//	}
//
//	@Test
//	public void test() {
//		System.out.println("It is a test");
//	}
//
//	@Test
//	public void test2() {
//		System.out.println("It is a test2");
//	}
	@Before
	public void beforeEachTest() {
		calculator = new Calculator();
	}

	@Test
	public void addTest() {
		Assert.assertEquals(4, calculator.add(2, 2));
	}
	
	@Test(expected = ArithmeticException.class)
	public void divideTest() {
		Assert.assertEquals(2, calculator.divide(20,0));
	}
	
	@After
	public void afterEachTest() {
		calculator = null;
	}
}
