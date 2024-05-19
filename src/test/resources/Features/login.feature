
Feature: Testing the login page
Scenario Outline: Testing login page with different set of credentials
Given open swaglab application
When Enter "<username>" and "<password>"
And click on login button
Then valid users can able to enter into inventory page 



Examples: 
|username|password|
|standard_user|secret_sauce|
|admin|admin|
|locked_out_user|secret_sauce|
|Shima|shima123|
|performance_glitch_user|secret_sauce|

