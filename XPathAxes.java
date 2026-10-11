package day22;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class XPathAxes {

	public static void main(String[] args) {
		
	
	WebDriverManager.chromedriver().setup();
	
	WebDriver driver=new ChromeDriver();
	
	driver.get("https://money.rediff.com/gainers/bse/daily/groupa");
	driver.manage().window().maximize();
	
	//self - selects the current node
	String text=driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/self::a")).getText();
	System.out.println("self : "+ text);
	 
	//parent - selects the parent of the current node(always one)
	text=driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/parent::td")).getText();
	System.out.println("Parent:"+ text);
	
	//child - selects all children of the current node(one or many
	List<WebElement> childs=driver.findElements(By.xpath("//a[contains(text(),'NIIT Ltd')]/ancestor::tr"));
	System.out.println("number of childelement"+childs.size());
	
	//Ancestor
	text=driver.findElement(By.xpath("//a[contains(text(),'NIIT Ltd')]/ancestor::tr")).getText();
	System.out.println("Ancestor : "+ text);
	
	//Descendant
	List<WebElement> descendants=driver.findElements(By.xpath("//a[contains(text(),'NIIT Ltd')]/ancestor/descendants::tr"));
	System.out.println("number of child elements:"+descendants.size());
	
	//following
	List<WebElement> followingnodes=driver.findElements(By.xpath(""));
	System.out.println(""+followingnodes);
	
	//following - sibling:
	List<WebElement> followingsiblings=driver.findElements(By.xpath(""));
	System.out.println(""+followingsiblings);
	
	//preceding
	List<WebElement> precedings=driver.findElements(By.xpath(""));
	System.out.println(""+precedings);
	
	//preceding - sibling
	List<WebElement> precedingsiblings=driver.findElements(By.xpath(""));
	System.out.println(""+precedingsiblings);
	
	driver.quit();
	
	
	}

}
