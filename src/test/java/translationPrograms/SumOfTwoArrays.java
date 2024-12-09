package translationPrograms;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int a[]={1,2,3,4};
        int[] b={5,6,7,8};
        int c[]=new int[a.length];
        for(int i=0;i<a.length;i++){
            c[i]=a[i];
            if(i<b.length){
                c[i]=c[i]+b[i];
            }
            
    }
    System.out.println(Arrays.toString(c));

	}

}
