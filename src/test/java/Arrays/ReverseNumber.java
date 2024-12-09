package Arrays;

public class ReverseNumber {

	public static void main(String[] args) {
		int a[]= {123,456,789,1011,1213,1415};
		for(int i:a) {
			int rev=0;
			int n=i;
			while(n>0) {
				int rem=n%10;
				rev=(rev*10)+rem;
				i=i/10;
			}
			System.out.println( rev+" is reverse of "+n);
		}

	}

}
