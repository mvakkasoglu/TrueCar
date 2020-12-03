@truecar
Feature: Shop new car
  This feature tests shopping for new car

  Background: 
    Given User is on truecar home page

  Scenario: Shop for new car with BMW brand
    Given User clicks on Shop New button
    Then User clicks on brand "BMW"
    Then User selects model "m5"
    Then User enters sip code "02180"
    Then User clicks Next button
    Then User clicks Next button to continue
    Then User clicks on Skip for Now
    And Verify header is "Your 2021 BMW M5"
    And Verify Style is "Sedan"
    And Verify Standard Features & Specs contains "Gas 4.4L V8"
