// https://www.codechef.com/problems/DIFFSUM
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
		int y = s.nextInt();
		int res = x>y ? x-y : x+y;
		System.out.println(res);
	}
}
