package testNG;

import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test(enabled = false)
	public void StartACar() {
		System.out.println("st on the switch");
	}
	
	
	 @Test(dependsOnMethods="StartACar") 
		public void DriveAcar() {
			System.out.println("Start a Car");
		}
		
		  @Test(dependsOnMethods="DriveAcar")
		  public void putFristGear() {
			System.out.println("Frist a Car");
		}
		
/*		@Test(priority = 2)
		public void putSecondGear() {
			System.out.println("Second a Car");
		}
		
		@Test(priority = 3)
		public void putThirdGear() {
			System.out.println("Third a Car");
		}
		
		@Test(priority = 4)
		public void puFourthGear() {
			System.out.println("Fourth a Car");

}*/
}