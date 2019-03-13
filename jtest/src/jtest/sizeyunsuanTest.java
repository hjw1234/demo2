package jtest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

public class sizeyunsuanTest {
	sizeyunsuan test=new sizeyunsuan();
	
	@Before
	public void setUp() throws Exception {
		System.out.println("测试开始之前");
	}

	@After
	public void tearDown() throws Exception {
		System.out.println("测试结束");
	}

	@Test
	public void testAdd() {
		int result=test.add(1, 3);
		assertEquals(4,result);
	}

	@Test
	public void testSub() {
		int result=test.sub(10, 2);
		assertEquals(5,result);
	}

	@Ignore
	public void testCheng() {
		int result=test.cheng(2,4);
		assertEquals(8,result);
	}

	@Test
	public void testChu() {
		int result=test.chu(4, 0);
		assertEquals(0,result);
	}
	
	@Test
	public void testShi() {
		int result=test.shi(70);
		assertEquals(0,result);
	}
	@Test
	public void testQi() {
		int result=test.qi(50);
		assertEquals(0,result);
	}

}
