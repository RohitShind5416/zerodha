package TestKite;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import Base.Base_Class;
import Pom.Pom_1;
import Pom.Pom_2;
import Pom.Pom_3;
import Utility.Utility_class;

public class Test_class extends Base_Class {
	//declare all useful members as global
	
			Pom_1 login1;
			Pom_2 login2;
			Pom_3 home;
			
		@BeforeClass
		public void openBrowser() throws Throwable {
			initilizeBrowser();
		    
		    //all objects of POM class
		    login1=new Pom_1(driver);
		     login2=new Pom_2(driver);
		     home=new Pom_3(driver);
		}
		@BeforeMethod
		public void loginToApp() throws Throwable {
			//enter un
			 
			 login1.enterUN(Utility_class.getTD(0, 0));//DPG458
			 System.out.println((Utility_class.getTD(0, 0)));
			 
			 //enter pwd
			
			login1.enterPWD(Utility_class.getTD(0, 1));
			//clck on login btn
			login1.clickLOGINBTN();
			
			//enter pin
			
			login2.enterPIN(Utility_class.getTD(0, 2));
			//click on continue btn
			login2.clickcntBtn();
		}
		@Test
		public void verifyuserID() throws Throwable {
			Reporter.log("running verify user id",true);
			String actID = home.verifyuserID();
			 String expID=Utility_class.getTD(0, 0);
			Assert.assertEquals(expID,actID,"both are different tc is failed");
		}
		@AfterMethod
		public void logoutApp() {
			Reporter.log("logout the application",true);
		}
		@AfterClass
		public void closeBrowser() {
			Reporter.log("close the app",true);
		}

}
