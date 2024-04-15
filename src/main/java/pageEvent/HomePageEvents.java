/**
 * 
 */
package pageEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObject.HomePageElements;

/**
 * 
 */
public class HomePageEvents extends BaseTest  {
	
public void searchBarLoaded() {
		
		WebElement searchButton = driver.findElement(By.xpath(HomePageElements.searchBar));
		
		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}
}
