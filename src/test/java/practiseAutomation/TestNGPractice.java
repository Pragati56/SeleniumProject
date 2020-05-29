package test.java.practiseAutomation;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGPractice {

	
	
	
	    @Test
	    public void f() {
	    	System.out.println("inside test");
	    }
	 
	    @BeforeTest
	    public void beforeTest() {
	    	System.out.println("inside before test....");
	    }
	    
	    @BeforeClass
	    public void beforeClass() {
	    	System.out.println("inside before Class");
	    }
	    @BeforeSuite
	    public void beforeSuite() {
	    	System.out.println("inside before Suite");
	    }
	 
	 
	    @AfterTest
	    public void afterTest() {
	    }
	}
	

