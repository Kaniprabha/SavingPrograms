package week1day1;

public class MobileAssignment {
	public void makecall() {
		String mobilemodel = "Poco";
		float weight = 200.15f;
		System.out.println("This is my Mobile: "+ mobilemodel+ " & It's Weight==> "+ weight);
	}
	public void sendmsg() {
		boolean mobilecharged = true;
		int mobilecost = 30000;
		System.out.println("Is it Charged? "+mobilecharged+ " & it's Cost: "+ mobilecost);
	}

	public static void main(String[] args) {
		MobileAssignment obj = new MobileAssignment();
		obj.makecall();
		obj.sendmsg();

	}
}
