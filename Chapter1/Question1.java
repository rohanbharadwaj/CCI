package Chapter1;

import java.util.Arrays;
import java.util.Scanner;

public class Question1 {
	
	public static boolean isUnique(String str)
	{	//nlogn with extra space n
		char[] array = str.toCharArray();
		Arrays.sort(array);
		for(int i=1;i<array.length;i++)
			if (array[i]==array[i-1]) return false;
		return true;
	}
	public static boolean isUnique1(String str)
	{ //If it is ASCII string. Time : O(n), Space : O(1) 
		if(str.length() > 256) return false;
		boolean char_set[] = new boolean[256];
		for(int i=0;i<str.length();i++)
		{
			int val = str.charAt(i);
			if(char_set[val]) return false;
			char_set[val] = true;
		}
		return true;
	}
public static void main(String[] args) {
	String str = new String();
	Scanner s = new Scanner(System.in);
	str = s.nextLine();
	s.close();
	System.out.println(isUnique1(str));
}
}
