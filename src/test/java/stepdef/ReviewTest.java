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
	 lp.toEnterCredentials(UtilityClass.getConfigDetails("uname"), UtilityClass.getConfigDetails("pword"));
	 UtilityClass.toTakeScreenShot(driver);
    lp.toLogin();
    UtilityClass.getWait();
    UtilityClass.toTakeScreenShot(driver);
    ip.toSelectItem(UtilityClass.getConfigDetails("product"));
    UtilityClass.getWait();
    ip.toCart();
    ip.toclickCart();
    UtilityClass.toTakeScreenShot(driver);
    UtilityClass.getWait();
    cp.toCheckOut();
    UtilityClass.toTakeScreenShot(driver);
    cop.toEnterDetails(UtilityClass.getConfigDetails("fname"), UtilityClass.getConfigDetails("lname"),UtilityClass.getConfigDetails("zip"));
    UtilityClass.toTakeScreenShot(driver);
    UtilityClass.getWait();
    cop.toCont();
    UtilityClass.getWait();
    UtilityClass.toTakeScreenShot(driver);
}

@When("check the details")
public void check_the_details() {
   rp.getSummary();
   UtilityClass.getWait();
   UtilityClass.toTakeScreenShot(driver);
}

@When("click on finish button")
public void click_on_finish_button() {
    rp.toFinish();
    UtilityClass.getWait();
    UtilityClass.toTakeScreenShot(driver);
}

@Then("user redirected to checkout complete page")
public void user_redirected_to_checkout_complete_page() {
	Assert.assertFalse(!driver.getCurrentUrl().contains("checkout-complete"));
	System.out.println("user compleated booking product");
}

}
