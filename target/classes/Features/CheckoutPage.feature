Feature: Checking product, it's details, main fields and placing order

  Scenario: Checking added product, filling email and choosing transportation
    Given User checks product and filling email
    Then User chooses $5 transportation method
    When clicking next
