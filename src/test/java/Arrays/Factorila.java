package Arrays;

public class Factorila {
	
	public static int fact(int n) {
		int fact=1;
		for(int i=1;i<=n;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
		return fact;
	}

	public static void main(String[] args) {
		int a[]= {5,6,7};
		for(int v:a) {
			int j=fact(v);
			System.out.println(v + " factorial of number is = "+ j);
		}

	}

}
