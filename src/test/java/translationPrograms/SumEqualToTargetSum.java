package translationPrograms;

import java.util.Set;
import java.util.TreeSet;

public class SumEqualToTargetSum {

	public static void main(String[] args) {
		int[] a= {10,5,7,8,6,9,9,10,7};
		int t=15;
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(a[i]+a[j]==t) {
					String result=a[i]<a[j]?"("+a[i]+","+a[j]+")":"("+a[i]+","+a[j]+")";
					Set.add(result);
				}
			}
		}
		System.out.println(set);

	}

}
