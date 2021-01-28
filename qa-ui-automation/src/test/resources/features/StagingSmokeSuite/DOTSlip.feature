@tag
Feature: DOTSlip.feature

  @DOTSLIP
  Scenario Outline: Validate ability to login as First Broker and see the assigned shifts under needs review section under Customer Jobs section
    Given admin Login to the application with valid <userName> and <password>
    And I search for DOTSlipEmployee <dotslipemployee> and login to the Dotslip portal
    And I validate the appearance of headers like Today and MyProjects Feed and click Gear Icon

    Examples: 
      | userName | password          | dotslipemployee | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | 0$B4h1rn3XG_gZS+mF-PitDf | Vignesh       | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |

  @DOTSLIP
  Scenario Outline: Validate on clicking TODAY link loads the the associate Url page related to TODAY within DOTSlip
    And I click the Today link within DOTSlip page loads the associated TODAY page

    Examples: 
      | userName | password          | dotslipemployee | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | Vignesh          | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |

  @DOTSLIP
  Scenario Outline: Validate on clicking MYPROJECTS link loads the the associate Url page related to MYPROJECTS within DOTSlip
    And I click the MYPROJECTS link within MYPROJECTS page loads the associated MYPROJECTS page

    Examples: 
      | userName | password          | dotslipemployee | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | Vignesh           | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |

  @DOTSLIP
  Scenario Outline: Validate on clicking FEED link loads the the associate Url page related to FEED within DOTSlip
    And I click the FEED link within DOTSlip page loads the associated FEED page

    Examples: 
      | userName | password          | dotslipemployee | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | Vignesh          | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |

    @DOTSLIP
  Scenario Outline: Validate ability to filter by Contractorname within MYPROJECTS and filtered results display correctly without returning empty table
    And I select the contractorname <contractorname> click update results button and validate the results are filtered correctly
   
    Examples: 
      | userName | password          | contractorname | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | 	vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |
   
     @DOTSLIP
  Scenario Outline: Validate on clicking the view associated to Contractorname Invite button associated to the Contractor appears correctly
    And clicking the contractorname <contractorname> displayed and check invite button appears correctly
    And I am able to click the invite button and enter the details for invite and send invite
   
    Examples: 
      | userName | password          | contractorname | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | vigneshcompany  | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |
   
   
  @DOTSLIP
  Scenario Outline: Validate ability to filter by ticket number within FEED and filtered results display correctly without returning empty table
    And I search with ticketnumber <ticketnumber> click update results button and validate the results are filtered correctly
   
    Examples: 
      | userName | password          | ticketnumber | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | 22084026     | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |
   
   
    @DOTSLIP
  Scenario Outline: Validate appearence of reject button and Mark delivered button associated to Feed Ticketnumber and ability to download selected report
    And I clicking the ticketnumber <ticketnumber> could view the reject delivered button associated to Feed Ticketnumber and downloadreport
   
    Examples: 
      | userName | password          | ticketnumber | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          | firstBroker    |
      | vignesh  | haul-Quality!0501 | 22084026     | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver                |              1 | vigneshcompany | VigneshCompany | VigneshCompany | Vigneshbroker1 |
   