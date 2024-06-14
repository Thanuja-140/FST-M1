<<<<<<< HEAD
@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on Login page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message
    And Close the Browser

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
=======
@activity5
Feature: Data driven test with Example

  Scenario Outline: Testing with Data from Scenario
    Given User is on Login page
    When User enters "<Usernames>" and "<Passwords>"
    Then Read the page title and confirmation message
    And Close the Browser

    Examples:
      | Usernames | Passwords |
      | admin     | password  |
>>>>>>> 0bf85d0c67c129fee2699828e997f5bc3b06ab4f
      | adminUser | Password  |