package task;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskThird {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s=" amit sumit namit amit amit sumit";
		 Map<String, Integer> m1 = new HashMap<String, Integer>();
	        String[] s1 = s.split(" ");
	        for(String ch:s1){
	            if(m1.containsKey(ch)){
	                m1.put(ch, m1.get(ch)+1);
	            } else {
	                m1.put(ch, 1);
	            }
	        }
	        Set<String> keys = m1.keySet();
	        for(String ch:keys){
	            if(m1.get(ch) > 1){
	                System.out.println(ch);
	          
	        }
	}

}
}
