import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "//home//cavisson//Downloads//Selenium//chromedriver");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone 11");
		driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement> options = driver.findElements(By.cssSelector("span.a-size-medium.a-color-base.a-text-normal"));
		List<WebElement> options1 = driver.findElements(By.cssSelector("span.a-price-whole"));
		
		String arr[]= new String[options1.size()];
		
			for(int i=0; i<options.size();i++)
			{
				arr[i]=options1.get(i).getText()+ " , " +options.get(i).getText();
				//System.out.println(arr[i]);
			}
		
			driver.close();
			
		int size=arr.length;
		for(int x=0;x<size-1;x++) {
			for(int y=x+1;y<size;y++) {
				if(arr[x].compareTo(arr[y])>0) {
					String temp = arr[x];
		               arr[x] = arr[y];
		               arr[y] = temp;
				}
			}
		}
		
		for(int a=0;a<size;a++)
		{
		System.out.println(arr[a]);
		}
		
		
		

	}

}
