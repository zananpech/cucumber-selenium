Feature: Create account test
  Background:
    Given the home page is opened
    And the sign in link is clicked

    Scenario: Account already exists
      Given create account email field is filled with "s2@gmail.com"
      And create account button is clicked
      Then the 'An account using this email address has already been registered. Please enter a valid password or request a new one.' message is shown

    Scenario Outline: Invalid email address
      Given create account email field is filled with "<parameter>"
      And create account button is clicked
      Then the 'Invalid email address.' message is shown
      Examples:
        | parameter    |
        |              |
        | aa           |
        | invalid@.com |

