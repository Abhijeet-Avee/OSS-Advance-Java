package mavenproject;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class StringLogicTest {

	private StringLogic logic;
	
	@Before
	public void beforeTest() {
		logic = new StringLogic();
	}
	
	@Test
	public void getLengthTest() {		
		Assert.assertEquals(4, logic.getLength("java"));
	}
	
	@After
	public void afterTest() {
		logic = null;
	}
}
