import java.util.List;
import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mercurytours {

	public static void main(String[] args) {
           Scanner sc=new Scanner(System.in);
           System.out.println("Enter Expected link");
           String expLink=sc.nextLine();
           sc.close();
           boolean mystatus=false;
           System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
           WebDriver driver=new ChromeDriver();
           driver.get("https://demo.guru99.com/test/newtours/index.php");
           driver.manage().window().maximize();
           List<WebElement>pgLinks=driver.findElements(By.tagName("a"));
           for(WebElement lnk:pgLinks) {
        	   if(lnk.getText().equalsIgnoreCase(expLink)) {
        		   System.out.println("Expected link Exists");
        		   lnk.click();
        		   mystatus=true;
        		   break;
        		   
        	   }
           }
           if(mystatus==false) {
        	   System.out.println("Expected link doesn't Exist");
           }
	}

}
