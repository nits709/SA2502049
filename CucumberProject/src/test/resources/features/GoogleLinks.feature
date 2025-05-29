@AllLinks
Feature: this files hold the functionality of google home page links

  Background: 
    Given I open GooglePage "https://google.co.in"

  @Gmail @Smoke
  Scenario: Test Gmail Link
    When I Click on Gmail Link
    Then Gmail Page should be opened
    When Close Browser

  @Images @Smoke
  Scenario: Test Images Link
    When I click on Image Link
    Then Gmail Image page should be displayed
    When Close Browser

  @Advert @Sanity
  Scenario: Test Advert Link
    When I click on Advert Link
    Then Advert page should be displayed
    When Close Browser

  @Business @Sanity
  Scenario: Test Business Link
    When I click on Business Link
    Then Business page should be displayed
    When Close Browser
