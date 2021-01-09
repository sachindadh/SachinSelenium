package array;

import java.util.Arrays;

public class Array_Odd
{

	public static void main(String[] args) 
	{
		int[] x= {2,5,3,8,-1};
		for (int i = 0; i <= x.length-1; i++) 
		{
			if(x[i]%2==1)
			{
			}
			
		}
		Arrays.sort(x);
		System.out.println("Highest odd number is " + x[3]);
	}

}
