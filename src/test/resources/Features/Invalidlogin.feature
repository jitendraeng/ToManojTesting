Feature: HRMS Tools functionality verifications

    
      
@sanity
  Scenario Outline: HRMS Tools Valid Login Functionality
  
    Given Employee on Login page
    Then Enterusername "<Username>"
    Then Enterpassword "<password>"
    Then Enter Login button 
  
     
   
    Examples: 
      | Username  | password | 
      |           ......      |     Jai@123 | 
      
      
   @regression
  Scenario Outline: HRMS Tools Valid Login Functionality
  
    Given Employee on Login page
    Then Enterusername "<Username>"
    Then Enterpassword "<password>"
    Then Enter Login button 

   
   
    Examples: 
      | Username  | password | 
     | jaideep.s@singhsoft.com  |   .... | 