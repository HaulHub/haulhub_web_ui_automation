@tag
Feature: Read-Only User Test new

  @Read-Only
  Scenario Outline: Check accessibility in main navigation for the Read-only user
    Given admin Login to the application with valid <userName> and <password>
    And I search for ReadOnlycustomer <ROcustomername> and login to the customers portal
    When I Check Im navigated to Job Board page
    Then I check available access to the Read-only user
    Then I check accessibility of file export function
    Then I navigate back to Jobboard page
    Then I check accessibility of Main link
    Then I check visibility of Notify Reserved button in Jobboard page
    When I filterd by Upcoming status
    And I click on a job number
#    Then I check vsibility of Cancel Rebook EditShiftSchedule EditShift AddShift CancelShift buttons

    Examples:
      | userName | password                 | ROcustomername |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | vigneshcompany |
