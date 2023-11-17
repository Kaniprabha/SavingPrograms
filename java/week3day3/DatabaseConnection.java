package week3day3;

public class DatabaseConnection implements JavaConnection{
	public static void main(String[] args) {
		DatabaseConnection obj = new DatabaseConnection();
		obj.connect();
		obj.disConnect();
		obj.executeUpdate();

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
