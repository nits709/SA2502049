Feature: this feature file holds the scenarios of

  #Scenario: To validate the login functionality with valid credentails
    #Given The user launch the application URL "https://automationexercise.com/login"
    #When The User enter email "nitingupta3005@gmail.com" and password "Smart@123"
    #When The User submit the login credentials
    #Then The User validate logged in successfully
#
  #Scenario: To validate the login functionality with invalid credentails
    #Given The user launch the application URL "https://automationexercise.com/login"
    #When The User enter email "nitingupta300@gmail.com" and password "Smart@123"
    #When The User submit the login credentials
    #Then The User validate logged in successfully

  Scenario Outline: To validate the login functionality with invalid credentails
    Given The user launch the application URL "<URL>"
    When The User enter email "<Username>" and password "<Password>"
    When The User submit the login credentials
    Then The User validate logged in successfully
    
    Examples: 
      | URL                                  | Username                | Password  |
      | https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      #| https://automationexercise.com/login | nitingupta300@gmail.com | Smart@123 |
      

    
