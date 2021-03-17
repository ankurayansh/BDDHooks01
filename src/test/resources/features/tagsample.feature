@FunctionTest
Feature: FreeeCRM Application

Background: Valid Login
Given User is on login page background


@SmokeTest @RegressionTest
Scenario: Valid Login
Given User is on login page

@SmokeTest
Scenario: Invalid Login
Given User enters valid crdentials
When User enters invalid cred

@SmokeTest
Scenario: Valid Login
Given User is on Task Page

@SmokeTest
Scenario: Create a deal
Given User is on Deal Page

@RegressionTest
Scenario: Create a deal
Given User is on Deal Page

@RegressionTest
Scenario: logout
Given User is logged out

