package assignment;

public class Student extends Qspider  // single level inheritence
{
	String name;
	 
	Student(int sid,String name)
	{
		super(sid);
		this.name=name;
	}
	public static void main(String[] args) 
	{
		Student s=new Student(1111,"Om sai");
		System.out.println(s.sid);
		System.out.println(s.name);
	
		
		
	}

}
