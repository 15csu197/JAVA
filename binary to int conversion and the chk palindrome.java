/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{ //binary to int conversion and the chk palindrome.
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    String str;
	    str=scan.nextLine();
	    int dec = Integer.parseInt(str,2);
	        System.out.println(dec);
	    
	    int n=dec;
	    int r;int n1=0;
	    while(n!=0)
	    {
	    r=n%10;
	    n1=n1*10+r;
	    n=n/10;
	    }
	    if(n1==dec)
	    {
	        System.out.println("palindrome");
	    }
	else{
	       System.out.println("not palindrome");
	    
	    
	}
	    
	}
	
}
