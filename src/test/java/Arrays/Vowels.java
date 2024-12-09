package Arrays;

public class Vowels {

	public static void main(String[] args) {
		char ch[]= {'J','A','V','A','S','T','U','D','E','N','T'};
		 String c="AEIOU";
		 char d[]=c.toCharArray();
		for(char i:ch) {
			for(char j:d) {
				if(i==j) {
					System.out.println(i);
				}
			}
		}

	}

}
