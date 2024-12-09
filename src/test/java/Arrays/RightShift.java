package Arrays;

public class RightShift {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7};
		int k=3;
		for(int i=0;i<k;i++) {
			int temp=a[a.length-1];
		for(int j=a.length-2;j>=0;j--) {
			a[j+1]=a[j];
		}
		a[0]=temp;
		}
		for(int v:a) {
			System.out.println(v);
		}

	}

}
