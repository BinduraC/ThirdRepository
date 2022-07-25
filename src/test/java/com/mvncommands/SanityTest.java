package com.mvncommands;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class SanityTest {
	
	@Test
	public void sanityTesting() {
		Reporter.log("testing sanity", true);
	}

}
