package testNG;

import org.testng.annotations.Test;

public class skipATestCase {

	@Test(priority = 0)
	public void DriveAcar() {
		System.out.println("Start a Car");
	}
	
	  @Test(priority = 1)
	public void putFristGear() {
		System.out.println("Frist a Car");
	}
	
	@Test(priority = 2)
	public void putSecondGear() {
		System.out.println("Second a Car");
	}
	
	@Test(priority = 3)
	public void putThirdGear() {
		System.out.println("Third a Car");
	}
	
	@Test(priority = 4, enabled = false)
	public void puFourthGear() {
		System.out.println("Fourth a Car");
	}
}
