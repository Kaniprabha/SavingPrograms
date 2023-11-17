package week3day2;

public class LoginTestData extends TestData{
	  public void UserName(String Username) {
	    	 System.out.println("UserName: "+ Username);
	     }
	     public void PassWord(int PassWord) {
	    	 System.out.println("PassWord: "+PassWord);
	     }
	     public static void main(String[] args) {
	    	 TestData object1 = new TestData();
	    	 LoginTestData obj2 = new LoginTestData();
	    	 object1.enterCredentials();
	    	 object1.navigateToHomePage();
	    	 obj2.UserName("Prabha");
	    	 obj2.PassWord(12345);
	    	 
		}

}
