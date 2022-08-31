Feature: sorting, filtering and checking hovered product buttons

Scenario: Sorting by price checking it and also checking item buttons after hover
Given User sorts items by price
Then first item should cost less then last
When User hovers on first item
Then Add to Cart, Add to Wish List, Add to Compare buttons should be visible