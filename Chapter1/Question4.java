package Chapter1;

public class Question4 {

	public static String replaceSpaces(char[] arr, int len) {
		int spaceCount = 0, newLength, i;
		char[] res;
		for (i = 0; i < len; i++)
			if (arr[i] == ' ')
				spaceCount++;
		newLength = len + 2 * spaceCount;
		res = new char[newLength];
		res[newLength - 1] = '\0';
		for (i = len - 1; i >= 0; i--) {
			if (arr[i] == ' ') {
				res[newLength - 1] = '0';
				res[newLength - 2] = '2';
				res[newLength - 3] = '%';
				newLength = newLength - 3;

			} else {
				res[newLength - 1] = arr[i];
				newLength = newLength - 1;
			}

		}

		return new String(res);

	}

	public static void main(String[] args) {
		String str = "hello world this is a test";
		char[] array = str.toCharArray();
		int len = array.length;
		System.out.println(replaceSpaces(array, len));

	}

}
