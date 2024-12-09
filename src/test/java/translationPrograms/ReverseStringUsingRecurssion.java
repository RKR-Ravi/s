package translationPrograms;

public class ReverseStringUsingRecurssion {

	public static void main(String[] args) {
		reverse("Ravikumarreddy");

	}
	public static void reverse(String s) {
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=s.charAt(i)+rev;
		}
		System.out.println(rev);
	}

}
