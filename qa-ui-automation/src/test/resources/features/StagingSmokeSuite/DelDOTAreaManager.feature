@tag
Feature: DelDOT Area Manager Test Suite

  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Project page functionality
  	Given Area Manager Login to the application with valid <userName> and <password>
  	Then I validate assigned project is displayed in projects page <projName>
  	Then I validate archived project is displayed in archived projects <projName>
	Then I validate completed project functionality in projects <projName>		
  	Then I search by <staffName> and validate staff <staffRole> and <staffPhone> in projects 
  	Then I validate displayed data in slip card
  	 		
 	Examples: 
     |userName   |password    |projName                 |staffName     |staffRole   |staffPhone  |
     |3125552222| !Password21 |DelDOT TESTING PROJECT 01|TestAreaManager DOTTesting|Area Manager|+13125552222|
     
  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Slip card filtering
  	Then I filter by ticket number in slip card <ticketNo>
  	
  	Examples: 
     |userName   |password    |projName                 |staffName     |staffRole   |staffPhone  |
     |3125552222| !Password21 |DelDOT TESTING PROJECT 01|TestAreaManager DOTTesting|Area Manager|+13125552222|