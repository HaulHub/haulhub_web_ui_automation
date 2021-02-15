@tag
Feature: Read-Only User Test Plan 

  @Read-Only-User
  Scenario Outline: Check accessibility in main navigation  
    Given admin Login to the application with valid <userName> and <password>
    And I search for ReadOnlycustomer <ROcustomername> and login to the customers portal
    When I Check Im navigated to Job Board page
    Then I check available access to the Read-only user
    
    Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
    
  @Read-Only-User
  Scenario Outline: Job Management - Daily Line Up    
    When I check accessibility of file export function
    Then I navigate back to Jobboard page
    
    Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
    
  @Read-Only-User
  Scenario Outline: Secondary Navigation (Order Dashboard)     
    Then I check accessibility of Main link
    
    Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
    
  @Read-Only-User
  Scenario Outline: Job Management - Job Board (Search by Upcoming status)   
    Then I check visibility of Notify Reserved button in Jobboard page
    When I filterd by Upcoming status
    Then I check visibility of Cancel EditShiftSchedule EditShift AddShift CancelShift buttons
    And I click on a shiftID
    Then I check visibility of Cancel Finish Update Save buttons
    Then I navigate back to Jobboard page
    
    Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
    
  @Read-Only-User
  Scenario Outline: Job Management - Job Board (Search by Draft and Started statuses)   
    When I filterd by Draft status
    Then I check visibility of Cancel Rebook EditShiftSchedule EditShift AddShift CancelShift buttons
    And I click on a job number
    Then I check visibility of Cancel Finish Update Save buttons
	Then I navigate back to Jobboard page
	When I filterd by Started status
    Then I check visibility of Cancel EditJob Rebook EditShiftSchedule EditShift AddShift CancelShift buttons
    And I click on a job number
    Then I check accessibility of Cancel Finish Update Save buttons and Plant Job links
    
    Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
      
  @Read-Only-User
  Scenario Outline: Job Management - Tickets    
	When I navigate to Tickets page
	Then I check Export ticket and ticket matching buttons
	
	 Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |
	
  @Read-Only-User
  Scenario Outline: Order Dashboard
	Then I navigate to OrderDashboard page
	Then I set the date<OrderDate> in OrderDashboard page
	Then I check accessibility of New order and Will call toggle
	When I open a order in New Status and check accessibility of Save and SMS buttons
	Then I open a order in Cancelled Status and check accessibility of Rebook and SMS buttons
	Then I open a order in Accepted Status and check accessibility of Save Request changes Cancel and SMS buttons
	Then I open a order in Accepted w/changes Status and check accessibility of Save Request changes Cancel and SMS buttons
	
	Examples:
      | userName | password                 | ROcustomername | OrderDate |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany | 2021-01-01 |