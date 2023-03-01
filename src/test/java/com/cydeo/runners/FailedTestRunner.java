package com.cydeo.runners;


/*
This is the class to run ONLY and ONLY FailedTest


 */

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features="@target/rerun.txt",
        glue="com/cydeo/step_definitions"
)
public class FailedTestRunner {



}
