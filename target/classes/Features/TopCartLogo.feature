Feature: User clicks on top cart logo, checks quantity and details

  Scenario: Clicking on top cart logo and checking details
    Given User clicks on top cart logo
    Then product details must be correct
    And user clicks on proceed to checkout button