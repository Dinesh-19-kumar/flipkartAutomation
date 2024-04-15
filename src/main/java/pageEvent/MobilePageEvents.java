package pageEvent;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import base.BaseTest;
import pageObject.HomePageElements;
import pageObject.MobilePageElements;

public class MobilePageEvents extends BaseTest {


	public void searchMobile() {

		WebElement search = driver.findElement(By.xpath(HomePageElements.searchBar));

		search.sendKeys("Mobile Phones",Keys.ENTER);


	}

	public void minSort() {

		WebElement minSortOpt = driver.findElement(By.xpath(MobilePageElements.minSort));

		minSortOpt.click();

		WebElement minSortVal = driver.findElement(By.xpath(MobilePageElements.minValue));

		minSortVal.click();
	}

	public void maxSort() {

		WebElement maxSortOpt = driver.findElement(By.xpath(MobilePageElements.maxSort));

		maxSortOpt.click();

		WebElement maxSortVal = driver.findElement(By.xpath(MobilePageElements.maxValue));

		maxSortVal.click();
	}

	public void sortOpt() {

		WebElement filterSort = driver.findElement(By.xpath(MobilePageElements.SortValue));

		filterSort.click();
	}

	public void selectMobile() {

		String mainPage = driver.getWindowHandle();
		System.out.println("Main page="+ mainPage);

		WebElement element = driver.findElement(By.xpath(MobilePageElements.Mobile));
		element.click();

		Set<String> allPages=driver.getWindowHandles();
		for(String page : allPages) {
			if(!page.equals(mainPage)) {
				driver.switchTo().window(page);
				break;
			}
		}
		System.out.println(driver.getCurrentUrl());

		List<WebElement> products= driver.findElements(By.xpath(MobilePageElements.collectValue));
		System.out.println(products.size());
		for(WebElement product: products) {
			System.out.println(product.getText());
		}

		driver.findElement(By.xpath(MobilePageElements.addToCart)).click();

		WebElement ele = driver.findElement(By.xpath(MobilePageElements.orderButton));

		Assert.assertNotNull(ele,"Place order is not visible");

		driver.findElement(By.xpath(MobilePageElements.orderButton)).click();
	}

}
