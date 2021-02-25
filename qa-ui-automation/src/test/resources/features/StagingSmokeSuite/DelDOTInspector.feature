@tag
Feature: DelDOT Inspector Test Suite

  @DELDOTINSPECTORTESTSUITE
  Scenario Outline: Feed page Search
  	Given Inspector Login to the application with valid <userName> and <password>
  		
 	Examples: 
     |userName   |password    | 
     |3125559999| !Password21 |      	 	