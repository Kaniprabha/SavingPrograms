package week3day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		int a[] ={1, 2, 3, 4, 10, 6, 8};
		
		
		List<Integer> MissingElt = new ArrayList<Integer>();//{1, 2, 3, 4, 10, 6, 8}.
		
		for (int num1 : a) {
			MissingElt.add(num1);
		}
				
		Collections.sort(MissingElt);
		//System.out.println(MissingElt);
		int size = MissingElt.size();
		
		
		for (int i = 0; i<size ; i++) 
		{
		
		  if (i+1 != a[i])
			{
				System.out.println("Missing Element: "+(i+1));
			}	
		}

	}

}
