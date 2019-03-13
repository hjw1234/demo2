package jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class chuTest {
	chu c=new chu();
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testC10() {
		c.c10(50);
	}

	@Test
	public void testC7() {
		c.c7(20);
	}

}
