package org.selenium.com;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.cucumber.java.en.Given;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test1 {

	@Given("I want to open chrome browser") 
		public void method1() {
			WebDriverManager.chromedriver().setup(); 
			ChromeDriver driver = new ChromeDriver();
			driver.get("https://www.google.com");
		}
	@Given("I want to open firefox browser")
	public void method2() {
		WebDriverManager.chromedriver().setup();
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.google.com");
	}
	@Given("I want to open edge browser")
	public void method3() {
		WebDriverManager.chromedriver().setup();
		EdgeDriver driver = new EdgeDriver();
		driver.get("https://www.google.com");
	}
	@Given("I want to open ie browser")
	public void method() {
		WebDriverManager.chromedriver().setup();
		InternetExplorerDriver driver = new InternetExplorerDriver();
		driver.get("https://www.google.com");
	}
}
