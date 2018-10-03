package lapTopDataBase;

public class LapTop 
{
	
	String companyname;
	String model;
	int id;
	double price;
	int warrenty;
	int size;
	double rating;
	
	
	public LapTop(String companyname, String model, int id, double price, int warrenty, int size, double rating) 
	{
		super();
		this.companyname = companyname;
		this.model = model;
		this.id = id;
		this.price = price;
		this.warrenty = warrenty;
		this.size = size;
		this.rating = rating;
	}
	
	
	public LapTop() 
	{
		// TODO Auto-generated constructor stub
	}


	public boolean display()
	{
		System.out.println("Company Name 	:"+companyname);
		System.out.println("Laptop Model 	:"+model);
		System.out.println("Laptop id    	:"+id);
		System.out.println("Laptop Price 	:"+price);
		System.out.println("Laptop Warrenty	:"+warrenty);
		System.out.println("Laptop Size	:"+size);
		System.out.println("Laptop Rating	:"+rating);
		System.out.println();
		return true;
		
	}
}
