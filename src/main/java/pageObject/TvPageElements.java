package pageObject;

public interface TvPageElements {
	
	String stock = "//div[contains(text(),'Availability')]";
	
	String checkBox = "//div[contains(@title,'Include Out of Stock')]//div[contains(@class,'_24_Dny')]";
	
	String resultEle = "//span[@class='_10Ermr']";
	
	String more = "//span[normalize-space()='92 MORE']";
	
	String brand = "._38vbm7";
}
