import org.apache.poi.util.SystemOutLogger;
import org.testng.annotations.Test;

public class numberPractice {
	
	@Test
	public void evenOrOdd() {
		int n=69;
		if(n%2==0) {
			System.out.println("Given number is even");
		}
		else {
			System.out.println("Given number is odd");
		}
		System.out.println(n%2==0 ?"even":"odd");
	}
	@Test
	public void postiveOrNegativeOrNatural() {
		int n=69;
		if(n>0) {
			System.out.println("Positive Number");
		}
		else if(n<0) {
			System.out.println("Negative number");
		}
		else {
			System.out.println("Natural Number");
		}
	}
	@Test
	public void ValidOrInvalid() {
		int n=144;
		if(n%2==0) {
			if(n>45) {
				System.out.println("Valid");
			}
			else {
				System.out.println("Invalid");
			}
		}
		else {
			System.out.println("Odd Number");
		}
	}
	@Test
	public void check() {
		int n=88;
		if(n%4==0) {
			if(n<90) {
				int last=n%10;
				System.out.println(last);
			}
		}
		else {
			System.out.println("Its done");
		}
	}
	@Test
	public void Charachter() {
		char ch='X';
		if(ch>'A' && ch<'Z') {
			System.out.println("Upercase");
		}
		else {
			System.out.println("Not UpperCase");
		}
	}
	@Test
	public void 

}
