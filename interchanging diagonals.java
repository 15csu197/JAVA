/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class Main
{//interchanging diagonals
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    

    int a[][]=new int[10][10];
  //int zero=0;int nonzero=0;
	    int i,j,k;
	   int n=3;
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	    {
	     a[i][j]=sc.nextInt();
	    }
	    }
	    for(i=0;i<n;i++)
	    {
	        for(j=0;j<n;j++)
	    {
	    
	        System.out.print(a[i][j]+" ");

	    }
	   	        	        	        	        System.out.println(" ");

	    }
	    for(j=0;j<n;j++)
	    {
	    
	        int temp=a[j][j];
	        a[j][j]=a[j][n-1-j];
	        a[j][n-1-j]=temp;
	        
	        
	    }
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<3;j++)
	    {
	    
	        System.out.print(a[i][j]+" ");

	    }
	    	        	        	        System.out.println(" ");

	    }
	    
	}
	
 }