package task;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class ShortestPath {

	int matrix[][]=new int[4][4];
	int arr[]={1,5,7,6,9,2,5,4,3,3,9,11,2,11,1,7};
	Map<String,Integer>map=new HashMap<String,Integer>();
	int k=0;int strt_in;int end_in;
	String path="";
	int temp=strt_in;
	int x1=0,y1=0;
	int min;
	 boolean  flagrt=false,flagda=false,flagdw=true;
	public ShortestPath() {
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<4;j++)
			{
				matrix[i][j]=arr[k];
				k++;
			}
			
		}
		for(int l=0;l<4;l++)
		{
			for(int h=0;h<4;h++)
			{
				
						System.out.print(matrix[l][h]+" ");
					
						
			     
			}
			System.out.println();
		}
		strt_in=matrix[0][0];
		end_in=matrix[3][3];
		path=Integer.toString(strt_in);
		System.out.println("------");
		//System.out.println(strt_in+" "+end_in);
	}
	public void pathFind(int node,int x,int y )
	{
		temp=node;
		x1=x;
		y1=y;
		int rght=0, dia=0,dwn=0;
		int x2=0,y2=0;
		 boolean rt=false,dw=false,da=false;
		 boolean  flagrt=false,flagda=false,flagdw=true;
		if(temp==end_in){
			if(flagdw)
			{
				map.put(path, cost(path));
				flagda=true;
				flagdw=false;
				return;
			}	
			if(flagda)
			{
				map.put(path, cost(path));
				flagrt=true;
				flagda=false;
				return;
			}
			if(flagrt)
			{
				map.put(path, cost(path));
				
				flagrt=false;
				return;
			}
	
			}
		else{
		
		if(x1<3 & y1<3 ){rt=true; dw=true;da=true;}
		if(x1==3 & y1<3 ){rt=true; dw=false;da=false;}
		if(x1<3 & y1==3 ){rt=false; dw=true;da=false;}
		if(rt) {rght=matrix[x1][y1+1];}
		if(dw) {dia=matrix[x1+1][y1+1];}
		if(da){ dwn=matrix[x1+1][y1];}
		if(rt&dw&da)
		{ 
			if(flagdw)
			{
				path=path+"+"+dwn;
				x2=x1+1;y2=y1;temp=dwn;
				pathFind(temp, x2, y2);
			}
			if(flagda)
			{
				path=path+"+"+dia;
				x2=x1+1;y2=y1+1;temp=dia;
				pathFind(temp, x2, y2);
			}
			if(flagrt)
			{
				path=path+"+"+rght;
				x2=x1;y2=y1+1;temp=rght;
				pathFind(temp, x2, y2);
			}
			
			
		}
		if(rt&dw==false&da==false)
		{ 
			path=path+"+"+rght;
			x2=x1;y2=y1+1;temp=rght;
			pathFind(temp, x2, y2);
		}
	   if(rt==false&da==false & dw==true )
		{ 
		   path=path+"+"+dwn;
			x2=x1+1;y2=y1;temp=dwn;
			pathFind(temp, x2, y2);
			
		}
	
		
		}
		
	
	
		
	}
	public int  cost(String path) {
		String str=path;
		String arr[]=str.split("\\+");
		int sum=0;
		for (int i = 0; i < arr.length; i++) {
			sum=sum+Integer.parseInt(arr[i]);
		}
		return sum;
	}

	
	public static void main(String[] args) {
	
	ShortestPath sp=new ShortestPath();
	sp.pathFind(sp.matrix[0][0],0,0);
	
	
	
	Set<String> cc=sp.map.keySet();
	Iterator< String> it=cc.iterator();
	while (it.hasNext()) {
		System.out.println(it.next());
	}
	int min_cost=Collections.min(sp.map.values());
	for (Entry< String, Integer> entry : sp.map.entrySet()) {
        if (entry.getValue().equals(min_cost)) {
            System.out.println(entry.getKey());
        }
    }
	System.out.println("min cost :"+min_cost+" and shortest path is "+sp.path);
	
	
	
	

}
}
