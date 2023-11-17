package week2day1;

public class FibSeries {
	public static void main(String[] args) {
		int n = 10, first = 0, sec = 1;
		System.out.println("FibSeries till "+ n+"terms.");
		System.out.println();
		for(int i=1;i<=n;++i) {
			System.out.println(first);
			int c = first+sec;
			first = sec;
			sec = c;
		}

	}

}
