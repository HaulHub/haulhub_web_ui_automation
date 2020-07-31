@tag
Feature: singletest.feature

     
   @SINGLE
    Scenario Outline: Validate ability to Rebook a MaterialOnly Job and preloaded order details appeares correctly and Reject a Job 
       Given Login to the application with valid <userName> and <password>
       And I click the OrderDashboard link in FOB home page 
       And I click the New Order button
       When I click Materials Only button in the New Order dialog box
       And I fill order details for CustomerName <customername> and StartingLocation <startlocation> details
       And I fill Load Today date time and Continue to Destination filling tab
       And I fill Destination Tab field destination <destination> and contactnumber <contactnumber> and address <address> details 
       And I fill Material tag field Tonnage <Tonnage> and ProductionRate <ProductionRate> and details and Place order
       And I click GotoToday Link View the OrderDetails and Click Rebook Orderbutton
       Then I should see Book new Material Order form
       And I should see presaved customername<customername> and startinglocation<startlocation> loaded during rebooking
       And I click Cancel button in Book new Material Order form
       And I Reject the Order and check the Total Tons set to Zero
       
       Examples:
       | userName    | password     |customername|startlocation| destination  | contactnumber       | address                              |   Tonnage | ProductionRate |                                                                               
       | 8572688987  | haul-Quality!0501  |vigeshcompany|VigneshPlant| VigneshPlant | 8572688987     | 12 Andover Road, Billerica, MA, USA  |   1       |      1         |
   