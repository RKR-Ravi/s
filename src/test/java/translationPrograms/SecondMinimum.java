package translationPrograms;

public class SecondMinimum {

	public static void main(String[] args) {
		int a[]= {1,2,3,7,4,2,67,8,6,10};
		int min=a[0];
		int smin=a[a.length-1];
		for(int i=0;i<a.length;i++) {
			if(a[i]<min) {
				smin=min;
				min=a[i];
			}
			else if(a[i]<smin && a[i]>min) {
				smin=a[i];
			}
		}
		System.out.println(smin);

	}

}
