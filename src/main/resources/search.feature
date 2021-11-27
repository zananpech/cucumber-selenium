Feature: Search engine test
  Background:
    Given the home page is opened

    Scenario: List dress
      Given the search field is filled with 'dress'
      And the search button is clicked
      Then the "Printed Dress" is listed

    Scenario Outline: Invalid search
        Given the search field is filled with '<parameter>'
        And the search button is clicked
        Then the '<msg>' warning message is shown
        Examples:
          | parameter | msg                                        |
          |           | Please enter a search keyword              |
          | aa        | No results were found for your search "aa" |
