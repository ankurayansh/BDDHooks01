@EndToEndTest
Feature: FreeeCRM Application

@SmokeTest @RegressionTest
Scenario: Valid Login
Given User is on login pageOne

@SmokeTest
Scenario: Invalid Login
Given User enters valid crdentialsOne
When User enters invalid credOne

@SmokeTest
Scenario: Valid Login
Given User is on Task PageOne

@SmokeTest
Scenario: Create a deal
Given User is on Deal PageOne

@RegressionTest
Scenario: Create a deal
Given User is on Deal PageOne

Scenario: logout
Given User is logged outOne

