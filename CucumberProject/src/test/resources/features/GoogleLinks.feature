@AllLinks
Feature: this files hold the functionality of google home page links

  Background: 
    Given I open GooglePage "https://google.co.in"

  @Gmail
  Scenario: Test Gmail Link
    When I Click on Gmail Link
    Then Gmail Page should be opened
    When Close Browser

  @Images
  Scenario: Test Images Link
    When I click on Image Link
    Then Gmail Image page should be displayed
    When Close Browser

  @Advert
  Scenario: Test Advert Link
    When I click on Advert Link
    Then Advert page should be displayed
    When Close Browser

  @Business
  Scenario: Test Business Link
    When I click on Business Link
    Then Business page should be displayed
    When Close Browser
