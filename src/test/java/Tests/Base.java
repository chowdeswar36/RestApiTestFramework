package Tests;

import java.io.IOException;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import Requests.RequestFactory;
import io.restassured.RestAssured;
import utilities.ReadConfig;

public class Base {
	ReadConfig readConfig;
	RequestFactory requestFactory;

	@BeforeClass
	public void setUp() throws IOException {
		requestFactory = new RequestFactory();
		readConfig = new ReadConfig();
		readConfig.loadFile();
		RestAssured.baseURI = readConfig.getBaseUri();
	}

	@AfterClass
	public void tearDown() {
		RestAssured.reset();
	}
}
