package TestPages;





import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.testng.Assert;
import org.testng.annotations.Test;


import basePage.BasePage;
import pageObjects.HomePageObjects;;

public class HomePageTestCases extends BasePage {

	
            

	HomePageObjects ObjHome =new HomePageObjects(driver);
	
	@Test(priority=1, groups={"sanity"})
	public void verifyUser(Method method) throws IOException 
	{	
		try {	
		
	  
		}
		
		catch(AssertionError ae) {		
	       System.out.println(method.getName() + " : failed"+ ae.getMessage());
	       throw ae;
		}
		catch(Exception e){ 	
	    System.out.println(method.getName() + " : failed"+ e.getMessage());
		}
		
		   System.out.println(method.getName() + " : passed");
	}
	
	
	
	@Test(priority=1, groups={"sanity"},dataProvider = "excelData", dataProviderClass = dataProvider.DataProviders.class)
	public void verifyUserIsAbleToSearchItems(Method method, String expectedMobile) throws IOException 
	{	
		try {	
	
	  
		}
		
		catch(AssertionError ae) {		
	       System.out.println(method.getName() + " : failed"+ ae.getMessage());
	       throw ae;
		}
		catch(Exception e){ 	
	    System.out.println(method.getName() + " : failed"+ e.getMessage());
		}
		
		   System.out.println( expectedMobile + " : passed");
	}
		
	
	
	
	
	
	@Test(priority=1,groups={"sanity"})
	public void verifyUserIsAbleToSearch(Method method) {
		
	try {
		 }
		catch(AssertionError ae) {
		        System.out.println(method.getName() + " : failed");
		        throw ae;
		}
		catch(Exception e){ 
      System.out.println(method.getName() + " : failed");
		
		  }
		  System.out.println(method.getName() + " : passed");
    	}
	 
	
	
	

	
	
	
	
    	
	}
	

