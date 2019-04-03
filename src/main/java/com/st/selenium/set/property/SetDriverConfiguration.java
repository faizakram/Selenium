package com.st.selenium.set.property;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.opera.OperaDriver;
import org.openqa.selenium.safari.SafariDriver;

import com.st.selenium.constant.Browser;
import com.st.selenium.constant.CommonConstant;

public class SetDriverConfiguration {
	
	private WebDriver webDriver;
	
	

	public SetDriverConfiguration(Browser browserType) {
		System.setProperty(CommonConstant.DRIVER_KEY, CommonConstant.DRIVER_VALUE);
		switch (browserType) {
		case Chrome:
			webDriver = new ChromeDriver();
			break;
		case FireFox:
			webDriver = new FirefoxDriver();
			break;
		case Safari:
			webDriver = new SafariDriver();
			break;
		case Opera:
			webDriver = new OperaDriver();
			break;
		case InterneExplorer:
			webDriver = new InternetExplorerDriver();
			break;
		default:
			throw new RuntimeException("No Driver Found");
		}
	}

	/**
	 * @return the webDriver
	 */
	public WebDriver getWebDriver() {
		return webDriver;
	}
	
	
}
