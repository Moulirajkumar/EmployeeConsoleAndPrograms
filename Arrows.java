package patterns;

import java.util.Scanner;

public class Arrows 
{//
	static Scanner sc=new Scanner(System.in);
	public void arrows()
	{
		System.out.println("Enter the number");
		int n=sc.nextInt();
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==n/2||i-j==n/2||i+j==n/2)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
//				if(i<n/2) {
//				if(j-i==n/2)
//				{
//					System.out.print("*");
//				}
//				else
//				{
//					System.out.print(" ");
//				}
//				}
//				if(i==n/2)
//				{
//					System.out.print("*");
//				}
//				if(i>n/2)
//				{
//					if(i+j==n+2)
//					{
//						System.out.print("*");
//					}
//					else
//					{
//						System.out.print(" ");
//					}
//				}
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new Arrows().arrows();
	}
}
