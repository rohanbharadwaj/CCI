package Chapter1;

import java.util.Scanner;

public class Question3 {
	public static boolean isAnagram(String str1, String str2) {
		// Input string is assumed to be ASCII string.
		int m,n;
		m = str1.length();
		n = str2.length();
		int[] vector = new int[256]; 
		if(m!=n) return false;
		char[] str1_array = str1.toCharArray();
		for(char c:str1_array)
			vector[c]++;
		for(int i=0;i<str2.length();i++)
		{
			int c = (int)str2.charAt(i);
			if (--vector[c]<0) return false;
		}
		
		return true;
	}

	public static void main(String[] args) {
		String str1 = new String();
		String str2 = new String();
		Scanner s = new Scanner(System.in);
		str1 = s.nextLine();
		str2 = s.nextLine();
		s.close();
		System.out.println(isAnagram(str1, str2));
	}
}
