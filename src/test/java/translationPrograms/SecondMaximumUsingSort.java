package translationPrograms;

import java.util.Arrays;

public class SecondMaximumUsingSort {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,4,2,67,8,6,10};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[a.length-2]);

	}

}
