Feature: checkout purchases orders

  As a user
  I want to check out my purchases
  To know the complete information about the orders

  Background:
    Given the user is logged into the automation practice page
      | emailAddress             | password |
      | andres_f0818@hotmail.com | Komet123 |


  @CheckoutOrder
  Scenario: complete a product checkout
    When add a product to the cart
      | size | colour | discount |
      | L    | Green  | 20       |
    And complete a product checkout
    Then he can see the order information
