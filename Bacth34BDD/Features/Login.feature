Feature: Login Functionality

Scenario: Login with valid Crendentials

 Given User Launch Browser
 When User Open URL "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com"
 And User enters Email as "shubhamshedge810@gmail.com" and Password as "AdminShubham@123"
 And Click on Login button
 Then Page Title Should be "My learning | W3Schools"
 When User Click on Logout link
 Then Page Title Should be "Log in - W3Schools"
 And Close Browser
 
 Scenario Outline: Login with valid Crendentials DDT
 Given User Launch Browser
 When User Open URL "https://profile.w3schools.com/log-in?redirect_url=https%3A%2F%2Fmy-learning.w3schools.com"
 And User enters Email as "<email>" and Password as "<password>"
 And Click on Login button
 Then Page Title Should be "My learning | W3Schools"
 When User Click on Logout link
 Then Page Title Should be "Log in - W3Schools"
 And Close Browser
 
 
 Examples:
|email|password|
|shubhamshedge810@gmail.com|AdminShubham@123|
|shubhamshed@gmail.com|AdminS123|

