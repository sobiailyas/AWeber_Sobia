package stepdef;

import Pages.Wordpress_Home_page;
import common.Wordpress_Base;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class login  extends Wordpress_Base{
	
	@Given("i am on the wordpress homepage")
	public void i_am_on_the_wordpress_homepage() {
		launchbrowser();
	}

	@When("i click on the login button")
	public void i_click_on_the_login_button() {
		Wordpress_Home_page wp = new Wordpress_Home_page(driver);
		
	    wp.clicklogin();
		
	}

	@When("i enter {string}")
	public void i_enter(String user_name) {
	    
      Wordpress_Home_page wp = new Wordpress_Home_page(driver);
		
	    wp.enteruser(user_name);
	}

	@When("i click on the continue button")
	public void i_click_on_the_continue_button() {
		
		Wordpress_Home_page wp = new Wordpress_Home_page(driver);
		wp.clickcontinue();
	    
		
	}
	@When("i enter my {string}")
	public void i_enter_my(String password) {
		
		Wordpress_Home_page wp = new Wordpress_Home_page(driver);
		wp.enter_password(password);
	    
		
	}
	
	

	@When("i click on the log in button")
	public void i_click_on_the_log_in_button() {
		Wordpress_Home_page wp = new Wordpress_Home_page(driver);
		wp.click_login();
		
	}

	@Then("i am logged into the account sucessfully")
	public void i_am_logged_into_the_account_sucessfully() {
		
		System.out.println("==========================================================================");
		
		String title = driver.getTitle();
		System.out.println(title);
		
		System.out.println("==========================================================================");
		
		closeall();
	   
		
	}


}
