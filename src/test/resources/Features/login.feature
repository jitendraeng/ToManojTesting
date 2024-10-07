
Feature: HRMS Tools functionality verifications

  Scenario Outline: HRMS Tools Valid Login Functionality
  
    Given Employee on Login page
    Then Enterusername "<Username>"
    Then Enterpassword "<password>"
    Then Enter Login button 
    Then Employee on Emp. dashboard page
   
    Examples: 
      | Username  | password | 
      | jaideep.s@singhsoft.com  |     Jai@123 | 
    
      
