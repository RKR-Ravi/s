package translationPrograms;

public class GenerateAllSubString {

	public static void main(String[] args) {
		String s="Ravikumarreddy";
		for(int i=0;i<s.length();i++) {
			for(int j=i+1;j<s.length();j++) {
				String sub=s.substring(i, j);
				System.out.println(sub);
			}
		}

	}

}
