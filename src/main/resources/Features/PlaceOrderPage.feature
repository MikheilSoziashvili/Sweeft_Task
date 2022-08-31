Feature: placing order, checking order number and confirming email receipt

Scenario: placing order, checking order number and confirming email receipt
Then details should be correct
Given User clicks place order button
Then order number and email receipt must be correct