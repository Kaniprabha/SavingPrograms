package week3day3;

public class JavaConnection2 extends MySqlConnection{
	public static void main(String[] args) {
		JavaConnection2 object = new JavaConnection2();
			object.connect();
			object.disConnect();
			object.executeUpdate();
		

	}

	public void connect() {
		System.out.println("Connect: TurnOn");
		
	}

	public void disConnect() {
		System.out.println("DisConnect: TurnOff");
		
	}

	public void executeUpdate() {
		System.out.println("Updated...");
		
	}

}
