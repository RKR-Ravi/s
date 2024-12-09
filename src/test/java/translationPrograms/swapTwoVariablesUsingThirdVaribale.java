package translationPrograms;

public class swapTwoVariablesUsingThirdVaribale {

	public static void main(String[] args) {
		String a="java";
		String b="api";
		String c=a+b;
		b=c.substring(0,a.length());
		a=c.substring(b.length());
		System.out.println(b);
		System.out.println(a);
		

	}

}
