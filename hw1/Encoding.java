package hw1;
import java.util.*;

public class Encoding
{
	public static Set<String> morseCodes(int m, int n)	{ //m = . , n = -
    		String start = new String();
		for(int i = 0; i < n; i++) {
			start += "-";
	    	}
		for(int j = 0; j < m; j++) {
			start += ".";
		}
		ArrayList<String> permutations = perms(start);
		Set<String> result = new TreeSet<String>(permutations);
		return result;
	}
	public static ArrayList<String> perms(String set) {
		ArrayList<String> permutations = new ArrayList<String>();
		if(set.length() == 1) {
			permutations.add(set);
		}else {
			String first = set.substring(0,1);
			String last = set.substring(1);
			permutations = merge(perms(last), first);
		}
		return permutations;
	}
	
	public static ArrayList<String> merge(ArrayList<String> p, String add) {
		ArrayList<String> morseCode = new ArrayList<String>();
		for(String elem : p) {
			for(int i = 0; i <= elem.length(); i++) {
				String e = elem.substring(0, i) + add + elem.substring(i);
				morseCode.add(e);
			}
		}
		return morseCode;
	}
    	
}
