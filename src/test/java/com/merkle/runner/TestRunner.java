package com.merkle.runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features", //or "classpath:features"
        glue = "com.merkle.step_definitions",
        dryRun = false,
        plugin = { "pretty",
                "html:target/cucumber.html"
                ,"me.jvt.cucumber.report.PrettyReports:target"
        },
        tags = "@smoke"
)
public class TestRunner {



}
