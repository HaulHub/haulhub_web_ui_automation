@tag
Feature: JobSlip Smoke Test Suite

  @JOBSLIPSMOKETESTSUITE
  Scenario Outline: Feed page Search
  	Given JobSlip user Login to the application with valid <userName> and <password>
#  	Then I search by truck in Feed page <truckNo>
  	Then I search by plant in Feed page <plant>
  	Then I search by Start date <sDate> and End date <eDate> in Feed page 
  	Then I search by supplier in Feed page <supplier>
  	Then I search by project in Feed page <projectName>
	Then I search by product in Feed page <product>
#	Then I search by quantity in Feed page <quantity> -------Quantity Filter is not implemented completely.
	Then I search by ticket no in Feed page <ticketNo>
	Then I search by ticket status in Feed page <ticketStatus>
	Then I search by UOM in Feed page <uom>
  		
 	Examples: 
     |userName   |password    		|projectName              |projectNumber|product           |startDate  |truckNo|sDate    |eDate    |supplier      |plant     |quantity|ticketNo|ticketStatus|uom|
     |12225550189|haul-Quality!0501 |VV 4446&9717514 I-16 VIGN|47830        |12.5 MM SP W/LIME |2/5/2021   |VIGN   |2/5/2021 |2/6/2021 |vigneshcompany|VIGN-Plant|44.66   |22004402|delivered   |TON|
      	 	
  @JOBSLIPSMOKETESTSUITE
  Scenario Outline: My Project page Search
  	Given I navigate to My Projects page
  	Then I search by project name <projectName>
  	Then I search by project number <projectNumber>
  	Then I search by project material <projectMaterial>
  	Then I search by producer <supplier>
  	Then I search by truck number <truckNo>
  	Then I search by start date <startDate>
  	Then I search by plant <plant>and verify with <projectNumber>
  
   	Examples:
    | userName  |password    		|projectName              |projectNumber|projectMaterial   |startDate  |truckNo|sDate    |eDate    |supplier      |plant     |
    |12225550189|haul-Quality!0501  |VV 4446&9717514 I-16 VIGN|47830        |12.5 MM SP W/LIME |2/5/2021   |VIGN   |2/5/2021 |2/6/2021 |vigneshcompany|VIGN-Plant|
           
     @JOBSLIPSMOKETESTSUITE
   Scenario Outline: View project search in My Project
  	Given I navigate to view projects in My projects
  	Then I search in view project by project name <projectName> 
  	Then I search in view project by producer <supplier>
  	Then I search in view project by startDate <startDate>
  	Then I search in view project by truck <truckNo>
  	Then I search in view project by ticket number <ticketNo>
  	Then I search in view project by product <product>  
  
   	Examples:
    | userName  |password    		|projectName              |projectNumber|projectMaterial   |startDate  |truckNo|ticketNo|product|sDate    |eDate    |supplier      |
    |12225550189|haul-Quality!0501  |VV 4446&9717514 I-16 VIGN|47830        |12.5 MM SP W/LIME |2/5/2021   |VIGN   |22004402|47830  |2/5/2021 |2/6/2021 |vigneshcompany|