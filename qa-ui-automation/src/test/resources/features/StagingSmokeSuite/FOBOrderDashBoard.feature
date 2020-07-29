@tag
Feature: FOBOrderDashBoard.feature
 
   @FOBSMOKETESTSUITE
    Scenario Outline: Login as user Create Material only Order Created Successfully and Cancel Order as Material Producer
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       And I click the New Order button
       When I click Materials Only button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details 
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> details and Place order
       And I click the Hide Canceled checkbox 
       And I click GotoToday Link View the OrderDetails and Cancel Order and check order is Cancelled
     
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                             |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987    | 12 Andover Road, Billerica, MA, USA |   100     |      70        |
   
   @FOBSMOKETESTSUITE
    Scenario Outline: Validate ability to Rebook a MaterialOnly Job and Reject a Job as material requestor
       Given I click the New Order button
       When I click Materials Only button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details 
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> and details and Place order
       And I click GotoToday Link View the OrderDetails and Click Rebook Orderbutton
       Then I should see Book new Material Order form
       And I click Cancel button in Book new Material Order form
       And I Reject the Order and check the Total Tons set to Zero
       
       Examples:
       | userName    | password     | customername   |startlocation | destination  | contactnumber | address                              |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  | vigeshcompany | VigneshPlant | VigneshPlant | 8572688987     | 12 Andover Road, Billerica, MA, USA  |   1       |      1         |
   
   
   @FOBSMOKETESTSUITE
    Scenario Outline: Validate ability to Create Materials+Trucks only Order and Scedule the order via  truck Scedule page
       Given I click the New Order button
       When I click MaterialsTrucks button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details
       And I select the Worktype <WorkType> dropdown
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> towards truckform
       And I fill the details Acceptedtrucktypes <trucktypes> and Trucksrequired <truckrequired> and truckbillingperson <truckbillingperson> and place order
       And I click SceduleTrucks and see User navigated to TruckScedulePage 
       And I go to Homedashboard and Cancel the sceduled Order
     
       Examples:
       | userName    | password     | customername   |startlocation       | destination  | contactnumber  | address                               |   Tonnage | ProductionRate | WorkType     | trucktypes | truckrequired  | truckbillingperson |  fleetpriority |                                                                      
       | 8572688987  | haul-Quality!0501  | vigneshcompany | VigneshPlant | VigneshPlant | 8572688987     | 12 Andover Road, Billerica, MA, USA   |   1       |      1         | Construction | Paver    | 10             | vigneshcompany     |  Ami Trucking  |
   
   
   @FOBSMOKETESTSUITE
    Scenario Outline: Validate ability to Create Material order and Add trucks,fleets and be able to validate sent SMS messages to Truck drivers after 
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

 
   @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to Click Truck Report and Select a recepient and send automated email report to Receipient
      And I click Truck report in truck scedule page
      And I select add a receipient or select an existing recepient and send truck report to the recepient
      
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
    
   
   @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to create a Filter by Unfilled shifts  and then send Plant Report to the relevant email id
      And I click Plant Report button in Dashboard page
      When I see the Plant Details page with Preview Autosend and Continue links
      Then I select myplant and click send a report to get acknoledged with send plant confirmation message report

     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
    
    @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to view  order Report view items
      And I see Order Report button in Dashboard page
      And I see Cancel and Preview and Download links avilable in Order Report window page

     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver               |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
      
    @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and Create an equipment successfuly 
      And I Go to Equipments lists page 
      And I Add an Equpment and see the Equpiment added successfully 
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | Paver              |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and edit an equipment successfuly 
     And I Edit update the created equipment and confirms equipment is reflected with updatedname
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
        
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and delete an equipment successfuly 
     And I delete the updated equipment 
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
         
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and Create a Material list successfully
     And I Go to Materials lists page 
     And I Add material and see the material added successfully  
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
         
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and edit the Material created successfully
     And I Edit update the created material and confirms material is reflected with updatedname
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Settings link and delete the Material created successfully
     And  I delete the updated material
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
       
        
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Customers list and Create a new customer via customer portal
     And I Go to Manage Customers page 
     And I Add a new customer and validate the customer was added successfully  
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
             
        
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Customers list and update the created customer with new name
     And I Edit update the created customer and confirms customer is reflected with updatedname
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
      
         
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to go to Customers list and delete the customer name
     And I Delete the updated customer name from the list
   
     Examples: 
      | userName   | password    | customername   | startlocation | destination  | contactnumber | address                             | Tonnage | ProductionRate | WorkType     | Acceptabletrucktypes | Trucksrequired | Truckbilling   | fleetpriority  | Fleet          |
      | 8572688987 | haul-Quality!0501 | vigneshcompany | VigneshPlant  | VigneshPlant |    8572688987 | 12 Andover Road, Billerica, MA, USA |       1 |              1 | Construction | 10 Wheel             |              1 | vigneshcompany | VigneshCompany | VigneshCompany |
                  
             
     @FOBSMOKETESTSUITE
     Scenario Outline: Validate ability to create a JOBsite with Geolocation updated thus validate it is created successfully
      And I click the FOB Materials logo
      And I click add a job site button
      When I enter jobsitename <jobsitename> and onsitecontactname <onsitecontactname> and phonenumber <phonenumber> and address <address> details and save the jobsite
      Then I see the Created Jobsite name appears correctly
    
  
     Examples: 
      | userName   | password          | jobsitename    | onsitecontactname |  phonenumber   | address                             | 
      | 8572688987 | haul-Quality!0501 | vigneshcompany | Vig               |  8572688765    | 12 Andover Road, Billerica, MA, USA |
                 