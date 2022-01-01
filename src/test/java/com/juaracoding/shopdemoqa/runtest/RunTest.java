package com.juaracoding.shopdemoqa.runtest;

import org.junit.Test;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions (features = "src/test/resources/features", glue = "com.juaracoding.shopdemoqa.glue")
public class RunTest {

	@Test
	public void tests() {
		
	}
}
