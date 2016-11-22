package task;
import java.util.*;
public class TaskSec {

	public static void main(String[] args) {
		String s="aabacba";
		 Map<Character, Integer> m1 = new HashMap<Character, Integer>();
	        char[] chrs = s.toCharArray();
	        for(Character ch:chrs){
	            if(m1.containsKey(ch)){
	                m1.put(ch, m1.get(ch)+1);
	            } else {
	                m1.put(ch, 1);
	            }
	        }
	        Set<Character> keys = m1.keySet();
	        for(Character ch:keys){
	            if(m1.get(ch) > 1){
	                System.out.println(ch+"--->"+m1.get(ch));
	            }
	        }
	
	}

}
