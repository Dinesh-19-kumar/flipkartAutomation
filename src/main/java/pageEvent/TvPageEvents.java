package pageEvent;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObject.HomePageElements;
import pageObject.TvPageElements;

public class TvPageEvents extends BaseTest {


	public void searchTv() {

		WebElement search = driver.findElement(By.xpath(HomePageElements.searchBar));

		search.sendKeys("tv",Keys.ENTER);
	}

	public void totalTv() {

		WebElement stock = driver.findElement(By.xpath(TvPageElements.stock));

		stock.click();

		WebElement checkBox = driver.findElement(By.xpath(TvPageElements.checkBox));

		checkBox.click();


		WebElement totalResultsElement = driver.findElement(By.xpath(TvPageElements.resultEle));
		String totalResultsText = totalResultsElement.getText();
		String[] results = totalResultsText.split(" ");
		String totalCount = results[5].replace(",", "");
		System.out.println("Total TV count in Flipkart: " + totalCount);
		
	}

	public void tvName() {
		
		WebElement stock = driver.findElement(By.xpath(TvPageElements.stock));

		stock.click();

		WebElement checkBox = driver.findElement(By.xpath(TvPageElements.checkBox));

		checkBox.click();


		WebElement tv = driver.findElement(By.xpath(TvPageElements.more));
		
		tv.click();

		Map<String, Integer> brandCounts = new HashMap<>();
		List<WebElement> brandElements = driver.findElements(By.cssSelector(TvPageElements.brand));

		for (WebElement brandElement : brandElements) {
			String brand = brandElement.getText();
			String countText = "";
			if (!countText.isEmpty()) {
				int count = Integer.parseInt(countText);
				brandCounts.put(brand, count);
			} else {
				System.out.println("Count not available for brand: " + brand);
			}
		}

		for (Map.Entry<String, Integer> entry : brandCounts.entrySet()) {
			System.out.println("Brand: " + entry.getKey());
			System.out.println("Quantity: " + entry.getValue());
			System.out.println("-----------------------");
		}
	}
}