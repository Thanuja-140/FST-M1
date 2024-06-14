<<<<<<< HEAD
@activity4
  Feature: Data driven test without Example

    @loginTest @loginSuccess
    Scenario: Testing with correct data from inputs
      Given the user is on the login page
      When the user enters "admin" and "password"
      And clicks the submit button
      Then get the confirmation text to verify message as "Welcome Back, admin"

@loginTest @loginFail
  Scenario: Test with incorrect data from inputs
    Given the user is on the login page
    When the user enters "admin12" and "password12"
    And clicks the submit button
=======
@activity4
  Feature: Data driven test without Example

    @loginTest @loginSuccess
    Scenario: Testing with correct data from inputs
      Given the user is on the login page
      When the user enters "admin" and "password"
      And clicks the submit button
      Then get the confirmation text to verify message as "Welcome Back, admin"

@loginTest @loginFail
  Scenario: Test with incorrect data from inputs
    Given the user is on the login page
    When the user enters "admin12" and "password12"
    And clicks the submit button
>>>>>>> 0bf85d0c67c129fee2699828e997f5bc3b06ab4f
    Then get the confirmation text and verify message as "Invalid Credentials"