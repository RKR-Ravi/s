package translationPrograms;

import java.util.Arrays;

public class FindHihestAndLowestElement {

	public static void main(String[] args) {
		int[] a= {1,6,2,8,3,7,10,34,4};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		System.out.println(a[0]);
		System.out.println(a[a.length-1]);

	}

}
