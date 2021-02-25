@tag
Feature: DelDOT Area Manager Test Suite

  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Feed page Search
  	Given Area Manager Login to the application with valid <userName> and <password>
  		
 	Examples: 
     |userName   |password    | 
     |3125559999| !Password21 | 