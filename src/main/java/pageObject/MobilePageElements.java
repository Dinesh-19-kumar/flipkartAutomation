package pageObject;

public interface MobilePageElements {
	
	String minSort = "//div[@class='_1YAKP4']//select[@class='_2YxCDZ']";
	
	String minValue = "//option[@value='20000']";
	
	String maxSort = "//div[@class='_3uDYxP']//select[@class='_2YxCDZ']";
	
	String maxValue = "(//option[@value='30000'])[2]";
	
	String SortValue = "(//div[@class='_10UF8M'])[3]";
	
	String Mobile = "//div[@class='_1YokD2 _3Mn1Gg']";
	
	String collectValue = "(//div[@class='WT_FyS']//div)[1]";
	
	String addToCart = "//button[@class='_2KpZ6l _2U9uOA _3v1-ww']";
	
	String orderButton = "//span[normalize-space()='Place Order']";
	
}
