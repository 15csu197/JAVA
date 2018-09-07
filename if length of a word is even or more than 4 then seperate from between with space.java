/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{ // if length of a word is even or more than 4 then seperate from between with space.
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
   
   
    String ss=sc.nextLine();
        int i;
   String str[]=ss.split(" "); 
   
   for (i=0;i<ss.length();i++)
                {
                    int n=str[i].length();
                    if(n%2==0 && n>=4)
                    {
                        System.out.print(str[i].substring(0,n/2)+" "+str[i].substring(n/2,n));
                    }
               
                    
                }
                
   
   	}
}
