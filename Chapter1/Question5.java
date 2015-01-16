package Chapter1;

import java.util.Scanner;

public class Question5 {

	public static String compress(String str) {
		StringBuilder res = new StringBuilder("");
		char last = str.charAt(0);
		int count = 1;
		int len = str.length();
		for (int i = 1; i < str.length(); i++) {
			if (last == str.charAt(i))
				count++;
			else {
				res.append(last);
				res.append(count);
				last = str.charAt(i);
				count = 1;
			}

		}
		if (res.length() >= len) return str;
		else
			return new String(res);
	}

	public static void main(String[] args) {
		String str = new String();
		Scanner s = new Scanner(System.in);
		str = s.nextLine();
		s.close();
		System.out.println(compress(str));
	}
}
