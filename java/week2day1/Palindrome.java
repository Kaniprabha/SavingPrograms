package week2day1;

public class Palindrome {
	public void PalinNum(int num) {
		int digit, remainder, reverse = 0;
		int original = num;
		for(;num !=0; num/=10) {
		     digit = num%10;
		     reverse = (reverse*10) + digit;
		     if (num == original) {
				System.out.println("Given Number is Palindrome.("+ num+ ")");
		     }	
			else {
			     System.out.println("Given Number is not Palindrome.("+ num+")");
			}     break;
		}
		
		
	}

	public static void main(String[] args) {
		Palindrome obj = new Palindrome();
		obj.PalinNum(121);
		obj.PalinNum(12345);

	}

}
