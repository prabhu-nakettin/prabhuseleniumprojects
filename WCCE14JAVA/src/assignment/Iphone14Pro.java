package assignment;

public class Iphone14Pro extends Iphone14 // multi level inheritence
{
	String color;
	
	Iphone14Pro(String mobileseriesname,String featuresname,String color) 
	{
		super(mobileseriesname, featuresname);
		this.color=color;
	}
	public void supportFor5gNetWork() 
	{
		System.out.println("I Phone Support 5G NetWork");
		
	}
	public static void main(String[] args) 
	{
		Iphone14Pro i=new Iphone14Pro("Iphone13", "good camera", "gold");
		System.out.println(i.mobileseriesname);
		System.out.println(i.featuresname);
		System.out.println(i.color);
		i.makeCalls();
		i.unLockByFingerPrint();
		i.supportFor5gNetWork(); 
	}
}

		
		
		
	


	
	