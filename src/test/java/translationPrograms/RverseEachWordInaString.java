package translationPrograms;

public class RverseEachWordInaString {

	public static void main(String[] args) {
		String s="we work to live and live to be happy live";
		String s1[]=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			String temp=s1[i];
			String rev="";
			for(int j=0;j<temp.length();j++) {
				rev=temp.charAt(j)+rev;
			}
			s1[i]=rev;
		}
		for(String s2:s1) {
			System.out.print(s2+" ");
		}

	}

}
