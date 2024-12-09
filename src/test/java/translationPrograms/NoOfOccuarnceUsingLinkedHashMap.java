package translationPrograms;

import java.util.LinkedHashMap;
import java.util.Map;

public class NoOfOccuarnceUsingLinkedHashMap {

	public static void main(String[] args) {
		String s="Ravikumarreddy";
        LinkedHashMap<Character,Integer> map=new LinkedHashMap();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(!map.containsKey(ch)){
                map.put(ch,1);
            }
            else{
                Integer value=map.get(ch);
                value++;
                map.put(ch,value);
            }
        }
        System.out.println(map);
        for(Map.Entry<Character,Integer> pair:map.entrySet()){
            if(pair.getValue()==1){
            System.out.println(pair.getKey()+" "+pair.getValue());
            }
        }

	}

}
