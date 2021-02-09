@tag
Feature: JobSlip Smoke Test Suite

  @JOBSLIPSMOKETESTSUITE
  Scenario Outline: My Project Search
  	Given JobSlip user Login to the application with valid <userName> and <password>
  	And I navigate to My Projects page
  	Then I search by project name <projectName>
  	Then I search by project number <projectNumber>
  	Then I search by project material <projectMaterial>
  	Then I search by producer <producer>
  
   	Examples:
     | userName | password    |  projectName               |projectNumber|   projectMaterial|producer       |
     |2025550181|QualityHH!21 |AA 4446&9717514 I-16 ANSHU  |54321        |12.5 MM SP W/LIME |anshumancompany|