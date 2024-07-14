package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class Homepage {


	  @FindBy(id ="email") //Annotation 
	   private WebElement USERNAME;//Encapsulation
	   
	   @FindBy(id ="pass") //Annotation 
	   private WebElement PASSWORD;//Encapsulation
	   
	   @FindBy(name ="login") //Annotation 
	   private WebElement LOGIN;//Encapsulation
	  
		
		public  Homepage(WebDriver driver)
		{
		    PageFactory.initElements(driver,this) ;
		}
		public void username(String user) {
			
			USERNAME.sendKeys(user);
		   }
		
				public void password(String pass) {
					
					PASSWORD.sendKeys(pass);

			    }
				
				public void login() {
					
					LOGIN.click();

			    }
}
