package Programs;

import java.util.Scanner;

public class Encryption 
{
	static Scanner sc=new Scanner(System.in);
	public void logic()
	{
		System.out.println("Enter String 1: ");
		String str1=sc.next();
		System.out.println("Enter String 2: ");
		String str2=sc.next();
		//String result="";
		for(int i=0;i<str1.length();i++)
		{
			int temp=((str1.charAt(i)+str2.charAt(i)));
//			System.out.println(temp);
			temp=temp%'a'+1;
//			System.out.println(temp);
			if(temp+'a'>'z')
			{
				temp=temp-26;
			}
//			System.out.println(temp);
			System.out.print(Character.toChars(temp+'a'));
		}
	}
	public static void main(String[] args) {
		new Encryption().logic();
	}
}
