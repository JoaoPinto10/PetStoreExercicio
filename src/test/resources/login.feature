@google
Feature: User Login
		
	@chrome
  Scenario Outline: Successful Login
  	Given I have a Selenium using "<browser>"
    And I navigate to the login page
    When the user enters valid login credentials
    And I click on the login button
    Then I should be successfully logged

    Examples: 
      | browser |
      | chrome  |
      
  @firefox
  Scenario Outline: Successful Login
  	Given I have a Selenium using "<browser>"
    And I navigate to the login page
    When the user enters valid login credentials
    And I click on the login button
    Then I should be successfully logged

    Examples: 
      | browser |
      | firefox  |