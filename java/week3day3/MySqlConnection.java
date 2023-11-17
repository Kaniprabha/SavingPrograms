package week3day3;

public abstract class MySqlConnection implements IfDataBaseConnection{
	public void executeQuery() {
		System.out.println("I am from MySqlConnection--abstractClass.");
	}

}
