package MavenProject.FirstScript;

import org.testng.annotations.Test;

public class CarLoan {
	
	@Test(groups= {"Sanity"})
	public void logintoBranchforCarLoan()
	{
		System.out.println("logintoBranchforCarLoan");
	}
	
	@Test
	public void logintoAPPforCarLoan()
	{
		System.out.println("logintoAPPforCarLoan");
	}

}
