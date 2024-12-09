package translationPrograms;

import java.util.Arrays;

public class FirstLetterOfEachWordUpperCase {

	public static void main(String[] args) {
		String s="we work to live and live to be happy live";
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			System.out.print(Character.toUpperCase(temp.charAt(0))+temp.substring(1)+" ");
			
		}

	}

}
