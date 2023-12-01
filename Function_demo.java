package Example;
import java.util.Scanner;
public class Function_demo {
	static int i,cal,size=100,j;
	static int[] num=new int[size];
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		GRT();	
		ascending();
		descending();
		
	}
	
	public static void accept()
	{
		 //local var
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size");
		size=sc.nextInt();
		
		 // Array 
		
		System.out.println("Enter "+size+" numbers");
		// Accepting the array numbers
		for(i=0;i<size;i++)
		{
			num[i]=sc.nextInt();
		}
	}
	
	public static void GRT()
	{
		accept();
		cal=num[0];
		System.out.println("The numbers are");
		//Display the value of the array
		for(i=0;i>size;i++)
		{
			System.out.println("num="+num[i]);
			if(num[i]>cal)
			{
				cal=num[i];
			}
			
		}
		System.out.println("The greatest Number is ="+cal);
	}
	public static void ascending()
	{
		//display Descending order
		int temp;
		for(i=0;i<size;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]>num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Display Ascending order");
		display();
	}
	public static void descending()
	{
		//display Descending order
		int temp;
		for(i=0;i<num.length;i++)
		{
			for(j=i+1;j<size;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
		}
		System.out.println("Display descending order");
		display();
	}
	public static void display()
	{
		for(i=0;i<size;i++)
		{
			System.out.println(num[i]+" ");
		}
		System.out.println();
	}
}
