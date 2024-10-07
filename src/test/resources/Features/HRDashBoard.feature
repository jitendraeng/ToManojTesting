Feature: HRMS Tools  functionality verifications

  Scenario Outline: HRMS Tools HR DashBoard Functionality
  
    Given Employee on login page
    When Enter EmpUsername "<Username>"
    And Enter EmpPassword "<password>"
    Then Enter login button 
    Then Verify Employee Dashboard page
    Then verify the HR Dashboard page title
    Then verify the tool bar details
    Then print the database table
    Then click on view button
    Then verify the candidates name
        
   
    Examples: 
      | Username  | password | 
      | jitendra@singhsoft.com  |  123Yadav@ | 
    
      
