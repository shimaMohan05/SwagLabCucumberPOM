Feature: SwagLab end to end testing

  Scenario: Check the inventory page
    Given user is logged into swaglab application
    When check the products in the inventory page
    And click on the cart button for the product "Sauce Labs Backpack"
    And then click on cart icon
    Then user can entered into cart page
