Feature: Login page test
  Background:
    Given the home page is opened
    And the sign in link is clicked
    And the forget password link is clicked

  Scenario:
    Given the forget email field is filled with "someone@email.com"
    When the retrieve password button is clicked
    Then a confirmation message "A confirmation email has been sent to your address: someone@email.com" is shown

  Scenario Outline:
    Given the forget email field is filled with '<parameter>'
    When the retrieve password button is clicked
    Then the "Invalid email address." error message is shown in forget password form
    Examples:
      | parameter  |
      |            |
      | someone    |
      | valid@.com |




