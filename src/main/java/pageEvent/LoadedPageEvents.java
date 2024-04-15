/**
 * 
 */
package pageEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObject.LoadedPageElements;

/**
 * 
 */
public class LoadedPageEvents extends BaseTest {

	public void searchBarLoaded() {

		WebElement searchButton = driver.findElement(By.xpath(LoadedPageElements.searchBar));

		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}
	
	
	public void MinSortPageLoaded() {

		WebElement searchButton = driver.findElement(By.xpath(LoadedPageElements.minSort));

		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}
	
		
	public void maxSortPageLoaded() {

		WebElement searchButton = driver.findElement(By.xpath(LoadedPageElements.maxSort));

		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}
	
	public void sortOptPageLoaded() {

		WebElement searchButton = driver.findElement(By.xpath(LoadedPageElements.SortValue));

		Assert.assertNotNull(searchButton, "Search button is not displayed");
	}
	
	public void tvPageLoaded() {
		
		WebElement searchTv = driver.findElement(By.xpath("//span[@class='_10Ermr']"));
		
		Assert.assertNotNull(searchTv, "Search tv is not displayed");
		
	}
}
