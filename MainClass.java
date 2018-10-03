package lapTopDataBase;

import java.util.Scanner;

public class MainClass 
{
	public static void printLapTopInfo(LapTop[] a)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("enter laptop index");
		int s = obj.nextInt();
		for (int i=0;i<a.length;i++);
		{
			System.out.println("***Your Wanted Laptop Information***");
			System.out.println();
			System.out.println(a[s].display());
			System.out.println("***End of Laptop Details***");
			System.out.println();
		}
	}

	public static LapTop getTopLapTop(LapTop[] a)
	{
			int max = 0;
			for (int i=0;i<a.length;i++)
			{
				if (a[i].price > a[max].price)
				{
					max = i;
				}
			}
			System.out.println("***Top Priced Laptop***");
			System.out.println();
			System.out.println(a[max].display());
			System.out.println("***End of Top Priced Laptop Details***");
			return null;	
	}

	public static LapTop getLowRatingLapTop(LapTop[] a)
	{
		int min = 0;
		for (int i=0;i<a.length;i++)
		{
			if (a[i].rating > a[min].rating)
			{
				min = i;
			}
		}
		System.out.println(a[min].rating);
		System.out.println(a[min].display());
		return null;
	}
	
	public static LapTop findLapTop(int id, LapTop[] a)
	{
		for (int i=0;i<a.length;i++);
		{
			
			System.out.println(a[id].display());
		}
		return null;
	}
	
	public static LapTop[] sortByIdLapTop(LapTop[] a)
	{
		for (int j=0;j<a.length;j++)
		{
		int max = j;
		for (int i=j;i<a.length;i++)
		{
			if (a[i].id > a[max].id)
			{
				max = i;
			}
		}
		LapTop t = a[max];
		a[max] = a[j];
		a[j] = t;
		System.out.println(t.display());
		}
		return a;
	}
	
	public static LapTop[] sortByRating(LapTop[] a)
	{
		for (int j=0;j<a.length;j++)
		{
		int max = j;
		for (int i=j;i<a.length;i++)
		{
			if (a[i].rating > a[max].rating)
			{
				max = i;
			}
		}
		LapTop t = a[max];
		a[max] = a[j];
		a[j] = t;
		System.out.println(t.display());
		}
		return a;
	}
	
	public static LapTop[] sortByPrice(LapTop[] a)
	{
		for (int j=0;j<a.length;j++)
		{
		int max = j;
		for (int i=j;i<a.length;i++)
		{
			if (a[i].price > a[max].price)
			{
				max = i;
			}
		}
		LapTop t = a[max];
		a[max] = a[j];
		a[j] = t;
		System.out.println(t.display());
		}
		return a;
	}
	
	public static void printAllLapTops(LapTop[] a)
	{
		for (int i=0;i<5;i++)
		{
			System.out.print(a[i].display());
		}
	}
	
	public static void main(String[] args)
	{
		
		LapTop[] a = new LapTop[5];
		for (int i=0;i<5;i++)
		{
			a[i] = new LapTop();
		}
			
		a[0].companyname = "Apple";
		a[0].model = "MQD32HNA1446";
		a[0].id = 1;
		a[0].price = 61990.00;
		a[0].warrenty = 1;
		a[0].size = 25;
		a[0].rating = 4.9;
		
		a[1].companyname = "Microsoft";
		a[1].model = "1769";
		a[1].id = 2;
		a[1].price = 140990.00;
		a[1].warrenty = 1;
		a[1].size = 27;
		a[1].rating = 4.5;
		
		a[2].companyname = "Allienware";
		a[2].model = "ALW-243";
		a[2].id = 3;
		a[2].price = 219994.00;
		a[2].warrenty = 2;
		a[2].size = 32;
		a[2].rating = 3.5;
		//a[2].display();
		
		a[3].companyname = "Lenovo";
		a[3].model = "330-14IKB";
		a[3].id = 4;
		a[3].price = 29990.00;
		a[3].warrenty = 1;
		a[3].size = 25;
		a[3].rating = 1.0;
		
		a[4].companyname = "Acer";
		a[4].model = "SW110-ICT";
		a[4].id = 10;
		a[4].price = 12490.00;
		a[4].warrenty = 1;
		a[4].size = 22;
		a[4].rating = 4.0;
		
		
		//printLapTopInfo(a);
		//getTopLapTop(a);
		//sortByPrice(a);
		//sortByRating(a);
		//sortByIdLapTop(a);
		getLowRatingLapTop(a);
		Scanner obj = new Scanner(System.in);
		System.out.println("enter laptop index");
		int id = obj.nextInt();
		findLapTop(id,a);
		sortByIdLapTop(a);
		sortByRating(a);
		sortByPrice(a);
		printAllLapTops(a);
	}
}















	/*public static void printLapTopInfo(LapTop q)
	{
		System.out.println(" enter the laptop index your want display :");
		
		
	}
	
	public static LapTop getLapTop(LapTop[]n)
	{
		int ind=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i].price>n[ind].price)
			{
				ind =i;
			}
		}
		System.out.println(n[ind].display());
		return n;
	}
	
	public static LapTop getLowRating(LapTop[]n)
	{
		int ind=0;
		for(int i=0;i<n.length;i++)
		{
			if(n[i].ratings > n[ind].ratings)
			{
				ind =i;
				
			}
			while(n[i].ratings==ind)
			{
				System.out.println(n[i].display());
				break;
			}
		}
		return n;
	}
	
	public static LapTop findLapTop(int id, LapTop[]n)
	{
		int key=id;
		
		
		return null;
	}
	
	public static LapTop[] sortLapTopById(LapTop[]n)
	{
		for(int i=0;i<n.length;i++)
		{
			int max=i;
			for(int j=i;j<n.length;j++)
			{
				if(n[i].id<n[max].id)
				{
					max=i;
				}
			}
			LapTop t=n[max];
			n[max]=n[i];
			n[i]=t;
			System.out.println(t.display());
		}
		return n;
	}
	
	public static LapTop[] sortLapTopByRatings(LapTop[]n)
	{
		for(int i=n.length-1;i>=0;i--)
		{
			int max=i;
			for(int j=0;j<i;j++)
			{
				if(n[i].ratings>n[max].ratings)
				{
					max=i;
				}
			}
			LapTop t=n[max];
			n[max]=n[i];
			n[i]=t;
			System.out.println(t.display());
		}
		return n;
	}
	
	public static LapTop[] sortByPrice(LapTop[]n)
	{
		
		return null;
	}
	
	public static void printAllLaptops(LapTop[]n)
	{
		//for(int i=0;i<5;i++)
		{
			//System.out.println(n[i].display());
		}
	}
	
	public static void main(String[] args) 
	{
		LapTop[] n=new LapTop[10];
		for(int i=0;i<10;i++)
		{
			n[i]=new LapTop();
		}
		//System.out.println(" First LapTop details :");
		System.out.println();
		n[0].id=2;
		n[0].ratings=4;
		n[0].warrantyPeriod=1;
		n[0].price=55000.2;
		n[0].width=16.2;
		n[0].height=7.2;
		n[0].company="Dell";
		n[0].model="Inspiron 15";
		//n[0].display();
		
		//System.out.println();
		//System.out.println();
		//System.out.println(" second laptop details");
		System.out.println();
		n[1].id=3;
		n[1].ratings=5;
		n[1].warrantyPeriod=1;
		n[1].price=70000.2;
		n[1].width=16.2;
		n[1].height=7.2;
		n[1].company="Lenovo";
		n[1].model="Inspiron 10";
		//n[1].display();
		
		//System.out.println();
		//System.out.println();
		//System.out.println(" third laptop details");
		System.out.println();
		n[2].id=4;
		n[2].ratings=3;
		n[2].warrantyPeriod=1;
		n[2].price=45000.2;
		n[2].width=14.2;
		n[2].height=5.2;
		n[2].company="HP";
		n[2].model="AMD-HU89";
		//n[2].display();
		
		//System.out.println();
		//System.out.println();
		//System.out.println(" four laptop details");
		System.out.println();
		n[3].id=5;
		n[3].ratings=1;
		n[3].warrantyPeriod=1;
		n[3].price=40000.2;
		n[3].width=14.2;
		n[3].height=5.2;
		n[3].company="ASUS";
		n[3].model="AMD-5454";
		//n[3].display();
		
		
		//System.out.println();
		//System.out.println();
		//System.out.println(" five laptop details");
		System.out.println();
		n[4].id=1;
		n[4].ratings=4;
		n[4].warrantyPeriod=2;
		n[4].price=80000.2;
		n[4].width=14.2;
		n[4].height=5.2;
		n[4].company="Panasonic";
		n[4].model="330-14IKB";
		//n[4].display();
		
		//printAllLaptops(n);
		//findLapTop(4,n);
		//getLapTop(n);
		//getLowRating(n);
		//sortLapTopById(n);
		sortLapTopByRatings(n);
	}*/

	

	


