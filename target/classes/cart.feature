Feature: Cart page test
  Background:
    Given the home page is opened

    Scenario: Shopping cart is empty
      Given the cart link is clicked
      Then the "Your shopping cart is empty." error message is shown in cart

    Scenario: Successfully add to cart
      Given  the add to cart button is clicked
      Then the "Product successfully added to your shopping cart" check is shown


    Scenario: Order by bank wire
        Given the add to cart button is clicked
        And the proceed to checkout link is clicked
        And the proceed to checkout button1 is clicked
        And the email field is filled with 's2@gmail.com' in sign in form
        And the password field is filled with '12345' in sign in form
        And the sign in button is clicked
        And the proceed to checkout button2 is clicked
        And the terms agreement is checked
        And the proceed to checkout button3 is clicked
        And the pay by bank wire is clicked
        And the confirm order button is clicked
        Then the 'Your order on My Store is complete.' message is shown when bank transfer completed

    Scenario: Order by check
      Given the add to cart button is clicked
      And the proceed to checkout link is clicked
      And the proceed to checkout button1 is clicked
      And the proceed to checkout button2 is clicked
      And the terms agreement is checked
      And the proceed to checkout button3 is clicked
      And the pay by check is clicked
      And the confirm order button is clicked
      Then the 'Your order on My Store is complete.' message is shown when Check transfer completed

    Scenario: Cart empty
      Given the add to cart button is clicked
      And the proceed to checkout link is clicked
      And the remove item link is clicked
      Then the '' error message is shown in cart



