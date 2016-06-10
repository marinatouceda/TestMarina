package sirsidynix.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class HomePageSirsi {

    //Css

     String idsearchInput = "edit-search-block-form--2";
    protected String idsearchAction = "edit-submit";
    protected String idlistResults = "search-page-results";

    By search = By.id(idsearchInput);
    By runSearch = By.id(idsearchAction);
    By listResults = By.id(idlistResults);

    WebDriver driver;


    public HomePageSirsi(WebDriver driver) {

        this.driver = driver;
    }

    //Function to run a search

    public void searchForAString(String strUserName) {

        driver.findElement(search).clear();
        driver.findElement(search).sendKeys(strUserName);
        driver.findElement(runSearch).click();

    }

    public void waitForResults() {
        WebDriverWait wait = new WebDriverWait(driver, 10);

        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(listResults));
    }

}
  
      
  