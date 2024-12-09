package StringPrograms;

import org.testng.annotations.Test;

public class StringPrograms {
	
	@Test
	public void LengthOfString() {
		
		String s="Ravikumarreddy";
		System.out.println(s.length());
	}
	
	@Test
	public void VowelsAndConsonant() {
		String s="education";
		int count=0;
		for(int i=0;i<s.length();i++) {
	if(s.charAt(i)=='a' || s.charAt(i)=='e' || s.charAt(i)=='i' || s.charAt(i)=='o' || s.charAt(i)=='u') 
				count++;
		}
		System.out.println(count);
	}
	
	@Test
	public void Vowels() {
		String s="education";
		String s1="aeiou";
		int count=0;
		for(int i=0;i<s1.length();i++) {
			for(int j=0;j<s.length();j++) {
				if(s1.charAt(i)==s.charAt(j)) {
					count++;
				}
			}
		}
		if(count>0) {
			System.out.println(count);
		}
	}
	@Test
	public void replaceVowelsWithSpace() {
		String s = "welcome to aplpha";
		String space = " ";
		String s2 = "";
		for (int i = 0; i < s.length(); i++) {

			switch (s.charAt(i)) {
			case 'A':
			case 'a':
			case 'E':
			case 'e':
			case 'I':
			case 'i':
			case 'O':
			case 'o':
			case 'U':
			case 'u':
				s2 += space;
				break;

			default:
				s2 += s.charAt(i);
				break;
			}

		}
		System.out.println(s2);

	}
	
	@Test
	public void reverseString() {
		String s="education";
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1=s1+s.charAt(i);
		}
		System.out.println(s1);
	}
	@Test
	public void reverseString1() {
		String s="education";
		StringBuffer s1=new StringBuffer(s);
		System.out.println(s1.reverse().toString());
	}
	@Test
	public void reverseString2() {
		String s="education";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	@Test
	public void palindromeString() {
		String s="level";
		String rev="";
		for(int i=0;i<s.length();i++) {
			rev=rev+s.charAt(i);
			
		}
		if(rev.equals(s)) {
			System.out.println("string is a palindrome");
		}
		else {
			System.out.println("string is not a palindrome");
		}
	}
	@Test
	public void palindromeString1() {
		String s="markram";
		StringBuffer s1=new StringBuffer(s);
		String rev=s1.reverse().toString();
		if(rev.equals(s)) {
			System.out.println("String is a palindromeString");
		}
		else {
			System.out.println("String is not a palidnromeString");
		}
	}
	@Test
	public void balancedString() {
		String s="(){][}";
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			for()
		}
	}

}
