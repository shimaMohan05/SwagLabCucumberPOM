package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hookspack.ThreadLocalDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepack.CartPage;
import pagepack.InventoryPage;
import pagepack.LoginPage;

public class CartTest {
	public WebDriver driver=ThreadLocalDemo.getdriver();
	public LoginPage lp=new LoginPage(driver);
	public InventoryPage ip=new InventoryPage(driver);
    public CartPage cp=new CartPage(driver);
	@Given("user should be in cart page")
	public void user_should_be_in_cart_page() {
		lp.toEnterCredentials("standard_user", "secret_sauce");
	    lp.toLogin();
	    ip.toSelectItem("Sauce Labs Backpack");
	    ip.toCart();
	    ip.toclickCart();

	}
	@When("click on remove button")
	public void click_on_remove_button() {
	   cp.toRemove();
	}

	@Then("product will be removed from cart")
	public void product_will_be_removed_from_cart() {
	    System.out.println("product remover from cart");
	}

	@When("click on continue button")
	public void click_on_continue_button() {

cp.toContinue();
	}

	@Then("user will redirected to inventory page")
	public void user_will_redirected_to_inventory_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("inventory"),"failed");
System.out.println("user redirected to inventory");
	}

	@When("user can select new product from inventory page")
	public void user_can_select_new_product_from_inventory_page() {
ip.toSelectItem("Sauce Labs Bike Light");
ip.toCart();

	}

	@When("user can click on cart button")
	public void user_can_click_on_cart_button() {
	   ip.toclickCart();
	}

	@Then("user rediredted to cart page")
	public void user_rediredted_to_cart_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("cart"),"failed");
System.out.println("user redirected to cart page");
	}

	@When("user click on checkout button")
	public void user_click_on_checkout_button() {

cp.toCheckOut();
	}

	@Then("user will redirected to checkout page")
	public void user_will_redirected_to_checkout_page() {

Assert.assertTrue(driver.getCurrentUrl().contains("checkout"),"failed");
System.out.println("user redirected to checkout");
	}
	


}
