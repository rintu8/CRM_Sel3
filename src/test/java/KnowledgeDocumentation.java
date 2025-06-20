
public class KnowledgeDocumentation {

	
	/* 
	 * 
	 * Link for Allure report integation with with Test NG : https://www.youtube.com/watch?v=5b4ZMAjHitw
		Steps in brief:
		  1. I already have a testcase under src/test/java
		  2. Create a xml filse by right clicking this testcase fole and "Convert to TestNG"
		  3. On this new xml file, right click and run.This is justa randoim run so hat the 
		  Allure-results foder gets generated.See left.
		  4. Right click on this allure-results and ger path.On cmd, go to this path
		  Run the commant allure-result <above path of allure results>>
	
	Next to add screenshots to reports:
		first add few depenencies on pom.xml as spefified in https://www.youtube.com/watch?v=bFQqo45Nh60&t=391s
			in 11th minute
			You can get the dependencies for TestNG from https://allurereport.org/docs/testng/
				Also add Maven complier plugin
				Also add a line under properties tag as below
				==> <aspectj.version>2.24.0</aspectj.version>
				
				
	Next create TestNG Listener class.But This is not needed as of now.For learning purpose, only abobve point 1 to 4 
	needed
	
	
	
	*/
}
