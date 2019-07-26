package Org.sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SnapDeal {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ABC\\Desktop\\Day1\\GitLaunch\\Build Path\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.snapdeal.com");
		
	}

}
