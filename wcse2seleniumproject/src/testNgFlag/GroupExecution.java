package testNgFlag;

import org.checkerframework.checker.fenum.qual.SwingTextOrientation;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class GroupExecution 
{
	@Test(groups = "FUNCTIONAL")			// IT IS USED TO EXECUTE THE MULTIPLE TEST CASE
	public void ft1() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st1() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it1() {

		Reporter.log("ITC is executed",true);

	}
	//............................................................................................  
	@Test(groups = "FUNCTIONAL")
	public void ft2() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st2() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it2() {

		Reporter.log("ITC is executed",true);

	}
	//....................................................................................................  
	@Test(groups = "FUNCTIONAL")
	public void ft3() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st3() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it3() {

		Reporter.log("ITC is executed",true);

	}
	//..................................................................................................... 
	@Test(groups = "FUNCTIONAL")
	public void ft4() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st4() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it4() {

		Reporter.log("ITC is executed",true);

	}

	//,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,,
	@Test(groups = "FUNCTIONAL")
	public void ft5() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st5() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it5() {

		Reporter.log("ITC is executed",true);

	}
	//..................................................................................................................
	@Test(groups = "FUNCTIONAL")
	public void ft6() {

		Reporter.log("FTC1 is Execucated!!",true);
	}
	@Test(groups = "SMOKE")
	public void st6() {

		Reporter.log("STC is executed",true);

	}

	@Test(groups ="INTEGRATION")
	public void it6() {

		Reporter.log("ITC is executed",true);

	}


}



