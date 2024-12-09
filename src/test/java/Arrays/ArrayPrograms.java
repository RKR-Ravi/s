package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.TreeSet;

import org.testng.annotations.Test;

public class ArrayPrograms {
	
	@Test
	public void arrayLength() {
		int a[]= {1,2,3,4,5,6,7};
		System.out.println("Length of an array "+a.length);
	}
	
	@Test
	public void arrayElementUsingForLoop() {
		int a[]= {1,2,3,4,5,6,7};
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void arrayElementUsingForEachLoop() {
		int a[]= {1,2,3,4,5,6,7};
		for(int v:a) {
			System.out.println(v);
		}
	}
	
	@Test
	public void averageOfArray() {
		int a[]= {1,2,3,4,5,6,7};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+i;
		}
		int avg =sum%a.length;
		System.out.println(avg+" of an array.");
	}
	
	@Test
	public void copyArray() {
		int a[]= {1,2,3,4,5,6,7};
		int b[]=new int[a.length];
		int k=0;
		for(int i=a.length-1;i>=0;i--) {
			b[k]=a[i];
			k++;
		}
		for(int j=0;j<=b.length-1;j++) {
			System.out.println(b[j]);
		}
	}
	
	@Test
	public void mergeArray() {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {8,9,10,11,12,13,14};
		int c[]= new int[a.length+b.length];
		for(int i=0;i<=a.length-1;i++) {
			c[i]=a[i];
		}
		for(int j=0;j<b.length;j++) {
			c[j+a.length]=b[j];
		}
		for(int i=0;i<c.length;i++) {
			System.out.println(c[i]);
		}
	}
	@Test
	public void mergeArray2() {
		int a[]= {1,2,3,4,5,6,7};
		int b[]= {8,9,10,11,12,13,14};
		ArrayList<Integer> l=new ArrayList<Integer>();
		for(int i=0,j=0;i<a.length && j<b.length;i++,j++) {
			l.add(a[i]);
			l.add(b[j]);
		}
		System.out.println(l);
	}
	
	@Test
	public void numberPresent() {
		int a[]= {1,2,3,4,5,6,7};
		int b=3;
		
		for(int i=0;i<a.length;i++) {
			if(b==a[i]) {
				
				System.out.println("Given number is present");
				break;
			}
			else {
				System.out.println("Given number is not present");
			
			}
		}
	}
	@Test
	public void findElementinArray() {
		int a[]= {1,2,3,4,5,6,7};
		int b=3;
		for(int v:a) {
			if(b==v) {
				System.out.println("Given number is present");
				break;
			}
			else {
				System.out.println("Given number is not present");	
			}
		}
	} 
	@Test
	public void leftShift() {
		int a[]= {1,2,3,4,5,6,7};
		int k=3;
		for(int i=0;i<k;i++) {
			int temp=a[a.length-1];
			for(int j=a.length-1;j>0;j--) {
				a[j]=a[j-1];
			}
			a[0]=temp;
		}
		for(int v:a) {
			System.out.println(v);
		}
	}
	@Test
	public void rightShift() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter k value");
		int k=sc.nextInt();
		int a[]= {1,2,3,4,5,6,7};
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
	@Test
	public void removeDuplicate() {
		int a[]= {1,2,3,4,5,6,7,4,2,1};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.println(a[i]);
			}
		}
	}
	@Test
	public void printDuplicate() {
		int a[]= {1,2,3,4,5,6,7,4,2,1};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j] &&  i>j) {
					count++;
				}
			}
			if(count>=1) {
				System.out.println(a[i]);
			}
		}
	}
	
	@Test
	public void NumberOccurance() {
		int a[]= {1,2,3,4,5,6,7,4,2,1};
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			System.out.println(a[i]+" "+count);
		}
	}
	
	@Test
	public void NumberOccurance1() {
		int a[]= {1,2,3,4,5,6,7,4,2,1};
		HashSet<Integer> hs=new HashSet<Integer>();
		for(int i=0;i<a.length;i++) {
			hs.add(a[i]);
		}
		System.out.println(hs);
		for(Integer n:hs) {
			int count=0;
			for(int i=0;i<a.length;i++) {
				if(n.equals(a[i])) {
					count++;
				}
			}
			System.out.println(n+" "+count);
		}
	}
	@Test
	public void maximumNumber() {
		int a[]= {1,2,3,4,5,6,7,4,2,1};
		int max=a[0];
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max+" is maxium number");
	}
	
	@Test
	public void maxFrequency() {
		int a[]= {1,2,3,4,5,6,6,6,64,4,4,3,3,3,3};
		int maxfreq=0;
		int maxFreqEle=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i;j<a.length;j++) {
				if(a[i]==a[j]) {
					count++;
				}
			}
			if(count>maxfreq) {
				maxfreq=count;
				maxFreqEle=a[i];
			}
		}
		System.out.println(maxfreq+" "+maxFreqEle);
	}
	
	@Test
	public void maxFrequency1() {
		int a[]= {1,2,3,4,5,6,6,6,64,4,4,3,3,3,3};
		int maxcount=0;
		int maxFreqEle=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=0;j<i;j++) {
				if(a[i]==a[j]) {
				count++;	
				}
			}
			if(count>maxcount) {
				maxcount=count;
				maxFreqEle=a[i];
			}
		}
		System.out.println(maxcount+" "+maxFreqEle);
	}
	
	@Test
	public void sortAscending() {
		int a[]= {1,6,4,9,7,56,98,21,33};
		Arrays.sort(a);
		for(int v:a) {
			System.out.println(v);
		}
	}
	
	@Test
	public void sortAscending1() {
		int a[]= {1,6,4,9,7,56,98,21,33};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]>a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int v:a) {
			System.out.println(v);
		}
	}
	
	@Test
	public void sortDescending() {
		int a[]= {1,6,4,9,7,56,98,21,33};
		Arrays.sort(a);
		for(int i=a.length-1;i>=0;i--) {
			System.out.println(a[i]);
		}
	}
	
	@Test
	public void sortDescending1() {
		int a[]= {1,6,4,9,7,56,98,21,33};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[j]<a[i]) {
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
		}
		for(int v:a) {
			System.out.println(v);
		}
	}
	
	@Test
	public void swapHalf() {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int b[]=new int[a.length/2];
		System.out.println(b.length);
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length/2;j++) {
				int temp=a[a.length/2+j];
				b[a.length/2+j]=a[j];
				b[j]=temp;
			}
		}
		System.out.println(Arrays.toString(b)+" ");
	}
	
	@Test
	public void largestNumber() {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int max=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		System.out.println(max);
	}
	@Test
	public void thridmax() {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int max=0;
		int smax=0;
		int tmax=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]>max) {
				smax=max;
				tmax=smax;
				max=a[i];
				
			}
			else if(a[i]>smax && a[i]!=max) {
				tmax=smax;
				smax=a[i];
				
			}
			else if(a[i]>tmax && a[i]!=max) {
				tmax=a[i];
			}
		}
		System.out.println(max+" "+smax+" "+tmax);
	}
	
	@Test
	public void Arraynumsort() {
		int a[]= {1,4,2,6,3,7,5,8,4,9};
		TreeSet<Integer>t=new TreeSet<Integer>();
		for(int i=0;i<a.length;i++) {
			t.add(a[i]);
		}
		System.out.println(t);
		
	}
	
	@Test
	public void moveZeros() {
		int a[]= {1,0,2,0,3,0,4,0,5};
		int n=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]!=0) {
				a[n]=a[i];
				n++;
			}
		}
		while(n<a.length) {
			a[n]=0;
			n++;
		}
		System.out.println(Arrays.toString(a));
	}
	

	@Test
	public void moveAllZeros() {
		int a[]= {1,0,2,0,3,0,4,0,5,6};
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
	@Test
	public void leftShift1() {
		int a[]= {1,2,3,4,5,6};
		int k=3;
		for(int i=0;i<k;i++) {
			int temp=a[0];
			for(int j=0;j<a.length-1;j++) {
				a[j]=a[j+1];
				
			}
			a[a.length-1]=temp;
		}
		for(int v:a) {
			System.out.println(v);
		}
	}
	@Test
	public void swapHalfArray() {
		int a[]= {1,2,3,4,5,6};
		int b=a.length;
		int k=b/2;
		for(int i=0;i<k;i++) {
			int temp=a[i];
			a[i]=a[k+i];
			a[k+i]=temp;
		}
		System.out.println(Arrays.toString(a));
	}
	@Test
	public void targetsum() {
	int[] a= {10,5,7,8,6,9,9,10,7};
	int target=15;
	LinkedHashSet set=new LinkedHashSet();
	for(int i=0;i<a.length;i++) {
		for(int j=0;j<a.length;j++) {
			if(a[i]+a[j]==target) {
				//String result=a[i]<a[j]?"("+a[i]+","+a[j]+")":"("+a[j]+","+a[i]+")";
				String result=a[i]<a[j]?"("+a[i]+","+a[j]+")":"("+a[j]+","+a[i]+")";
				set.add(result);
			}
		}
	}
	System.out.println(set);
	}
	
	
	
}
