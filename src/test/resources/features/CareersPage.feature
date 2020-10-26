
@tag
Feature: Career page
  I want to use this template for my feature file

	Background:
		Given I click Careers link
		And I click search our career opportunities
		And I choose location
    And I choose Catagory
    And I click Search bottom
	
  @tag1
  Scenario: Search for a job 
   When I cilck the first job appears on the list
   And I click the Apply bottom
   Then I see Sign In page
   
  @tag2
  Scenario: Search Current Openings
    When I choose the Department
    And I fill What and Where
    And I click search
    Then I see the results

    
