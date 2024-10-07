Feature: HRMS Tools reset password functionality verifications


  Scenario Outline: HRMS Tools Valid Reset password Functionality
  
    Given Employee on Login page
    Then Click on Forgot password 
  
    Then Enter "<emailid>" in place holder
    Then Press Continue button
 
    Then Enter Submit button
     Then Enter "<password>" button
      Then REEnter "<password>" button
  Then click on reset password button
     
   
    Examples: 
      | emailid               |password |
      |jitendra@singhsoft.com|123Yadav@|
      
  