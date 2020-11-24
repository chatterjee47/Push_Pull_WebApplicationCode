package screenshot;

public class DetailedExplanation {

	public static void main(String[] args) {
		/*
		
Taking screenshot of browser by using “TakesScreenshot” interface provided by Selenium:

1. Selenium provides an interface named “TakesScreenshot” which helps to take screenshot during execution of automation script.

2. TakesScreenshot interface has a method named “getScreenshotAs” which can capture a screenshot and store it in different ways in specified locations.
This method can capture screenshot as below based on implementation provided by browser driver class:
all browser driver classes like “ChromeDriver”, “FirefoxDriver”, “InternetExplorerDriver”, “EdgeDriver”  
Entire page
Current window
Visible portion of the current frame
The screenshot of the entire display containing the browser


3. To use “TakesScreenshot” interface, either we need to do up-casting or down casting depending upon reference of your browser driver class.

conditions: If you write your browser driver class as below:
ChromeDriver driver= new ChromeDriver();
You need to up-cast your driver to TakesScreenshot as below:
TakesScreenshot ts= driver;

If you write your browser driver class as below:
WebDriver  driver= new ChromeDriver();
You need to down cast your driver to TakesScreenshot as shown below:
TakesScreenshot ts= (TakesScreenshot)driver;
		
		
		
		 */

	}

}
