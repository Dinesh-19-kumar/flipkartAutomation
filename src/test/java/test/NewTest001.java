package test;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvent.HomePageEvents;
import pageEvent.LoadedPageEvents;
import pageEvent.MobilePageEvents;
import pageEvent.TvPageEvents;

public class NewTest001 extends BaseTest {
	
	
	LoadedPageEvents loadedPage = new LoadedPageEvents();
	HomePageEvents homePage = new HomePageEvents();
	MobilePageEvents mobilePage = new MobilePageEvents();
	TvPageEvents tvPage = new TvPageEvents();
	
  @Test
  public void MobileTest() {
	  
	  homePage.searchBarLoaded();
	  mobilePage.searchMobile();
	  loadedPage.MinSortPageLoaded();
	  mobilePage.minSort();
	  loadedPage.maxSortPageLoaded();
	  mobilePage.maxSort();
	  loadedPage.sortOptPageLoaded();
	  mobilePage.sortOpt();
	  mobilePage.selectMobile();
	  
	  Thread.onSpinWait();
  }
  @Test
  public void TotalCountofTv() {
	  
	  homePage.searchBarLoaded();
	  tvPage.searchTv();
	  loadedPage.tvPageLoaded();
	  tvPage.totalTv();
	  
	  Thread.onSpinWait();
  }
  
  @Test
  public void TvNameWithCount() {
	  
	  homePage.searchBarLoaded();
	  tvPage.searchTv();
	  loadedPage.tvPageLoaded();
	  tvPage.tvName();
	  
	  Thread.onSpinWait();
  }
  
}
