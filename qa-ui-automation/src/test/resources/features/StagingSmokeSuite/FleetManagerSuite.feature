@tag
Feature: FleetManagerSuite.feature
 
     @FLEETMANAGERSUITE
     Scenario Outline: Login as Customer click Fleetmanager and check Fleet manager link loaded properly.
       Given Login to the application with valid <userName> and <password> 
       And I see Job board link loaded by default
       And I click FleetManagerlink and see the FleetManager page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
                  
      @FLEETMANAGERSUITE
      Scenario Outline: Validate fleetdetails tab displays correct p.no, address ,contact number,USDOT Compliance Details
       And I click Fleetdetails <customername> tab and validate p.no, address ,contact number,USDOT Details are displayed correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
                   
      @FLEETMANAGERSUITE
      Scenario Outline: Validate Add Insurance opens new modal window and displays types, coverages, agents and supporting document Compliance Details
       And click Add insurance button displays types,coverages,agents and supporting document Compliance Details
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
                               
      @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to  click contract Add document button and it launced correctly
       And click add contract document btn displays Add Contract new modal window
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
       
       @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to  click monitoring header Add Report launches Add report window
       And click monitoring header Add reports that launches New Monitoring report window
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
        @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to click Documents header Add documents launches Add document window
       And click Documents header Add documents launches Add document window
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
       @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to click Drivers header and see Drivers label loaded correctly
       And click Drivers header Add see Drivers Label loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
         @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to click Trucks header and see Trucks label loaded correctly
       And click Trucks header and see Trucks label loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
      
        @FLEETMANAGERSUITE
      Scenario Outline: Validate Ability to  click insurance agent button and add insurance compliance details
       And click insurance agent button and add insurance compliance details
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |