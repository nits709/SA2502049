Feature: the

  Scenario Outline: To validate the login functionality with invalid credentails
    Given The user launch the application URL "<URL>"
    When The User enter email "<Username>" and password "<Password>"
    
     Examples: 
      | URL                                  | Username                | Password  |
      | https://automationexercise.com/login | nitingupta3005@gmail.com | Smart@123 |