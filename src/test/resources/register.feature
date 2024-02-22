@google
Feature: User Registration
		
	@chrome
  Scenario Outline: Successful Registration
  	Given I have a Selenium using "<browser>"
    And I navigate to the register page
    When the user enters valid registration details
    And I click on the save account button
    Then I should be successfully registered

    Examples: 
      | browser |
      | chrome  |
      
  @firefox
  Scenario Outline: Successful Registration
  	Given I have a Selenium using "<browser>"
    And I navigate to the register page
    When the user enters valid registration details
    And I click on the save account button
    Then I should be successfully registered

    Examples: 
      | browser |
      | firefox  |    
      
