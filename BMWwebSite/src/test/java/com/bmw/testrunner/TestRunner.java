package com.bmw.testrunner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"C:\\Users\\hp\\eclipse-workspace\\BMWwebSite\\src\\main\\resources\\features"},
		glue = {"com.bmw.stepdefinition"},
		plugin = {"html:reports/","pretty"}
		)

public class TestRunner {

}
