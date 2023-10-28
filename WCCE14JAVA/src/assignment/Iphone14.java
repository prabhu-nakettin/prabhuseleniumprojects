package assignment;

public class Iphone14 extends Iphone13 //multi level inheritence
{
	String featuresname;
	
	Iphone14(String mobileseriesname,String features)
	{
		super(mobileseriesname);
		this.featuresname=featuresname;
		
	}
	public void unLockByFingerPrint()
	{
		System.out.println("new Features for Iphoine");
	}
	
}
