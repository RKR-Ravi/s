package translationPrograms;

import java.util.Arrays;

public class AllZerosToOneSide {

	public static void main(String[] args) {
		int a[]= {1,0,2,0,3,0,4,0,5};
		int j=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				j++;
			}
		}
		System.out.println(Arrays.toString(a));

	}

}
