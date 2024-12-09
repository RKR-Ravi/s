package Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,3,2,1};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>=2) {
				System.out.print(a[i]);
			}
		}

	}

}
