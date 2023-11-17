package week3day4;

import java.util.LinkedHashSet;

import java.util.Set;

public class Google {
	
	public static void main(String[] args) {
		String name = "google";
		String[] chars = name.split("");
		Set<String> Unique = new LinkedHashSet<String>();
		
		for(String Output : chars) {
			Unique.add(Output);
		}
		System.out.println("Unique: "+Unique);
	}

}
