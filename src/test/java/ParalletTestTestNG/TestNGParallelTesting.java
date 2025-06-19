package ParalletTestTestNG;

import org.testng.annotations.Test;

//How to Run testcases in Parallel.Take the example of below.
//==============================================================

//==>This link can be referred for steps : https://www.youtube.com/watch?v=1Y6knVutUsI

//Right click on this class and select TestNG.
//Select "Convert to TestNG" and we will see an xml file.
// Give name as any name in location field.I gave ""testng1.xml".
//Give suite name and testname as "Suite1" and "Test1".
//Select Parallel mode as "methods" and thread counts as what value we wat.In my case i will select 2.
//Click Finish.Now a xml file will be created as "testng1.xml"
//Right click on the testcase and run as TestNG
//To confirm its running in parallel add the thread id in below 2 methds so that result will show thread ID.2 unique thread ids 
//will be seen indicating that 2 methods were run parallely in seperate threads
//Note : If you see errors in formatting on testng1.xml, just go to window>>preference,Maven and enable "download artifact javadoc"
// and "Download repository index"


public class TestNGParallelTesting {
	
	@Test
	public void Test1(){
		
		System.out.println("I am inside Test1 : " +Thread.currentThread().threadId());
	}
	
	@Test
public void Test2(){
		
	System.out.println("I am inside Test2 : " +Thread.currentThread().threadId());
		
	}

}
