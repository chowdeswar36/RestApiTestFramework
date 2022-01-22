package Requests;

import Client.RestClient;
import io.restassured.response.Response;

public class RequestFactory {
	RestClient restClient;

	public RequestFactory() {
		restClient = new RestClient();
	}

	public Response getAllProducts(String endpoint) {
		return restClient.sendGetRequest(endpoint);
	}

	public Response getProductById(String endpoint, int id) {
		return restClient.sendGetRequest(endpoint + id);
	}

	public Response AddProduct(String endpoint, Object requestPayLoad) {
		return restClient.sendPostRequest(endpoint, requestPayLoad);
	}

	public Response upadteProductById(String endpoint, int id, Object requestPayLoad) {
		return restClient.sendPutRequest(endpoint + id, requestPayLoad);
	}

	public Response deleteProductById(String endpoint, int deleteId) {
		return restClient.sendDeleteRequest(endpoint + deleteId);
	}

}
