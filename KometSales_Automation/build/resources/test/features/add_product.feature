Feature: add product to cart

  As a user
  I want to add product to cart
  To complete purchases

  @AddProductToCart
  Scenario Outline: add product to cart with active session
    Given the user is logged into the automation practice page
      | emailAddress   | password   |
      | <emailAddress> | <password> |
    When add a product to the cart
      | size   | colour   | discount   |
      | <size> | <colour> | <discount> |
    Then he can see the product information in the cart

    Examples:
      | emailAddress             | password | size | colour | discount |
      | andres_f0818@hotmail.com | Komet123 | L    | Green  | 20       |