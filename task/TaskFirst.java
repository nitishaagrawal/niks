package task;




public class TaskFirst {

	public static void main(String[] args) {
		int []a={2,3,9,5,6,1,7,13,15,11};
		int cn=0;
		for(int h1=0; h1<a.length-1;h1++){if(a[h1]>a[h1+1]){cn++;}}
		System.out.println(cn);
		int[][]b=new int[cn+1 ][a.length];
		int[] column_count=new int[cn+1];
		int count,i=0,j=0;
for(int x=0;x<=a.length-1;x++)
{
	if(x!=a.length-1)
	{
		 if(a[x]<a[x+1]){
			// System.out.println("1st if");
		b[i][j]=a[x];	
			
			/*System.out.println("x="+x);
			System.out.println("i="+i);
			System.out.println("j="+j);
			System.out.println("b["+i+"]["+j+"]"+b[i][j]);*/
			j++;
		 }
		if(a[x]>a[x+1])
		{
			// System.out.println("2nd if");
			b[i][j]=a[x];
			
			/*System.out.println("x="+x);
			System.out.println("i="+i);
			System.out.println("j="+j);
			System.out.println("b["+i+"]["+j+"]"+b[i][j]);*/
			column_count[i]=j+1;
			i++;
			j=0;
		}
    }
	if(x==a.length-1)
	{
		 //System.out.println("3rd if");
		b[i][j]=a[x];
		/*System.out.println("x="+x);
		System.out.println("i="+i);
		System.out.println("j="+j);
		System.out.println("b["+i+"]["+j+"]"+b[i][j]);*/
	}
	
}
int max_count=0;
for(int l=0;l<=i;l++)
{
	if(max_count<column_count[l])
	{
		max_count=column_count[l];
	}
}
System.out.println("longest length array "+max_count);
for(int l=0;l<=i;l++)
{
	for(int h=0;h<max_count;h++)
	{
		if(b[l][h]!=0)
		{
				System.out.print(b[l][h]+" ");
			
				
	     }
	}
	System.out.println();
}



	}
	}

