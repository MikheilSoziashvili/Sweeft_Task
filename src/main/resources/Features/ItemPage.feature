Feature: Item page, adding to cart checking prices and quantity

  Scenario: Navigating to item page checking details and adding to cart
    Given User navigates to item page
    Then details should be same as previous page
    And when clicking add to cart notification should be present and quantity should be 1

