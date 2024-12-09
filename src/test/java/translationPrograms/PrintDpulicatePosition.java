package translationPrograms;

public class PrintDpulicatePosition {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,4,3,2,1};
		for(int i=0;i<a.length;i++) {
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					System.out.println(j);
				}
			}
		}

	}

}
