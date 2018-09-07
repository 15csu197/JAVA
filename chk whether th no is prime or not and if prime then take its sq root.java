/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{ //chk whether th no is prime or not and if prime then take its sq root.
    static double prime(int n)
    {int flag=0;
int i;
        for(i=2;i<=n/2;i++)
        {
            if(n%i==0)
            {
                flag=1;
                break;
            }
        }
    if (flag==0)
    {
        return Math.sqrt(n);
    }
     else 
     {
         return -1;
         
     }   
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double ans=prime(n);
		System.out.println(ans);
	    	}
}
