Feature: Navigating to bags page, checking breadcrumbs

  Scenario: navigating checking and doing some filters
    Given User navigates to bags page
    Then breadcrumbs should be correctly written
    And User chooses filter hiking in activity, amount should be same as shown in hiking