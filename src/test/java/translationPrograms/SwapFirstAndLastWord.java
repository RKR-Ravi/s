package translationPrograms;

import java.util.Arrays;

public class SwapFirstAndLastWord {

	public static void main(String[] args) {
		String s="welcome to tp office";
		String s1[]=s.split(" ");
		String temp="";
		temp=s1[s1.length-1];
		s1[s1.length-1]=s1[0];
		s1[0]=temp;
		System.out.println(Arrays.toString(s1));

	}

}
