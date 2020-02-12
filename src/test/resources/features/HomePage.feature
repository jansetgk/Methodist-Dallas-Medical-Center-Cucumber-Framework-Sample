@smoke
Feature: HomePage
  
  @regression
  Scenario: clickAboutOurFacility
  Given I open browser and navigate to the MDMC
  When I click on AboutOurFacility button
  And I click on AboutMethodistHealthSystem Button
  Then I close browser 
  