@regression
@tag
Feature: LoginMyChart


  @tag1
  Scenario: See test result from mychart
    Given I click MyChart
    And I click Existing User
    When I give my username and pasword
    And I click submit
    And I click View Test Results
    Then I see Test Results page
   

