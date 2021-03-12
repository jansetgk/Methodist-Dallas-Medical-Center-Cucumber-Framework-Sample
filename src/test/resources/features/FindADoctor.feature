#Author: janyz3940@gmail.com

Feature: Find a doctor

  Background: 
    Given I go to find a doctor page

  #@smoke
  #Scenario Outline: Find a specialist
    #Then I enter specialty  "<speciality>"
    #Then I enter "<name>"
    #And I click  the doctor I  found
    #And i verify if he speaks "<lunguage> "
#
    #Examples: 
      #| speciality          | name                | language               |
      #| Hematology/Oncology | Maryada S. Reddy    | Hindi, Spanish, Telugu |
      #| Orthopedics         | Miguel A. Hernandez | English                |
      #| Podiatry            | Dan E. Jones        | English                |

  @smoke
  Scenario: Find a doctor with given properties
    When I enter doctor's deatails
      | SPECIALTY       | LOCATION | ZipCode | LANGUAGE | GENDER |
      | Family Medicine | 25 miles |   75094 | Spanish  | Female |
    And I click  the doctor I  found
