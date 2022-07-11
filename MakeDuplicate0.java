package Programs;

import java.util.Arrays;
import java.util.Scanner;

public class MakeDuplicate0 
{
	static Scanner sc=new Scanner(System.in);
	public void data()
	{
		System.out.println("Enter the Length of an Array");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter the Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		this.logic(arr);
	}
	public void logic(int [] arr)
	{
		int j=1;
		while(j<arr.length)
		{
			for(int i=j-1;i>0;i--)
			{
				if(arr[i]==arr[j]&& arr[i]!=0)
				{
					arr[j]=0;
				}
			}
			j++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public static void main(String[] args) {
		new MakeDuplicate0().data();
	}
}
