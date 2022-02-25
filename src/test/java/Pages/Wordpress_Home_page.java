package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Wordpress_Home_page {
	
	WebDriver driver; 
	
	public Wordpress_Home_page(WebDriver dr) {
		driver = dr;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Log In')]")
	WebElement login;
	
	public void clicklogin() {
		login.click();
	}
	
	@FindBy(xpath = "//input[@id ='usernameOrEmail']")
	WebElement username;
	
	public void enteruser(String user_name) {
		username.sendKeys(user_name);
	}
	
	@FindBy(xpath = "//button[@class='button form-button is-primary']")
	WebElement buttoncontinue;
	
	public void clickcontinue() {
		buttoncontinue.submit();
	}
	
	@FindBy(xpath = "//input[@id='password']")
	WebElement passwordenter;
	
	public void enter_password(String password) {
		
		passwordenter.sendKeys(password);
	}
	
	@FindBy(xpath = "//button[@class='button form-button is-primary']")
	WebElement buttonlogin;
	
	public void click_login() {
		buttonlogin.submit();
	}
	
	
	
	

}
