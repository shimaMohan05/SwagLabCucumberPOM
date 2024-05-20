package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hookspack.ThreadLocalDemo;
import hookspack.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepack.LoginPage;

public class LoginTest {
	public WebDriver driver=ThreadLocalDemo.getdriver();
	public LoginPage lp=new LoginPage(driver);
	@Given("open swaglab application")
	public void open_swaglab_application() {


	}

	@When("Enter {string} and {string}")
	public void enter_and(String un, String pw) {
lp.toEnterCredentials(un, pw);


	}

	@When("click on login button")
	public void click_on_login_button() {
lp.toLogin();

	}

	@Then("valid users can able to enter into inventory page")
	public void valid_users_can_able_to_enter_into_inventory_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"Failed to login");

System.out.println("Successfully login");
	}


}
