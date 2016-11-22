package task;

import java.util.ArrayList;
import java.util.List;

public class ObjectSize {

	public static void main(String[] args) {
		Runtime r = Runtime.getRuntime();
		long mem1, mem2;
		List<String> li=new ArrayList<String>();
		System.out.println("Total memory is: " +
		r.totalMemory());
		mem1 = r.freeMemory();
		System.out.println("Initial free memory: " + mem1);
		
		for(int i=0; i<1000; i++)
		{
		li.add(Integer.toString(i));
		}
		mem2 = r.freeMemory();
		System.out.println("Free memory after allocation: "+ mem2);
		System.out.println("Memory used by allocation: " + (mem1-mem2));
		// discard Integers
		li.clear();
		r.gc(); // request garbage collection
		mem2 = r.freeMemory();
		System.out.println("Free memory after collecting" +" discarding list " + mem2);
	}

}
