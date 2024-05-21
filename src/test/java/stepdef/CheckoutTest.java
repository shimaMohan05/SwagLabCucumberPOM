package stepdef;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import hookspack.ThreadLocalDemo;
import hookspack.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepack.CartPage;
import pagepack.CheckoutPage;
import pagepack.InventoryPage;
import pagepack.LoginPage;

public class CheckoutTest {
	public WebDriver driver=ThreadLocalDemo.getdriver();
	public LoginPage lp=new LoginPage(driver);
	public InventoryPage ip=new InventoryPage(driver);
    public CartPage cp=new CartPage(driver);
    public CheckoutPage cop=new CheckoutPage(driver);
	@Given("user should be in checkout page")
	public void user_should_be_in_checkout_page() {

		 lp.toEnterCredentials(UtilityClass.getConfigDetails("uname"), UtilityClass.getConfigDetails("pword"));
	    lp.toLogin();
	    ip.toSelectItem(UtilityClass.getConfigDetails("product"));
	    ip.toCart();
	    ip.toclickCart();
	    cp.toCheckOut();
	}

	@When("enter firstname , lastname and zip")
	public void enter_firstname_lastname_and_zip(io.cucumber.datatable.DataTable dataTable) {
		
  cop.toEnterDetails(dataTable.cell(1, 0), dataTable.cell(1, 1), dataTable.cell(1, 2));
	}

	@When("click on continue button in checkout page")
	public void click_on_continue_button_in_checkout_page() {

cop.toCont();
	}

	@Then("user redirected to overview  page")
	public void user_redirected_to_overview_page() {

		Assert.assertFalse(!driver.getCurrentUrl().contains("checkout-step-two"));
		System.out.println("user redirected to review page");
	}

}
