package translationPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoOfOccuranceOfWord {

	public static void main(String[] args) {
		String s="we work to live and live to be happy live";
		LinkedHashMap<String,Integer> map= new LinkedHashMap<String, Integer>();
		String[] s1=s.split(" ");
		for(int i=0;i<s1.length;i++) {
			if(!map.containsKey(s1[i])) {
				map.put(s1[i],1);
			}
			else {
				Integer value=map.get(s1[i]);
				value++;
				map.put(s1[i], value);
			}
		}
		System.out.println(map);
		for(Map.Entry<String,Integer> pair:map.entrySet()) {
			if(pair.getValue()>1) {
				System.out.println(pair.getKey()+" "+pair.getValue());
			}
		}
		
		

	}

}
