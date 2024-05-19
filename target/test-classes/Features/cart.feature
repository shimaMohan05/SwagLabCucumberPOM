Feature: test the end to end testing of swaglab
Scenario: test the cart page functionalities
Given user should be in cart page
When click on remove button
Then product will be removed from cart
When click on continue button 
Then user will redirected to inventory page
When user can select new product from inventory page
And  user can click on cart button
Then user rediredted to cart page
When user click on checkout button
Then user will redirected to checkout page  