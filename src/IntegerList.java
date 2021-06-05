import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class IntegerList {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(2);
        countFrequencies(list);

	}

	private static void countFrequencies(ArrayList<Integer> list) {
		
		Set<Integer> set = new HashSet<Integer>(list); 
		
		for(Integer s : set) {
			System.out.println("digit:"+s+" occurences:"+Collections.frequency(list, s));
		}
		
	}

}
