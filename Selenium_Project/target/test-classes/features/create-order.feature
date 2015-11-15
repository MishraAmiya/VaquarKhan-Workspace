Feature: Create Order

  Scenario: Navigate to Create Order
    Given I'm at the index page
    When I click 'Create Order'
    Then I see the create order page

  Scenario: Input Order
    Given I'm at the create order page
    When I enter test 1.0
    Then I'm at the create order page