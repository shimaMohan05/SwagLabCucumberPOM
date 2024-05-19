
Feature: Test the end to end functionality of swaglab functionality
Scenario: Test the checkout page functionality
Given user should be in checkout page
When enter firstname , lastname and zip
|firstname|lastname|zip|
|shima|mohan|560060|
When click on continue button in checkout page
Then user redirected to overview  page

