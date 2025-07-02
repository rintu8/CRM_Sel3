
public class KnowledgeDocumentation {
	
	
	
	
	
	//Important youtube links
//	1. https://www.youtube.com/watch?v=rb5OL-QQPw4&t=623s : Selenium + Jenkins + GIT Integration : Run your Test 
	//Cases from GIT Hub using Jenkins
	
	// 2. https://www.youtube.com/watch?v=LxJzeiTQGoE : Page Object Model (POM) 
	//Design With Selenium - Part -2


//To explain POM, i have created a package "Pages" and "test" under src/test/java.In "Pages, 
	//i have created a class "google search page".In test , 
	//i have created "googlesearch.java".This combined is the structure of POM
//You can observe that in Google search.java, i am importing "googlesearchpage.java" , 
//because i hve created page objects on googlesearchpage.java, and i can call these
//page objects from googlesearch.java
 
//What is Page object model : its a design pattern to manage the testcases and the page objects
	
//============================================

//This is link for cucumber : https://www.youtube.com/watch?v=4e9vhX7ZuCw
/* for cucumner i have created 2 classes.First i created  a folder Features 
 * under src/test/resources. Under features, i created a file "Login1.feature".
 * In Login 1, i have writtem the cucumber testcase.
 * Under  src/test/java , i have created a folder "StepDefs".Under this folder, i have created
 * class "LoginSteps.java"
 * For each of the step in "Login1.feature" , i have created a method in "LoginSteps.java"
 * Some of the preconditions for cucumber is adding dependencies for cucumber.
 * Also on eclipse, go to Help>>eclipse marketplace and install cucumber dependency
 * On the "Login1.feature" , right click and run as cucumber
 * 
 * 
 * ==>I re did cucumber by following https://www.youtube.com/watch?v=vHzMJuc9Zuk&list=PLFGoYjJG_fqoBFPevCDZDCufDX5h-o3yO&index=1
 * 
 * 
 * 
 * ======================================================== */
	
	//Jenkins : Can refer video : https://www.youtube.com/watch?v=lPxrPqSyCo8 and 
	//https://www.youtube.com/watch?v=rb5OL-QQPw4&t=623s
	
	//commant to launch jenkins
	//java -jar C:\Users\rintu.george\Downloads\jenkins.war --enable-future-java

	
	//===========================================================================

	
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
