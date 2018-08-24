package hw1;

public class Strings {
	public static String uniqueLetters(String str) {
		int i;
		int a;
		int length = str.length();
		int[] alphabet = new int[26];
		String result = new String();
		for (i=0; i<length; i++) {
			a = str.charAt(i);
			a -= 97;
			alphabet[a]++;
		}
		for (i=0; i<length; i++) {
			a = str.charAt(i);
			a -= 97;
			if(alphabet[a] == 1) {
				result += str.substring(i, i+1);
			}
		}
		return result;
	}
}
