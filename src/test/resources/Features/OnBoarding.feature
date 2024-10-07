Feature: HRMS Tools  functionality verifications

  Scenario Outline: HRMS Tools HR DashBoard Functionality
  
    Given employee on login page 
    When Enter EmpUserName "<Username>" 
    And Enter EmpPassWord "<password>" 
    Then Enter Login Button  
    Then Verify Employee_dashboard page 
    Then verify the HR_dashboard page title 
  Then click on Onboarding link 
  Then click on completed status of employee 
  Then click on view details of employee
        
   
    Examples: 
      | Username  | password | 
      | jitendra@singhsoft.com  |  123Yadav@ | 
    
      
