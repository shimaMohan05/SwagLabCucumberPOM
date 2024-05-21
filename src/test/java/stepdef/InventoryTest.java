package stepdef;

import org.openqa.selenium.WebDriver;
import org.junit.Assert;

import hookspack.ThreadLocalDemo;
import hookspack.UtilityClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pagepack.InventoryPage;
import pagepack.LoginPage;

public class InventoryTest {
public WebDriver driver=ThreadLocalDemo.getdriver();
public LoginPage lp=new LoginPage(driver);
public InventoryPage ip=new InventoryPage(driver);

@Given("user is logged into swaglab application")
public void user_is_logged_into_swaglab_application() {
    lp.toEnterCredentials(UtilityClass.getConfigDetails("uname"), UtilityClass.getConfigDetails("pword"));
    lp.toLogin();
}

@When("check the products in the inventory page")
public void check_the_products_in_the_inventory_page() {
    ip.toSelectItem(UtilityClass.getConfigDetails("product"));
}

@When("click on the cart button for the product {string}")
public void click_on_the_cart_button_for_the_product(String string) {
   ip.toCart();
}

@When("then click on cart icon")
public void then_click_on_cart_icon() {
    ip.toclickCart();
}
@Then("user can entered into cart page")
public void user_can_entered_into_cart_page() {
	 Assert.assertFalse(!driver.getCurrentUrl().contains("cart"));
	  System.out.println("passed");
}

}
