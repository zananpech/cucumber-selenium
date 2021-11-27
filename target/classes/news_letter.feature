Feature: News letter subscription test
  Background:
    Given the home page is opened

  Scenario Outline:
    Given the email field is filled with '<parameter>'
    When the submit news letter button is clicked
    Then the '<msg>' error message is shown
    Examples:
      | parameter    | msg                                                    |
      | s2@gmail.com | Newsletter : This email address is already registered. |
      |              | Newsletter : Invalid email address.                    |
      | someone      | Newsletter : Invalid email address.                    |
      | valid@.com   | Newsletter : Invalid email address.                    |




