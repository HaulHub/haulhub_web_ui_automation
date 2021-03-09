@tag
Feature: DelDOT Area Manager Test Suite

  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Project page functionality
  	Given Area Manager Login to the application with valid <userName> and <password>
  	Then I validate assigned project is displayed in projects page <projName>
  	Then I validate inactive project is displayed in archived projects  
	Then I validate completed project functionality in projects <projName>		
  	Then I search by <staffName> and validate staff <staffRole> and <staffPhone> in projects 
  	Then I validate displayed data in slip card
  	Then I logout from DelDOT
  	 		
 	Examples: 
     |userName   |password     |projName                           |staffName     |staffRole   |staffPhone  |
     |3125552222 | !Password21 |DelDOT TESTING PROJECT LIVE TICKETS|Chris Woodside|Area Manager|+12318388573|
     
  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Slip card filtering
    Given Area Manager Login to the application with valid <userName> and <password>
  	Then I filter by ticket number in slip card <ticketNo>
  	Then I filter by contractor in slip card <contractor>
#  	Then I filter by supplier in slip card <supplier>
  	Then I filter by material in slip card <material>
  	
  	Examples: 
     |userName   |password     |ticketNo|contractor     |supplier|material|
     |3125552222 | !Password21 |2147    |HaulHub DOTslip|		 |3 75-V  |