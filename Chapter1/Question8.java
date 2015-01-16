package Chapter1;

public class Question8 {
public static boolean isRotation(String s1,String s2) {
	int len = s1.length();
	if(len==s2.length() && len>0) 
	{
		String s1s1 = s1+s1;
		return isSubString(s1s1,s2);
	}
	return false;
}

private static boolean isSubString(String s1s1, String s2) {
	// TODO Auto-generated method stub
	return false;
}
}
