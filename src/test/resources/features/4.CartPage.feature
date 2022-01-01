Feature: Cart Page

Scenario: Testing to Cart Page
		When User click Cart Page and click Proceed to checkout
		When User input billing detail and click Place Order
		Then User go to order details