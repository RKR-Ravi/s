package Arrays;

public class primeNumber {

	public static void main(String[] args) {
		int a[]= {2,3,5,7,11,13,12,25,16};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=1;j<=a[i];j++) {
				if(a[i]%j==0) {
					count++;
				}
				
			}
			if(count==2) {
				System.out.println(a[i]);
			}
		}

	}

}
