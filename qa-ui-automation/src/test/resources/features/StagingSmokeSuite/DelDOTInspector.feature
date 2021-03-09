 @tag
Feature: DelDOT Inspector Test Suite

  @DELDOTINSPECTORTESTSUITE
  Scenario Outline: Feed page Search
  	Given Area Manager Login to the application with valid <userName> and <password>		
  	Then I validate displayed data in slip card
  	Then I logout from DelDOT
  	 		
 	Examples: 
     |userName   |password     |projName                           |staffName     |staffRole   |staffPhone  |
     |13125550001|!Password21  |DelDOT TESTING PROJECT LIVE TICKETS|Chris Woodside|Area Manager|+12318388573|
     
  @DELDOTINSPECTORTESTSUITE
  Scenario Outline: Slip card filtering
  	Given Area Manager Login to the application with valid <userName> and <password>
  	Then I filter by ticket number in slip card <ticketNo>
  	Then I filter by contractor in slip card <contractor>
#  	Then I filter by supplier in slip card <supplier>
  	Then I filter by material in slip card <material>
  	
  	Examples: 
     |userName   |password     |ticketNo|contractor     |supplier|material|
     |13125550001|!Password21  |2147    |HaulHub DOTslip|		 |3 75-V  |	