package Tests;

import java.io.IOException;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

public class ProductTest extends Base {

	@Test(priority = 1)
	public void verifyGetRequest() throws IOException {
		requestFactory.getAllProducts(readConfig.getGetEndPoint()).then().log().all().and().statusCode(200);
	}

	@Test(priority = 2)
	public void verifyGetRequestById() throws IOException {
		requestFactory.getProductById(readConfig.getGetEndPoint(), readConfig.getGetId()).then().log().all().and()
				.statusCode(200);
	}

	@Test(priority = 3)
	public void verifyPostRequest() throws IOException {
		JSONObject reqparams = new JSONObject();
		reqparams.put("id", 3);
		reqparams.put("name", "chowdeswar");
		reqparams.put("loc", "hyderabad");
		requestFactory.AddProduct(readConfig.getPostEndPoint(), reqparams.toJSONString()).then().log().all()
				.statusCode(201);
	}

	@Test(priority = 4)
	public void verifyPutRequest() throws IOException {
		JSONObject reqparams = new JSONObject();
		reqparams.put("id", 3);
		reqparams.put("name", "chowdeswar");
		reqparams.put("loc", "HYDERABAD");
		requestFactory.upadteProductById(readConfig.getPutEndPoint(), readConfig.getPutId(), reqparams.toJSONString())
				.then().log().all().statusCode(200);
	}

	@Test(priority = 5)
	public void verifyDeleteRequest() throws IOException {
		requestFactory.deleteProductById(readConfig.getDeleteEndPoint(), readConfig.getDeleteId()).then().log().all()
				.statusCode(200);
	}

}
