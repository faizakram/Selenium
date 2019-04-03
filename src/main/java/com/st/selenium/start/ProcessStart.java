package com.st.selenium.start;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.st.selenium.constant.Browser;
import com.st.selenium.constant.CommonConstant;
import com.st.selenium.set.property.SetDriverConfiguration;

public class ProcessStart {
	
	private WebDriver webDriver;
	public ProcessStart() {
		SetDriverConfiguration setDriverConfiguration = new SetDriverConfiguration(Browser.FireFox);
		webDriver = setDriverConfiguration.getWebDriver();
		webDriver.get(CommonConstant.BASE_URL);
	}

	public void login(String userName, String password) {
		webDriver.findElement(By.id("mat-input-0")).sendKeys(userName);
		webDriver.findElement(By.id("mat-input-1")).sendKeys(password);
		webDriver.findElement(By.xpath("//span[text()='LOGIN']")).click();
	}

}
