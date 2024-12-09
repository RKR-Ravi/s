package patternMatching;

import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class patternPrograms {
	@Test
	public void pattern1() {
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}	
	}
	@Test
	public void pattern2() {
		int n=1;
		for(int i=0;i<4;i++) {
			for(int j=0;j<4;j++) {
				System.out.print(n);
			}
			n++;
			System.out.println("");
		}
	}
	@Test
	public void pattern3() {                 //01
		for(int i=0;i<4;i++) {
			int n=1;
			for(int j=0;j<4;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern4(){                  //02
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern5() {
		int n=4;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				System.out.print(i+j+" ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern6() {
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(n);
				n++;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern7() {
		char ch='a';
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern8() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || i==3) {
					System.out.print("1");
				}
				else {
					System.out.print("0");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern9() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				int rem=i%2;
				System.out.print(rem+" ");
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern10() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				int rem=j%2;
				System.out.print(rem+" ");		
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern11() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==1 ||i==5) {
					System.out.print("#");
				}
				else {
					System.out.print("@");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern12() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || i==4 || j==1 || j==4) {
					System.out.print("#");
				}
				else {
					System.out.print("@");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern13() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i%2==0) {
					System.out.print("# ");
				}
				else {
					System.out.print("@ ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern14() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==j) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern15() {
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(i==j) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern16() {
		int n=4;
		for(int i=1;i<=4;i++) {
			for(int j=4;j>=1;j--) {
				if(i==j ||i+j==n+1) {
					System.out.print("#");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern17() {                  //Stright
		int n=7;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i>=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern18() {                    //intevrted
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=7;j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern19() {
		int n=1;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i>=j) {
					System.out.print(n);
					n++;
				}
				else {
					System.out.print(" ");
				}				
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern20() {
		char ch='Z';
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print(ch);
					ch--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern21() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern22() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i<=j) {
					System.out.print(i%2);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern23() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i>=j) {
					System.out.print(i%2);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern24() {
		int n=6;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j<=n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern25() {
		int n=6;
		for(int i=1;i<=6;i++) {
			for(int j=1;j<=6;j++) {
				if(i+j>=n+1) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern26() {
		int n=6;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i==j || i+j==n+1) {
					System.out.print(" ");
				}
				else if(i==1 || i==n || j==1 || j==n) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern27() {
		int n=5;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				if(i+j==n+1 || j==1 && i>=(n+1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern28() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==3 && j==3) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern29() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i%2==0) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern30() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(j%2==0) {
					System.out.print("#");
				}
				else {
					System.out.print("*");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern31() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i==1 || j==1 || i==4 || j==4) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@	Test
	public void pattern32() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==(5+1)/2 || j==(5+1)/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern33() {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=5;j++) {
				if(i==j || i+j==(5+1) && i>=(5+1)/2 || i+j==5+1 && i<=5+1/2) {
					System.out.print("*");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern34() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
			  if(i+j>=5) {
				  System.out.print("* ");
			  }
			  else {
				  System.out.print(" ");
			  }
				
		}
			System.out.println("");
			
			}
	}
	@Test
	public void pattern35() {
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=4;j++) {
				if(i<=j) {
					System.out.print("* ");
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	@Test
	public void pattern36() {

		for(int i=1;i<=4;i++) {
			int n=1;
			for(int j=1;j<=4;j++) {
				if(j<=i) {
					System.out.print(n);
					n++;
				}
				else {
					System.out.print(" ");
				}
				
			}
			System.out.println("");
			
		}
	}
	@Test
	public void pattern37() {
		for(int i=1;i<=4;i++) {
			char ch='A';
			for(int j=1;j<=4;j++) {
				
				System.out.print(ch);
				ch++;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern38() {
		for(int i=1;i<=4;i++) {
			char ch='A';
			for(int j=1;j<=4;j++) {
				if(i>=j) {
					System.out.print(ch);
				}
				else {
					System.out.print(" ");
				}
				ch++;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern39() {
		int star=1;
		int space=3;
		  for(int row=1;row<=4;row++) 
		   { 
		     for (int col=1;col<= space;col++) 
		      { 
		         System.out.print(" ");        
		      } 
		      for (int k=1;k<= star;k++) 
		      { 
		        System.out.print("*");        
		       } 
		       System.out.println( ); 
		      space = space-1; 
		      star = star+2;
		   }
	}
	@Test
	public void pattern40() {
		int star=1;
		int space=3;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			System.out.println(" ");
			star=star+2;
			space=space-1;
		}
	}
	@Test
	public void pattern41() {
		int star=7;
		int space=0;
		for(int i=1;i<=4;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			star=star-2;
			space=space+1;
			System.out.println(" ");
		}
	}
	@Test
	public void pattern42() {
		int star=1;
		int space=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=3) {
			star=star+2;
			space=space-1;
			}
			else {
				star=star-2;
				space=space+1;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern43() {
		int star=7;
		int space=0;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++){
				System.out.print(" ");
				}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=3) {
				star=star-2;
				space=space+1;
				
			}
			else {
				star=star+2;
				space=space-1;
			}
			System.out.println("");
		}
	}
	@Test
	public void pattern44() {
		int star=1;
		int space=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=3) {
				star=star+1;
			}
			else {
				star=star-1;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern45() {
		int star=1;
		int space=3;
		for(int i=1;i<=7;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=3) {
				star=star+1;
				space=space-1;
			}
			else {
				star=star-1;
				space=space+1;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern46() {
		for(int i=0;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				if(i>=j) {
				System.out.print(j%2);
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern47() {
		int p=1;
		int space=4;
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=p;k++) {
				System.out.print(p);
			}
			p=1;
		}
			
	}
	@Test
	public void pattern48() {
		 int n = 5; // This defines the height of the upper half of the pattern
	        
	        // Upper part of the pattern
	        for (int i = 1; i <= n; i++) {
	            // Printing leading spaces
	            for (int j = i; j < n; j++) {
	                System.out.print(" ");
	            }
	            // Printing numbers
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	        
	        // Lower part of the pattern
	        for (int i = n - 1; i >= 1; i--) {
	            // Printing leading spaces
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            // Printing numbers
	            for (int j = 1; j <= (2 * i - 1); j++) {
	                System.out.print(j);
	            }
	            System.out.println();
	        }
	    }
	@Test
	public void pattern49() {
		int space=8;
		int star=1;
		for(int i=1;i<=15;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print("*");
			}
			if(i<=7) {
				space=space-1;
				star=star+2;
			}
			else {
				space=space+1;;
				star=star-2;
			}
			System.out.println(" ");
		}
	}
	@Test
	public void pattern50() {
		int star=1;
		int space=3;
		for(int i=0;i<=7;i++) {
			int n=1;
			for(int j=1;j<=space;j++) {
				System.out.print(" ");
			}
			for(int k=1;k<=star;k++) {
				System.out.print(n);
				n++;
			}
			space=space-1;
			star=star+2;
			System.out.println("");
		}
	}
	@Test
	  public void pattern52()
	  {
	    int star=1,space=3;//(spaces before star)
	    for(int i=1;i<=4;i++)
	    {
	    	int n=1;
	      for(int j=1;j<=space;j++)
	      {
	          System.out.print(" ");
	      }
	      for(int k=1;k<=star;k++)
	      {
	          System.out.print(n++);
	      }
	      star=star+2;
	      space=space-1;
	      for(int l=1;l<=star;l++) {
	    	  System.out.println(n--);
	      }
	      star=star-2;
	      space=space+1;
	      System.out.println(" ");
	    }
	 }
	
}

