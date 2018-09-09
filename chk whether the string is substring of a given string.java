/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    String str=sc.nextLine();
    int c=str.length();
    int i,j,flag=0;
    String str1=sc.nextLine();
    int d=str1.length();
    if(c==d)
    {
        if(str1.equals(str))
        {
            System.out.printf("yes");
        }
        else{
                System.out.printf("no");
    }}
    else 
    {
        char a[]=str.toCharArray();
        char b[]=str1.toCharArray();
        Arrays.sort(a);
        Arrays.sort(b);
    int n=a.length;
    int n1=b.length;
    for(i=0;i<=n1-1;i++)
        {   if(a[i]==b[i])
            {
                flag=1;
                for(j=i+1;j<n1-1;j++)
            {
               if(a[j]==b[j])
               {
                   continue;
               }
               else{
                   flag=0;
                   break;
               }
            }
            }
            else{
                continue;
            }
        }
        
            if(flag==1)
            {
                System.out.printf("yes");
            }
            else
            {
                System.out.printf("no");
            
            }
        
    }
}
}