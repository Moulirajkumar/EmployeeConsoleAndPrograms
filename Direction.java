package patterns;

import java.util.Scanner;

public class Direction
{
	static Scanner sc=new Scanner(System.in);
	public void logic()
	{
		System.out.println("Enter the Number");
		int n=sc.nextInt();
		int count=1;
		for(int i=0;i<n+2;i++)
		{
			if(i==0||i==n+1)
			{
				System.out.println("*");
				continue;
			}else
			{
				System.out.print("*");
			}
			int k=1;
			for(int j=0;j<count;j++)
			{
				if(j<count/2)
				{
					System.out.print(k++);
				}
				else if(j>count/2)
				{
					System.out.print(--k);
				}
				else if(j==count/2)
				{
					System.out.print(k);
				}
			}
			System.out.println("*");
			if(i<=n/2)
			{
				count=count+2;
			}
			else
			{
				count=count-2;
			}
		}
	}
	public static void main(String[] args) {
		new Direction().logic();
	}
}
