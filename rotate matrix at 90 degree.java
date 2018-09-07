/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{//rotate matrix at 90 degree
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a[][]=new int[10][10];
    int b[][]=new int[10][10];
    
    int n=3;
    int i;
    int j;
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
    }

    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        System.out.print(a[i][j]);
    System.out.println(" ");
        
    }   
   
 for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
     b[i][j]=a[j][i];   
    }
    int temp=0; 
        for(j=0;j<n;j++)
        {
        temp=b[j][0];
        b[j][0]=b[j][n-1];
        b[j][n-1]=temp;
    }
    
    for(i=0;i<n;i++)
    {
        for(j=0;j<n;j++)
        System.out.print(b[i][j]);
    System.out.println(" ");
        
    }   
}
}
