/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.*;
public class Main
{
	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);    
//sparse matrix
    int a[][]=new int[10][10];
  int zero=0;int nonzero=0;
	    int i,j,k;
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<3;j++)
	    {
	     a[i][j]=sc.nextInt();
	    }
	    }
	    for(i=0;i<3;i++)
	    {
	        for(j=0;j<3;j++)
	    {
	      if(a[i][j]==0)
	    {
	        zero++;
	    }
	    else{
	        nonzero++;
	    }
	    
	    }}
	if(zero>nonzero)
	{
	System.out.println("sparse");
	    
	}
	    else{
	        
	System.out.println("nonsparse");
	    }
	}
	
 }