 @tag
Feature: DelDOT Inspector Test Suite

  @DELDOTINSPECTORTESTSUITE
  Scenario Outline: Feed page Search
  	Given Inspector Login to the application with valid <userName> and <password>
  	Then I validate assigned project is displayed in projects page <projName>
  	Then I validate archived project is displayed in archived projects <projName>
	Then I validate completed project functionality in projects <projName>		
  	Then I search by <staffName> and validate staff <staffRole> and <staffPhone> in projects 
  	Then I validate displayed data in slip card
  	 		
 	Examples: 
     |userName   |password    |projName                 |staffName                 |staffRole   |staffPhone  |
     |13125550001|!Password21 |DelDOT TESTING PROJECT 01|TestAreaManager DOTTesting|Area Manager|+13125552222|
     
  @DELDOTINSPECTORTESTSUITE
  Scenario Outline: Slip card filtering
  	Then I filter by ticket number in slip card <ticketNo>
  	Then I filter by contractor in slip card <contractor>
  	Then I filter by supplier in slip card <supplier>
  	Then I filter by material in slip card <material>
  	
  	Examples: 
     |ticketNo|contractor                                      |supplier            |material|
     |260426  |Granite Construction Company - Pacific Northwest|Granite Construction|1/2"RAP |	 	