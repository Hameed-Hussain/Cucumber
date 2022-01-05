package org.test;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src\\test\\resources\\datatable.feature"},tags= {"@sanity"},glue= {"org.step"},monochrome=true, 
plugin= {"html:C:\\Users\\Admin\\eclipse-workspace\\CucumberTags\\target",
"junit:C:\\Users\\Admin\\eclipse-workspace\\CucumberTags\\target\\adact1.xml" ,
"json:C:\\Users\\Admin\\eclipse-workspace\\CucumberTags\\target\\adactin1.json"})
public class TestRunner {

}

