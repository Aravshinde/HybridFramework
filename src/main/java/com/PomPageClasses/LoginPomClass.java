package com.PomPageClasses;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.Hybrid.BaseClass;

public class LoginPomClass extends BaseClass{

	public LoginPomClass() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//p[text()='Username : Admin']")
	private WebElement username;
	
	@FindBy(xpath = "//p[text()='Password : admin123']")
	private WebElement password;
	
	
	@FindBy(xpath = "//input[@name='username']")
	private WebElement inputUser;
	
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement inputPassword;
	
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement submitButton;
	
	
	@FindBy(xpath = "//a[text()='OrangeHRM, Inc']")
	private WebElement homepageLink;
	
	
	public String getUsername() {
		
		String original = username.getText();
		String username = original.substring(original.indexOf('A'));
		
		return username;
	}
	
	public String getPassword() {
		String original = password.getText();
		String password = original.substring(original.lastIndexOf('a'));
		
		return password;
	}
	
	public void setUsername(String username) {
		inputUser.sendKeys(username);
	}
	
	public void setPassword(String password) {
		inputPassword.sendKeys(password);
	}
	
	public void login() {
		submitButton.click();
	}

}

