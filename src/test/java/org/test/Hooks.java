package org.test;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import io.cucumber.core.api.Scenario;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hooks  {

WebDriver driver;
@After
public void ss(Scenario s) {
	
	if (s.isFailed()) {
		
		TakesScreenshot t = (TakesScreenshot)driver;
		byte[] snap = t.getScreenshotAs(OutputType.BYTES);
		s.embed(snap, "image/png");
	}
}

@Before
public void testcase() {
	System.out.println("TestCase:1");
}

}
