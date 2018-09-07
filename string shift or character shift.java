/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{ string shift/character shift
	public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ss= sc.nextLine();
    char a[]=ss.toCharArray();
    Arrays.sort(a);
    int i;
    for(i=0;i<a.length-1;i++)
    {
        a[i]=a[i+1];
    }
    String s1=Arrays.toString(a);
System.out.println(s1);
	}
}
