package week3day3;

public class APIClient {
	public void sendRequest(String endPoint) {
		System.out.println("API endpoint type refers to: "+ endPoint);
	}
    public void sendRequest(String endPoint, String requestBody, boolean requestStatus) {
		System.out.println("Endpoint--RequestBody--RequestStatus:: "+endPoint+ "--"+ requestBody+ "--"+ requestStatus);
	}

	public static void main(String[] args) {
		APIClient object = new APIClient();
		object.sendRequest("the Hostname of the API");
		object.sendRequest("EndPoint", "RequestBody", true);

	}

}
