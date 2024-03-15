package browser;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser {

	public static void main(String[] args) throws Exception {
		
	
		
			System.setProperty("webdriver.edge.driver","C:\\Users\\admin\\eclipse-workspace\\browser\\target\\driver\\msedgedriver.exe ");		
		
		//WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		String url="https://chercher.tech/practice/practice-dropdowns-selenium-webdriver";
		driver.get(url);
		//driver.navigate().to(url);
		driver.manage().window().maximize();
		
//driver.findElement(By.xpath("//button[@class='btn btn-danger']")).click();
//	Alert a=driver.switchTo().alert();
//	String text=a.getText();
//System.out.println(text);
//a.accept();
//driver.findElement(By.xpath("//a[contains(text(),'Alert with OK & Cancel')]")).click();
//driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
//String text1=a.getText();
//System.out.println(text1);
//a.accept();
//
//driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
//driver.findElement(By.xpath("//button[@class=\"btn btn-info\"]")).click();
//String text2=a.getText();
//System.out.println(text2);
//a.sendKeys("cucumber");
//a.accept();
//
//driver.findElement(By.name("q")).sendKeys("Redmi mobiles",Keys.ENTER);
//driver.findElement(By.xpath("(//div[@class='_4rR01T'])[1]")).click();
//
//
//String currentWindow=driver.getWindowHandle();
////System.out.println(currentWindow);
//Set<String>allwindow=driver.getWindowHandles();
//for(String all:allwindow) {
//	if(!currentWindow.equals(all)) {
//		driver.switchTo().window(all);
//		String text=driver.findElement(By.xpath("//span[@class=\"B_NuCI\"]")).getText();
//
//		System.out.println(text);
//		

	//}
//}


		
		//drop down methods
		
	WebElement drop=driver.findElement(By.xpath("//select[@id='animals']"));
		Select s= new Select(drop);
		s.selectByIndex(1);
		s.selectByValue("avatar");
		Thread.sleep(2000);
		s.selectByVisibleText("Cat");
		
		
	List<WebElement>d=	s.getOptions();
	for(int i=0;i<d.size();i++) {
		WebElement names=d.get(i);
		String text=names.getText();
		System.out.println(text);
	}
	boolean multiple=s.isMultiple();
	
	System.out.println(multiple);
	
	//multiple value drop down

WebElement down=driver.findElement(By.xpath("//select[@id='second']"));
Select s1=new Select(down);
s1.selectByIndex(0);
s1.selectByIndex(1);
s1.selectByIndex(2);
s1.selectByIndex(3);
	s1.deselectByIndex(1);
	s1.deselectByIndex(2);
	s1.deselectByIndex(3);
	//s1.deselectAll();
	
//WebElement f=driver.findElement(By.xpath("//div[@class='container-fluid']"));
//JavascriptExecutor jk=(JavascriptExecutor)driver;
//jk.executeScript("arguments[0].scrollIntoView(true)",f);
//Thread.sleep(2000);
	
	List<WebElement>a=s1.getAllSelectedOptions();
	for(int i=0;i<a.size();i++) {
	WebElement b=a.get(i);
	String text1=b.getText();
	System.out.println(text1);
WebElement c= s1.getFirstSelectedOption();
System.out.println(c.getText());
		
	}
	
	
	
		
	}
		
		
		
		




		
	
	
	
	 
	
	
	
	
	
	
	
	

	
}