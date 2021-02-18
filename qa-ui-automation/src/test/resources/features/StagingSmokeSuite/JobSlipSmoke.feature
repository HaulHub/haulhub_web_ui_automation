@tag
Feature: JobSlip Smoke Test Suite

  @JOBSLIPSMOKETESTSUITE
  Scenario Outline: Feed page Search
  	Given JobSlip user Login to the application with valid <userName> and <password>
  	Then I search by Start date <sDate> and End date <eDate> in Feed page 
 	
 	Examples:
     | userName | password    |  projectName               |projectNumber|   projectMaterial|producer       | startDate |truckNo|sDate   |eDate   |
     |2025550181|QualityHH!21 |AA 4446&9717514 I-16 ANSHU  |54321        |12.5 MM SP W/LIME |anshumancompany|1/1/2021   |ANSH   |1/5/2021|1/6/2021|
      	 	
#  @JOBSLIPSMOKETESTSUITE
#  Scenario Outline: My Project page Search
#  	Given I navigate to My Projects page
#  	Then I search by project name <projectName>
#  	Then I search by project number <projectNumber>
#  	Then I search by project material <projectMaterial>
#  	Then I search by producer <producer>
#  	Then I search by truck number <truckNo>
#  	Then I search by start date <startDate>
#  
#   	Examples:
#     | userName | password    |  projectName               |projectNumber|   projectMaterial|producer       | startDate |truckNo|sDate   |eDate   |
#     |2025550181|QualityHH!21 |AA 4446&9717514 I-16 ANSHU  |54321        |12.5 MM SP W/LIME |anshumancompany|1/1/2021   |ANSH   |1/5/2021|1/6/2021|
#          
#     @JOBSLIPSMOKETESTSUITE
#  Scenario Outline: View project search in My Project
#  	Given I navigate to view projects in My projects
#  	Then I search in view project by project name <projectName> 
#  	Then I search in view project by producer <producer>
#  	Then I search in view project by startDate <startDate>
#  	Then I search in view project by truck <truckNo>
##  	Then I search in view project by ticket number <ticketNo>
##  	Then I search in view project by product <product>  ---Need to confirm test data seed or not---
#  
#   	Examples:
#     | userName | password    |  projectName               |projectNumber|   projectMaterial|producer       | startDate |truckNo|ticketNo|product|
#     |2025550181|QualityHH!21 |AA 4446&9717514 I-16 ANSHU  |54321        |12.5 MM SP W/LIME |anshumancompany|1/1/2021   |ANSH   |44008475|ABC |