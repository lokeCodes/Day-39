// https://www.codechef.com/problems/FARFROMO
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int d = s.nextInt();
		    double res1 = Math.sqrt(a*a + b*b);
		    double res2 = Math.sqrt(c*c + d*d);
		    
		    if(res1==res2){
		        System.out.println("Equal");
		    }else if(res1 > res2){
		        System.out.println("Alex");
		    }else{
		        System.out.println("Bob");
		    }
		  
		}
	}
}
