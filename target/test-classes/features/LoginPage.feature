Feature: Login to HRM Application 
 
Background: 
   Given User is on Login Page "https://magento.softwaretestingboard.com/customer/account/login/"
  
   @ValidCredentials
   Scenario: Login with valid credentials
      
    When User enters valid email as "lethu@automation.co.za" and password as "_*q._.p-7" and url as "https://magento.softwaretestingboard.com"
    Then User should be able to login successfully and new page open
     
   @InvalidCredentials
   Scenario Outline: Login with invalid credentials
      
    When User enters invalid email as "<email>" and password as "<password>"
    Then User should be able to see error message
     
  Examples:
  | email   					| password  | url 										 |
  | lethu@automations.co.za     | _*q._.p-7 | https://magento.softwaretestingboard.com/	 |
  | letpu@automation.co.za   	| _-q._.p-8 | https://magento.softwaretestingboard.com/	 |
