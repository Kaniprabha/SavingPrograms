package week2day1;

public class IsPrime {
	static void Number(int num){
		for(int i=2; i<=num/2; ++i) {
        	if(num%i ==0) {
        		System.out.println(num+" is not Prime Number");
        		break;
        	}
        	else {
        		System.out.println(num+" is Prime Number.");
        		break;
        	}
        }
    }

	public static void main(String[] args) {
       // int num=29;
        IsPrime obj = new IsPrime();
        obj.Number(8);
        obj.Number(29);
        obj.Number(100);
        obj.Number(101);
	}

}
