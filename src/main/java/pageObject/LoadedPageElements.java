package pageObject;

public interface LoadedPageElements {

	String searchBar = "//input[@placeholder='Search for Products, Brands and More']";

	String minSort = "//div[@class='_1YAKP4']//select[@class='_2YxCDZ']";

	String minValue = "//option[@value='20000']";

	String maxSort = "//div[@class='_3uDYxP']//select[@class='_2YxCDZ']";

	String maxValue = "(//option[@value='30000'])[2]";

	String SortValue = "(//div[@class='_10UF8M'])[3]";

	String Mobile = "(//div[@class='_30jeq3 _1_WHN1'])[1]";

}
