package EmployeeConsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeMain 
{
	public int id;
	public String name;
	public double salary;
	public String address;
	public String depname;
	public int depid;
	static Scanner sc=new Scanner(System.in);
	static List<EmployeeDetails> al=new ArrayList<>();
	public void getData()
	{
		System.out.println("Enter Employee Id");
		id=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Employee Name");
		name=sc.nextLine();
		System.out.println("Enter Employee Salary");
		salary=sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter Employee Address");
		address=sc.nextLine();
		System.out.println("Enter Employee Department Name");
		depname=sc.next();
		System.out.println("Enter Employee Department Id");
		depid=sc.nextInt();
		EmployeeDetails data=new EmployeeDetails(id,name,salary,address,depname,depid);
		al.add(data);
	}
	public void fetchData(int empid)
	{
		boolean isTrue=true;
		for(int i=0;i<al.size();i++)
		{
			if(empid==al.get(i).getId())
			{
				System.out.println("Employee Id: "+al.get(i).getId()+" Employee Name: "+al.get(i).getName()+" Employee Salary: "+al.get(i).getSalary()+" Employee Address: "+al.get(i).getAddress()+" Employee Department Name: "+al.get(i).getName()+" Employee Department Id: "+al.get(i).getDepid());
				isTrue=false;
			}
		}
		if(isTrue)
		{
			System.out.println("Employee Not Fount");
		}
	}
}
