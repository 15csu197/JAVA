/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{//union of 2 arrays
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int a[]=new int[10];
	int b[]=new int[10];
	int n1=sc.nextInt();
	int n2=sc.nextInt();
	int x=n1+n2;
	int c[]=new int[x];
	int i,j,k;
	for(i=0;i<n1;i++)
	{
	a[i]=sc.nextInt();   
	}
	for(i=0;i<n2;i++)
	{
	b[i]=sc.nextInt();   
	}
	
	for(i=0;i<n1;i++)
	{
	 System.out.print(a[i]);   
	}
	
	 System.out.println(" "); 
	for(i=0;i<n2;i++)
	{
	    
	 System.out.print(b[i]); 
	}
	
	 System.out.print(" ");
	 i=0;k=0;j=0;
while(i<n1&&j<n2)
{
    if(a[i]<b[j])
    {
                c[k]=a[i];

        i++;k++;
    }
    else if(a[i]>b[j])
    {
                c[k]=b[j];

        j++;k++;
    }
    else{
        c[k]=a[i];
        i++;k++;j++;
    }
}
if(i==n1)
{
    while(j<n2)
    {
            c[k]=b[j];

        j++;k++;
        
    }
}
for(i=0;i<k;i++)
{
    System.out.print(c[i]);
}
}
	    
	}
