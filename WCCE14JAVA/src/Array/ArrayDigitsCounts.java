package Array;

public class ArrayDigitsCounts   // to count the given digits number for useing Array and reverse it 
{
	public static void main(String[] args) {

		int num=325;
		int count=0; //1,2,3
		
		System.out.println("digits of"+num+" Reversed is"); //num=325
		
		while(num>0)  //325>0=T//32>0=T// 3>0=T  //0>0=F
		{
			count++;
			System.out.println(num%10); //325%10=5//32%10=2// 3%10=3//
			
			num=num/10;// 325/10=32// 32/10=3// 3/10=0;		
		}
		System.out.println("count of digits is " +count);  //OP	// 	5
																//	2																//	3	
	}
}
