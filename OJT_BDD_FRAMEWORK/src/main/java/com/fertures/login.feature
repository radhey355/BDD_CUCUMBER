Feature: JBK offline application test

Scenario: Login Test

Given user should be on login page
When  user enters valid credentials
Then  user should be on home page

Scenario: Logo Verify

Given user should be on login page
Then  user should see the logo

Scenario: Register New Account

Given user should be on login page
When  user click on New Register
Then  user should be on register page

