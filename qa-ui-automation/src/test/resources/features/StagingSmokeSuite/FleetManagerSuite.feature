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
      Scenario Outline: Validate fleetdetails tab displays correct p.no, address ,contact number,USDOT Details
       And I click Fleetdetails <customername> tab and validate p.no, address ,contact number,USDOT Details are displayed correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | Vigneshbroker1 | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |