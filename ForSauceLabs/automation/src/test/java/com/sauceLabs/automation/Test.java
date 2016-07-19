package com.sauceLabs.automation;

import org.openqa.selenium.By;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.URL;

public class Test {

	public static final String USERNAME = "kranthiXXXXXXX";
	public static final String AUTOMATE_KEY = "efrfsdf-yhju9-46-8kc8-51kjiojkljjhde";
	public static final String URL = "https://" + USERNAME + ":" + AUTOMATE_KEY + "@ondemand.saucelabs.com:80/wd/hub";

	public static void main(String[] args) throws Exception {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("browser", "IE");
		caps.setCapability("browser_version", "7.0");
		caps.setCapability("os", "Windows");
		caps.setCapability("os_version", "XP");
		caps.setCapability("browserstack.debug", "true");

		WebDriver driver = new RemoteWebDriver(new URL(URL), caps);
		driver.get("http://www.google.com");
		WebElement element = driver.findElement(By.name("q"));

		element.sendKeys("BrowserStack");
		element.submit();

		System.out.println(driver.getTitle());
		driver.quit();

	}

}
