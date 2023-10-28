package AtmAssignment;

public class Bank // parent 
{
	String name;
	float acNumber;
	private double bal;
	private int pin;
	
	Bank(String name,float acNumber,double bal,int pin)
	{
		this.name=name;
		this.acNumber=acNumber;
		this.bal=bal;
		this.pin=pin;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public float getAcNumber() {
		return acNumber;
	}

	public void setAcNumber(float acNumber) {
		this.acNumber = acNumber;
	}

	public double getBal() {
		return bal;
	}

	public void setBal(double bal) {
		this.bal = bal;
	}
	public int getPin()
	{
		return this.pin;
	}
	public void setPin(int pin)
	{
		this.pin=pin;
	}
	public void getDetails()
	{
		System.out.println("Details of Customer");
		System.out.println("Name:"+name+",\nAccountNo:"+acNumber+",\nBalane:"+bal+",\nPincode:"+pin+"");
	}
	
	
		
}  

