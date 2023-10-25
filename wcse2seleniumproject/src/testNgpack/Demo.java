package testNgpack;

import org.testng.Reporter;
import org.testng.annotations.Test;

import zmq.socket.reqrep.Rep;
 
public class Demo 		// There is no need to use any main method becouse of alreday @Test is there
{
  @Test					// it will perform like main method 
  public void f()
  {
	  Reporter.log("sunday",true);// it id used to print the value
	  
	  
  }
  @Test
  public void m1 ()
  {
	  Reporter.log("hi");
	  
  }
  @Test
  public void m2()
  {
	  Reporter.log("123");
	  
  }
}
