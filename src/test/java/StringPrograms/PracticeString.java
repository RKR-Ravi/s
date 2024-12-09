package StringPrograms;

import java.util.Arrays;
import java.util.Scanner;
import org.testng.annotations.Test;

public class PracticeString {
	
	@Test
	public void StringLength() {
		String s="Ravikumarreddy";
		System.out.println(s.length());
	}
	@Test
	public void ReadChar() {
		String s="ravikumarreddy";
		for(int i=0;i<s.length();i++) {
			System.out.print(s.charAt(i));
		}
	}
	@Test
	public void ReadCharReverseOrder() {
		String s="ravikumarreddy";
		for(int i=s.length()-1;i>=0;i--) {
			System.out.print(s.charAt(i));
		}
	}
	@Test
	public void FirstAndLastChar() {
		String s="ravikumarreddy";
		System.out.println(s.charAt(0));
		System.out.println(s.charAt(s.length()-1));
		char ch=s.charAt(s.length()-1);
		System.out.println(ch);
	}
	@Test
	public void Uppercase() {
		String s="ravikumarreddy";
		System.out.println(s.toUpperCase());
	}
	@Test
	public void Lowercase() {
		String s="RAVIKUMARREDDY";
		System.out.println(s.toLowerCase());
	}
	@Test
	public void Ascii() {
		String s="java";
		for(int i=0;i<s.length();i++) {
		System.out.println(s.codePointAt(i));
		}
	}
	@Test
	public void CompareStrings() {
		String s="Ravikumarreddy";
		String s1="Ravi";
		boolean flag=s.contains(s1);  //s.equals(s1);
		System.out.println(flag);
	}
	@Test
	public void countChar() {
		String s="Ravikumarreddy";
		int count=s.length();
		System.out.println(count);
	}
	@Test
	public void CapitalChar() {
		String s="RaViKuMaRrEdDy";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='A' && s.charAt(i)<='Z') {
				System.out.println(s.charAt(i));
			}
		}
	}
	@Test
	public void SmallChar() {
		String s="RaViKuMaRrEdDy";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				System.out.println(s.charAt(i));
			}
		}
	}
	@Test
	public void reverseString() {
		String s="RaViKuMaRrEdDy";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		System.out.println(s1);
	}
	@Test
	public void palindromString() {
		String s="markram";
		String s1="";
		for(int i=0;i<s.length();i++) {
			s1=s.charAt(i)+s1;
		}
		if(s1.equals(s)) {
			System.out.println("Palindrome String");
		}
		else {
			System.out.println("Not a Palindrome String");
		}
	}
	@Test
	public void CountString() {
		String s="Sql1234*$@Java12345!++";
		int ccount=0;
		int scount=0;
		int ncount=0;
		int sccount=0;
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(c>='A' && c<='z') {
				ccount++;
			}
			else if(c>='a' && c<='z') {
				scount++;
			}
			else if(c>='0' && c<='9') {
				ncount++;
			}
			else {
				sccount++;
			}
		}
		System.out.println(ccount);
		System.out.println(scount);
		System.out.println(ncount);
		System.out.println(sccount);
	}
	@Test
	public void Vowels() {
		String s="education";
		
			for(int j=0;j<s.length();j++) {
				if(s.charAt(j)=='a'||s.charAt(j)=='e'||s.charAt(j)=='i'||s.charAt(j)=='o'||s.charAt(j)=='u') {
					System.out.println(s.charAt(j));
				}
				
			}
		}
	@Test
	public void printDuplicates() {
		String s="ravikumarreddy";
		System.out.println(s);
		for(char ch='a';ch<='z';ch++) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch==s.charAt(i)) {
					count++;
				}
			}
			if(count>1) {
				System.out.println(ch+" "+count);
			}
		}
	}
	@Test
	public void removeDuplicate() {
		String s="ravikumarreddy";
		//char[] ch=s.toCharArray();
		for(char ch1='a';ch1<='z';ch1++) {
			int count=0;
			for(int i=0;i<s.length();i++) {
				if(ch1==s.charAt(i)) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(ch1);
			}
		}
	}
	@Test
	public void Achar() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		String s=sc.nextLine();
		int count=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='a') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	@Test
	public void Nonvowels() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name");
		String s=sc.nextLine();
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(!(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')) {
				System.out.println(ch);
			}
		}
	}
	@Test
	public void NoofWords() {
		String s="i am ravi";
		String s1=s.trim();
		int count=1;
		for(int i=0;i<s1.length();i++) {
			if(s1.charAt(i)==' ' && s1.charAt(i+1)!=' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}
	@Test
	public void LargestWord() {
		String s="i am ravi";
		String[] s1=s.split(" ");
		int max=0;
		for(int i=0;i<s1.length;i++) {
			if(s1[i].length()>max) {
				max=s1[i].length();
			}
		}
		System.out.println(max);	
	}
	@Test
	public void frequencyString() {
		String s1="we work to live and live to be happy live";
		String[] s=s1.split(" ");
		String word="live";
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(word.equals(s[i])) {
				count++;
			}
		}
		System.out.println(count+" "+word);
	}
	@Test
	public void freqString() {
		String s1="we work to live and live to be happy live";
		String[] s=s1.split(" ");
		for(int i=0;i<s.length;i++) {
			int count=0;
			for(int j=0;j<s.length;j++) {
				if(s[i].equals(s[j])) {
					count++;
				}
			}
			System.out.println(count+" "+s[i]);
		}
	}
	@Test
	public void reverseEachWord() {                   //01
		String s="welcome to my program";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			String rev="";
			for(int j=0;j<temp.length();j++) {
				rev=temp.charAt(j)+rev;
			}
			s1[i]=rev;
		}
		String join=String.join(" ", s1);
		System.out.println(join);
	}
	@Test
	public void reverse() {                          //02
		String s="welcome to my program";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			String rev="";
			for(int j=0;j<temp.length();j++) {
				rev=temp.charAt(j)+rev;
			}
			s1[i]=rev;
		}
		String join=String.join(" ", s1);
		System.out.println(join);
	}
	@Test
	public void AnagramString() {             //01
		String s1 = "act";
		String s2 = "cat";
		if(s1.length()==s2.length()) {
			char ch[]=s1.toCharArray();
			char ch1[]=s2.toCharArray();
			Arrays.sort(ch);
			Arrays.sort(ch1);
			if(Arrays.toString(ch).equals(Arrays.toString(ch1))) {
				System.out.println("It is an Anagram");
			}
			else {
				System.out.println("Not an Anagram");
			}
		}
	}
	@Test
	public void anagramString() {                  //02
		String s1 = "act";
		String s2 = "cat";
		if (s1.length() == s2.length()) {
			char[] s11 = s1.toCharArray();
			char[] s22 = s2.toCharArray();
			Arrays.sort(s11);
			Arrays.sort(s22);
			if (Arrays.toString(s11).equals(Arrays.toString(s22))) {
				System.out.println("It is an Anagram");
			} else {
				System.out.println("not Anagram");
			}

		} else {
			System.out.println("not Anagram");
		}
	}
	@Test
	public void LargestPalindrome() {
		String s = "om dad level racecar deed";
		String[] s1=s.split(" ");
		String lp="";
		for(int i=0;i<s1.length;i++) {
			String arr=s1[i];
			String rev="";
			for(int j=0;j<arr.length();j++) {
				rev=arr.charAt(j)+rev;
			}
			s1[i]=rev;
			if(s1[i].equals(arr)) {
				if (s1[i].length() > lp.length()) {
					lp = s1[i];

				}
			}
		}
		System.out.println("Largest palindrome word is : "+lp);
	}
	@Test
	public void replaceChar() {
		String s="ravikumarreddy";
		System.out.println(s.replace('r', 's'));
	}
	@Test
	public void subStringInString() {
		String s="we work to live and live to be happy live";
		String s1="work";
		String[] s2=s.split(" ");
		for(int i=0;i<s2.length;i++) {
			int count=0;
			if(s1.equals(s2[i])) {
				count++;
			}
			System.out.println(count+" "+s1);
		}
	}	
	@Test
	public void reversesubStringInString() {
		String s="welcome to my program";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			String rev="";
			for(int j=0;j<temp.length();j++) {
				rev=temp.charAt(j)+rev;
			}
			s1[i]=rev;
		}
		String join=String.join(" ",s1);
		System.out.println(join);
	}
	@Test
	public void LargerPalindrome() {                     //01
		String s = "om dad level racecar deed";
		String s1[]=s.split(" ");
		String lp="";
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			String rev="";
			for(int j=0;j<temp.length();j++) {
				rev=temp.charAt(j)+rev;
			}
			s1[i]=rev;
			if(s1[i].equals(rev)) {
				if(s1[i].length()>lp.length()) {
					lp=s1[i];
				}
			}
		}
		System.out.println(lp);
	}
	@Test
	public void LongestPlaindrome() {                       //02
		String s = "om dad level racecar deed";
		String[] words=s.split(" ");
		String maxPalindrome="";
		for(String s1:words) {
			String word=s1;
			String reversed=new StringBuffer(s1).reverse().toString();
			if(word.equals(reversed) && reversed.length()>maxPalindrome.length()) {
				maxPalindrome=reversed;
			}
		}
		System.out.println(maxPalindrome);
	}
	@Test
	public void reverseString1() {
		String s = "om dad level racecar deed";
		String[] s1=s.split(" ");
		String rev="";
		for(int i=0;i<s1.length;i++) {
			rev=s1[i]+" "+rev;
		}	
		System.out.println(rev);
	}
	@Test
	public  void stringprogram2() {
		String s="a3b2c1";
		for(int i=0;i<s.length();i+=2) {
			int n=Character.getNumericValue(s.charAt(i+1));
		for(int j=1;j<=n;j++) {
			System.out.print(s.charAt(i));
			}
		}
	}
	@Test
	public void practice1(){
		String s="#1$2";
		String s1=s.replaceAll("[^0-9]","");
		//System.out.println(s1);
	for(int i=s1.length()-1;i>=0;i--) {
		int n= Character.getNumericValue(s1.charAt(i));
			System.out.println(n);
		
	}
	}
	@Test
	public void practice2() {
		String s="1#$2";
		int count=0;
		String s1=s.replaceAll("[^0-9]","");
		for(int i=0;i<s1.length();i++) {
			int n=Character.getNumericValue(s1.charAt(i));
			count=count+n;
		}
		System.out.println(count);
	}
	@Test
	public void practice3() {
		String s="1#2!";
		String s1=s.replaceAll("[^0-9]","");
		String s2=s.replaceAll("[0-9]","");
		String rev="";
		for(int i=0;i<s1.length();i++) {
			rev=s1.charAt(i)+rev;
		}
		System.out.println(rev+s2);
	}
	@Test
	public void practice4() {
		String s="a2b3c1";
		String s1=s.replaceAll("[a-z]","");
		String s2=s.replaceAll("[0-9]","");
		System.out.println(s1);
		System.out.println(s2);
		for(int i=0;i<s1.length();i++) {
			int n=Character.getNumericValue(s1.charAt(i));
				for(int k=0;k<n;k++) {
				System.out.print(s2.charAt(i));
			}
		}
	}
	@Test
	public  void occurence() {
		String s="AAABBCCCCDD";
		String s1="";
		for(int i=0;i<s.length();i++){
		  int count=0;
		    if(!s1.contains(s.charAt(i)+"")){
			s1=s1+s.charAt(i);
		 		for(int j=0;j<s.length();j++){
		   		  if(s.charAt(i)==s.charAt(j)){
					count++;
					}
				}
		System.out.print(count+""+s.charAt(i))	;
		}

		}
	}
	@Test
	public void practice5() {
		String s="aabbbbccdd";
		int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}else {
				System.out.print(s.charAt(i)+""+c);
				c=1;
			}
		}
		System.out.print(s.charAt(s.length()-1)+""+c);
	}
	
}

