package org.tset;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MainClass extends BaseClass{
	@BeforeClass
	public static void beforeClass() {
		browserConfigChrome();
		openUrl("https://omrbranch.com/");
		maximize();
		implicitWait();
	}
	@Test
	public void login() throws IOException {
		LoginPage loginpage = new LoginPage();
		loginpage.login1(excelRead("C:\\Users\\WESTILYMATTHEW\\eclipse-workspace\\Framework2023\\excel\\Book1.xlsx","Book1", 2, 5), excelRead("C:\\Users\\WESTILYMATTHEW\\eclipse-workspace\\Framework2023\\excel\\Book1.xlsx", "Book1", 2, 7));
	}
	@AfterClass
	public static void afterClass() {
		quit();
	}
}
