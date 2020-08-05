@tag
Feature: singletest.feature

   @SINGLE
    Scenario Outline: Validate ability to Create Material order and Add trucks,fleets and be able to validate sent SMS messages to Truck drivers after 
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       Given I click the New Order button
       When I click Materials Only button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> and details and Place order
       And I grab the Orderid associated with the newly created offer
       And I click Truck Scedule page and click Add Trucks against my created order
       And I fill the Truck form details worktype<WorkType> and Acceptabletrucktypes <Acceptabletrucktypes> and Trucksrequired<Trucksrequired> and Truckbilling<Truckbilling> details
       When I enter FleetPriority <fleetpriority> and Fleet <Fleet> and click sendinvites button
       Then I see a message notification sent to Driver for acceptance
      
    Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate       | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver            |              1 | vigneshcompany | VigneshCompany | VigneshCompany |

   @FOBSMOKEDEFAULTVIEWTESTSUITE
     Scenario Outline: Validate ability to Click Truck Report and send automated email report to Receipient and Reset to original status
      And I click Truck report in truck scedule page
      And I select add a receipient or select an existing recepient and send truck report to the recepient
      And I click Truck report in truck scedule page
      And I reset the truckreport to original status
      
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
    