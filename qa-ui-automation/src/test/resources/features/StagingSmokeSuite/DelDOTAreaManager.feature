@tag
Feature: DelDOT Area Manager Test Suite

  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Feed page Search
  	Given Area Manager Login to the application with valid <userName> and <password>
  	Then I validate assigned project is displayed in projects page <projName>
  		
 	Examples: 
     |userName   |password    |projName| 
     |3125559999| !Password21 |Plant 48 - Macon| 