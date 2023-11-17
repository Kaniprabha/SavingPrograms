package week3day3;

public class LoginPage extends BasePage{
	
	 public void performCommonTasks() {
	    	System.out.println("I am from SubClass[LoginPage]--performCommonTasks()");
	    }

	public static void main(String[] args) {
		LoginPage object = new LoginPage();
		object.clickElement();
		object.findElement();
		object.enterText();
		object.performCommonTasks();

	}

}
