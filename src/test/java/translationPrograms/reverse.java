package translationPrograms;

import java.util.Arrays;

public class reverse {
		public static void main(String args[]){
		String s="good morning ravi kumar";
		String[] s1=s.split(" ");
		int j=0;
		for(int i=s1.length-1;i>=0;i--){
		 j=s1[i];
		j++;
		}for(int k=0;k<s1.length;k++){
		String temp=s1[k];
		String rev="";
		for(int l=0;l<temp.length();l++){
		if(temp=s1[1]){
		rev=temp.charAt(j)+rev;
		}}
		System.out.println(Arrays.toString(s1));
		}}

}
