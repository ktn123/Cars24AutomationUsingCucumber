@Search-Cars
Feature: Acceptance testing to validate Search car page is working fine.
  In order to validate
  the Search Car page is working fine
  we will do the acceptance testing

  @Search-Cars-Positive
  Scenario: Validate search cars page
    Given I am on the Home Page "https://cars24.com"
    Then I select the city as "Mumbai"
    Then I move to Buy Used Car page
    And fill in the city as "Mumbai"
    And select By Budget as "2 - 5 Lakhs"
    And fill By Brand or Model as "ford"
    Then I should see the list of searched cars
    And the page title should be "Used cars between 2-5 Lakhs in Mumbai"
   