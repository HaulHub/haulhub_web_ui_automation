@tag
Feature: TransporationSmokeTabnavigation.feature
 
     @TRANSPORTSMOKETABNAVIGATIONS
     Scenario Outline: Login as Customer and JobManagement loads as default under Transport modules
       Given Login to the application with valid <userName> and <password> 
       And I see Job board link loaded by default
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
                  
     @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking Book Job link and see the Book Job label page loaded correctly
       And I click Book Job and link and see the Book a New lable page loaded correctly
    
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
       
     @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking DailyLineup link and see the BookShifts label page loaded correctly
       And I click DailyLineup and link and see the BookShifts label page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
                  
     @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking JobBoard link and see the JobBoard label page loaded correctly
       And I click Jobboard  link and see the JobBoard New lable page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
                              
      @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking Timesheets link and see the Timesheets label page loaded correctly
       And I click timesheets link and see the Timesheets lable page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
      @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking tickets link and see the tickets label page loaded correctly
       And I click Tickets link and see the Tickets lable page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
            
      @TRANSPORTSMOKETABNAVIGATIONS
      Scenario Outline: Validate on clicking plants link and see the plants label page loaded correctly
       And I click plants link and see the plants lable page loaded correctly
      
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
          
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking MicSites link and see the MicSites label page loaded correctly
       And I click MiscSites link and see the MicSites lable page loaded correctly
      
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking Invoices link and see the Invoices page loaded correctly
       And I click Invoiceslink and see the Invoices page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
         
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking CertifiedPayrolls link and see the CertifiedPayrolls page loaded correctly
       And I click CertifiedPayrollslink and see the CertifiedPayrolls page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
           
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking DOTManagment link and see the DOTManagment  page loaded correctly
       And I click DOTManagmentlink and see the DOTManagment page loaded correctly
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking Fleet Manager link and see the Fleet Manager  page loaded correctly
       And I click FleetManagerlink and see the FleetManager page loaded correctly
   
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
       
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking Fleet Manager link and see the Fleet Manager  page loaded correctly
       And I click FleetManagerlink and see the FleetManager page loaded correctly
   
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70  |
          
       @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking Contractor scroing link and see the Contractor scroing  page loaded correctly
       And I click Contractorscroinglink and see the Contractorscroing page loaded correctly
   
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
         
         
      @TRANSPORTSMOKETABNAVIGATIONS
       Scenario Outline: Validate on clicking what new  link and see the  whatnew  page loaded correctly
       And I click  whatnewlink and see the whatnewlinkpage loaded correctly
      
   
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
          
          
          
          
          