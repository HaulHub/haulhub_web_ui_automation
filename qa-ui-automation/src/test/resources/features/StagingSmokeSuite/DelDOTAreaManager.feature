@tag
Feature: DelDOT Area Manager Test Suite

  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Project page functionality
  	Given Area Manager Login to the application with valid <userName> and <password>
  	Then I logout from DelDOT
  	Then I validate assigned project is displayed in projects page <projName>
  	Then I validate archived project is displayed in archived projects <projName>
	Then I validate completed project functionality in projects <projName>		
  	Then I search by <staffName> and validate staff <staffRole> and <staffPhone> in projects 
  	Then I validate displayed data in slip card
  	 		
 	Examples: 
     |userName   |password    |projName                 |staffName                  |staffRole   |staffPhone  |
     |3125552222 | !Password21 |DelDOT TESTING PROJECT LIVE TICKETS|TestAreaManager DOTTesting|Area Manager|+13125552222|
     
  @DELDOTAREAMANAGERTESTSUITE
  Scenario Outline: Slip card filtering
  	Then I filter by ticket number in slip card <ticketNo>
  	Then I filter by contractor in slip card <contractor>
  	Then I filter by supplier in slip card <supplier>
  	Then I filter by material in slip card <material>
  	
  	Examples: 
     |ticketNo|contractor                                      |supplier            |material|
     |260426  |Granite Construction Company - Pacific Northwest|Granite Construction|1/2"RAP |