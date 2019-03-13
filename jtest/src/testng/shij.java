package testng;

import org.testng.annotations.Test;

public class shij {
	@Test(timeOut=4000)
	public void newtest() throws InterruptedException {
		Thread.sleep(5000);
	}
}
