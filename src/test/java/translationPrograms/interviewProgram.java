package translationPrograms;

import java.util.Arrays;

public class interviewProgram {

	public static void main(String[] args) {
		String s="good morning ravi kumar";
		String[] s1=s.split(" ");
		String[] s2=new String[s1.length];
		int j=0;
		System.out.println(Arrays.toString(s1));
		for(int i=s1.length-1;i>=0;i--) {
			s2[j]=s1[i];
			j++;
		}
		//System.out.println(Arrays.toString(s2));
		for(int k=0;k<s2.length;k++) {
			if(k==1) {
				String temp=s2[k];
				String rev="";
				for(int l=0;l<temp.length();l++) {
					rev=temp.charAt(l)+rev;
					s2[k]=rev;
				}
			}
		}
		System.out.println(Arrays.toString(s2));

	}

}
