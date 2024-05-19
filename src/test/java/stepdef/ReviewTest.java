package stepdef;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import hookspack.ThreadLocalDemo;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepack.CartPage;
import pagepack.CheckoutPage;
import pagepack.InventoryPage;
import pagepack.LoginPage;
import pagepack.ReviewPage;

public class ReviewTest {
	public WebDriver driver=ThreadLocalDemo.getdriver();
	public LoginPage lp=new LoginPage(driver);
	public InventoryPage ip=new InventoryPage(driver);
    public CartPage cp=new CartPage(driver);
    public CheckoutPage cop=new CheckoutPage(driver);
    public ReviewPage rp=new ReviewPage(driver);

@Given("user should be in review page")
public void user_should_be_in_review_page() {
	lp.toEnterCredentials("standard_user", "secret_sauce");
    lp.toLogin();
    ip.toSelectItem("Sauce Labs Backpack");
    ip.toCart();
    ip.toclickCart();
    cp.toCheckOut();
    cop.toEnterDetails("shima", "mohan", "560060");
    cop.toCont();
}

@When("check the details")
public void check_the_details() {
   rp.getSummary();
}

@When("click on finish button")
public void click_on_finish_button() {
    rp.toFinish();
}

@Then("user redirected to checkout complete page")
public void user_redirected_to_checkout_complete_page() {
	Assert.assertTrue(driver.getCurrentUrl().contains("checkout-complete"),"failed");
	System.out.println("user compleated booking product");
}

}
