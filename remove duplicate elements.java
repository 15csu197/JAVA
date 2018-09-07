/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
 public class Main{
     
    public static void main(String arg[])
    {int f=0;//remove duplicate elements
        HashMap<String,Integer> hmap = new HashMap<String,Integer>();
        //String a[]={"sahil","rahul","taneja","sahil","taneja","sahil"};
        Scanner sc = new Scanner(System.in);
        String ss= sc.nextLine();
        
        String str1[]=ss.split(" ");
        for(String str:str1)
        {

        if(hmap.containsKey(str))
{        f=hmap.get(str).intValue();
        
            hmap.put(str,f+1);
            }
            else{
                hmap.put(str,1);
            }
           
            }
        Set<String> ssd=hmap.keySet();
        for(String it:ssd)
        {
            if(hmap.get(it)>1)
            {

                hmap.put(it,0);
            }
            
            System.out.println(it+hmap.get(it));
            
        }   
    
        }
}