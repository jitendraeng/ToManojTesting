Feature: HRMS Tools  functionality verifications

  Scenario Outline: HRMS Tools Emp DashBoard Functionality
  
    Given Employee on Login page
    When Enter Empusername "<Username>"
    And Enter Emppassword "<password>"
    Then Enter Login button 
    Then Verify Employee dashboard page
    Then Verify the ToolBar of emp board
    Then verify the dashboard DatabaseTable
    Then Verify PaySlip title 
    Then verify EmpDashboard Elements List
    Then verify the month year title of calander
   
    
    
    
    
   
    Examples: 
      | Username  | password | 
      | jitendra@singhsoft.com  |  123Yadav@ | 
    
      
