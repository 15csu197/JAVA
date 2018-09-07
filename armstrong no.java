/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{ //armstrong no
    static int armstrong(int n)
    {int n1=n;
    int s=0;
        int r;
        while(n>0)
        {
        r=n%10;
        s=s+r*r*r;
        n=n/10;
            }
        if(s==n1)
        {
            return 1;
        }
        else{
            return 0;
        }
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ans=armstrong(n);
		System.out.println(ans);
	    	}
}
