package Base;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Base_Class {
	public WebDriver driver;
	public void initilizeBrowser() {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ADMIN\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.get("https://kite.zerodha.com/");
	  //maximize
	    driver.manage().window().maximize();
	    //implicitly wait
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
	
	}
	

}
