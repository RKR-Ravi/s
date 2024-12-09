package Arrays;

import org.apache.poi.ss.formula.functions.Count;

public class CountDigits {
	
	public static int count(int n) {
		
		int count=0;
		while(n>0) {
			count++;
			n=n/10;
		}
		return count;
		
	}

	public static void main(String[] args) {
		int a[]= {1,11,111,1111,11111};
		for(int i:a) {
			count(i);
			System.out.println(i+" "+count(i));
		}
		

	}

}
