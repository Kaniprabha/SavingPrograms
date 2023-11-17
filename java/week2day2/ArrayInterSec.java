package week2day2;

public class ArrayInterSec {
	public static void main(String[] args) {
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		int Arr1Len = arr1.length;
		int Arr2Len = arr2.length;
		
		 System.out.println("Intersection in between Array1-Array2:");
		
        for (int i = 0; i<Arr1Len; i++) {
		    for (int j=0; j<Arr2Len; j++ ) {
		    	if(arr1[i] == arr2[j])
		    	    System.out.println("Intersection: " + arr1[i]);
		    	   
		    }
			
		}
	}

}
