package Arrays;

public class PalindromeNumber {

	public static void main(String[] args) {
		int a[]= {25,44,66,121,131};
		int count=0;
		for(int i:a) {
			int rem;
			int rev=0;
			while(i>0) {
				rem=i%10;
				i=i/10;
				rev=(rev*10)+rem;
			}
			if(i==rev) {
				count++;
				System.out.println(i);
			}
		}

	}

}
