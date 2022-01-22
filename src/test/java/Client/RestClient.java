package Client;

import io.restassured.response.Response;
import static io.restassured.RestAssured.*;

import io.restassured.http.ContentType;

public class RestClient {

	public Response sendGetRequest(String uri) {
		return given().when().get(uri);
	}

	public Response sendPostRequest(String uri, Object requestPayLoad) {
		return given().contentType(ContentType.JSON).body(requestPayLoad).when().post(uri);
	}

	public Response sendPutRequest(String uri, Object requestPayLoad) {
		return given().contentType(ContentType.JSON).body(requestPayLoad).when().put(uri);
	}

	public Response sendPatchRequest(String uri, Object requestPayLoad) {
		return given().contentType(ContentType.JSON).body(requestPayLoad).when().patch(uri);
	}

	public Response sendDeleteRequest(String uri) {
		return given().when().delete(uri);
	}

}
