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

<<<<<<< HEAD
private void tc() {
	System.out.println("Tc");

}
=======
@Before
public void testcase() {
	System.out.println("TestCase:1");
>>>>>>> d6d9a671a4c167ad305739187d994c1b97b93456
}

}
