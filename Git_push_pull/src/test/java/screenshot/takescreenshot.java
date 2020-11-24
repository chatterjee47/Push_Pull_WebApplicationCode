package screenshot;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class takescreenshot {

	public static void main(String[] args) throws IOException {

		String fileWithPath = "D:\\Amit_JavaPrograming\\TestNG_Concepts\\screenshot\\test.png";

		// Set the path for chromedriver.exe
		String path = System.getProperty("user.dir");
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path + "\\drivers\\chromedriver.exe");

		// opening the chrome browser
		WebDriver driver = new ChromeDriver();
	

		// Deleting cookies
		driver.manage().deleteAllCookies();

		// hitting the url
		// driver.get("https://phptravels.com/demo");

		driver.get("http://demo.guru99.com/test/facebook.html");
		
		
		/*
If you write your browser driver class as below:
ChromeDriver driver= new ChromeDriver();
You need to up-cast your driver to TakesScreenshot as below:
TakesScreenshot ts= driver;

If you write your browser driver class as below:
WebDriver  driver= new ChromeDriver();
You need to down cast your driver to TakesScreenshot as shown below:
TakesScreenshot ts= (TakesScreenshot)driver;

“OutputType” is an interface which provides you options to take screenshot in different type such as FILE, BASE64, BYTES and class. FILE is mostly used.
		 */

		
		//1st way
		// Convert driver object to TakeScreenshot
		//You need to down cast your driver to TakesScreenshot 
	//	File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);//Capture the screenshot and store it in the specified location.
		// Move image file to new destination
	//	File DestFile = new File(fileWithPath);

		// Copy file at destination
	//	FileUtils.copyFile(screenshotFile, DestFile);

	//	driver.close();
		
		//2nd way

	//	TakesScreenshot scrShot = ((TakesScreenshot) driver);// Convert driver
																// object to
																// TakeScreenshot
		
		//Casting is a process of converting one data type to other. 
		//You may get a double value in your output but you may want it to be as integer for proper functionality of the program .
		//In such a case you can cast your data to integer from double
		
		
		/////    http://www.qababu.com/2019/01/why-we-need-to-down-cast-webdriver-for.html
		
		TakesScreenshot scrShot = (TakesScreenshot) driver;
		
		// here TakesScreenshot is an interface
		// driver : driver instance

		// Call getScreenshotAs method to create image file
		File SrcFile = scrShot.getScreenshotAs(OutputType.FILE);
		//OutputType Defines the output type for a screenshot
		//Call getScreenshotAs method to create image file File
		// getScreenshotAs : method to take screenshot

		// Move image file to new destination
		 File DestFile = new File(fileWithPath);

		// Copy file at destination
		FileUtils.copyFile(SrcFile, DestFile);

		driver.close();

	}
}
