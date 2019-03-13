package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class chuTest {
	chu a=new chu();
  @BeforeClass
  public void beforeClass() {
	  System.out.println("我是beforeclass");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("我是afterclass");
  }

  @BeforeTest
  public void beforeTest() {
	  System.out.println("我是beforetest");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("我是aftertest");
  }


  @Test
  public void c10() {
	  String result=a.c10(50);
	  Assert.assertEquals("a可以被10整除", result);//断言，判断结果是否一致
	 // System.out.println("余10的话"+result);
	 // Assert.assertNotEquals("a不可以被10整除", result);//断言，判断结果是否不一致
	  //Assert.assertNull(result);//断言，判断结果是否为空
	  //Assert.assertNotNull(result);//断言，判断结果是否不为空
  }

  @Test(dependsOnMethods= {"c10"})
  public void c7() {
	  String result=a.c7(50);
	  System.out.println("余7的话"+result);
  }
}
