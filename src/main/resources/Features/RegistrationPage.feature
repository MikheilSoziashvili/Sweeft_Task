Feature: Creating account, strong password, checking filled out details

  Scenario: creating account with strong passwords and checking details
    Given user clicks on create an account button
    Then filled out information must be correct
    When User enters password and confirmation
    Then password strength must show strong