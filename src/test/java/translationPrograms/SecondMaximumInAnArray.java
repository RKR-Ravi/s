package translationPrograms;

public class SecondMaximumInAnArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,4,2,67,8,6,10};
		int max=0;
		int smax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				max=a[i];
			}
			else if(a[i]>smax && a[i]<max) {
				smax=a[i];
			}
		}
		System.out.println(smax);

	}

}
