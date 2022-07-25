package com.mvncommands;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SendDataFromCmdTest {
	
	@Test
	public void sendData() {
		String browser = System.getProperty("browser");
		String url = System.getProperty("URL");
		Reporter.log(browser, true);
		Reporter.log(url, true);
		Reporter.log(browser, true);
		Reporter.log(url, true);
	}

}
