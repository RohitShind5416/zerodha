package Rohit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class A {
	public static void main(String[] args) {
		//WebDriverManager.chromedriver().setup();
		//WebDriver driver=new ChromeDriver();
		WebDriver driver=WebDriverManager.chromedriver().create();
		driver.get("https://www.google.co.in/");
	}
	

}
