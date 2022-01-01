Feature: Add to Cart

Scenario: Testing Add to Cart Shoes
		When User click Orders and click Browse Product
		When User click compare click select option and click addtocart
		Then User go to shoes page

Scenario: Testing Add to Cart Glasses
		When User click Search and type glasses
		When User click product click select option and click addtocart
		Then User go to glasses page