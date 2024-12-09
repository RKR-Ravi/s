package translationPrograms;

public class ConsecutiveCharacters {

	public static void main(String[] args) {
		String s = "aaabbcaabbe";
		int count = 1;
		String op = "";
		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i + 1)) {
				count++;
			}
			else {
				op=op+s.charAt(i)+count;
				count=1;
			}
		}
		op=op+s.charAt(s.length()-1)+count;
		System.out.println(op);


	}

}
