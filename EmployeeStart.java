package EmployeeConsole;

import java.util.Scanner;

public class EmployeeStart implements Runnable
{
	static Scanner sc=new Scanner(System.in);
	public void run()
	{
		boolean isTrue=true;
		while(isTrue)
		{
			System.out.println("Enter 1 for Enter Employee Details");
			System.out.println("Enter 2 for Perticular Employee Details");
			System.out.println("Enter 3 for Exit");
			int option=sc.nextInt();
			switch(option)
			{
			case 1:
			{
				System.out.println("Enter Employee Detais Here");
				new EmployeeMain().getData();
				break;
			}
			case 2:
			{
				System.out.println("You can fetch Perticular Employee Details Here");
				System.out.println("Enter Employee Id You want");
				int id=sc.nextInt();
				new EmployeeMain().fetchData(id);
				break;
			}
			case 3:
			{
				System.out.println("Thank You");
				isTrue=false;
				break;
			}
			default:
			{
				System.out.println("Enter the Given Options Only");
			}
			}
		}
	}
	public static void main(String[] args) {
		EmployeeStart obj=new EmployeeStart();
		Thread t1=new Thread(obj);
		t1.start();
	}
}
