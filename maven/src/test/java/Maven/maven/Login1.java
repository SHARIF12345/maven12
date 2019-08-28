package Maven.maven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import junit.framework.Assert;

public class Login1 {
	WebDriver bo;
	String bpath="https://www.facebook.com/";
  @Test
  public void TC1() {
	 bo.findElement(By.xpath("//input[@id='email']")).sendKeys("shareif.956@gmail.com"); 
	 bo.findElement(By.xpath("//input[@id='pass']")).sendKeys("shaiksharif@1234");
	 bo.findElement(By.xpath("//input[@id='u_0_3']")).click();
	 Assert.assertEquals(bo.getTitle(), "Facebook");
  }
  @Test
  public void TC2(){
	bo.findElement(By.xpath("//input[@id='email']")).sendKeys(""); 
	bo.findElement(By.xpath("//input[@id='pass']")).sendKeys("");
	bo.findElement(By.xpath("//input[@id='u_0_3']")).click();
	Assert.assertEquals(bo.switchTo().alert().getText(), "The email address or phone number that you've entered doesn't match any account. Sign up for an account.");
	  
  }
  @BeforeMethod
  public void be(){
System.setProperty("webdriver.chrome.driver", "D:\\shar\\chromedriver_win32\\chromedriver.exe");
	  bo=new ChromeDriver();
	  bo.get(bpath);
  }
  @AfterMethod
  public void bclose(){
	  bo.close();
  }
}
