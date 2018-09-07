/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{//pascal triangle
	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   int i,j,r,k,n=1;
   r=sc.nextInt();
   for(i=0;i<r;i++)
   {
       for(k=r;k>i;k--)
       {
           System.out.print(" ");
       }
       n=1;
       for(j=0;j<=i;j++)
       {
           System.out.print(n+" ");
           n=n*(i-j)/(j+1);
       }
           System.out.println();
       
   }
	}
}
