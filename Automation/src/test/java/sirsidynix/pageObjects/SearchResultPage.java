package sirsidynix.pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SearchResultPage {

    WebDriver driver;

    protected String cssnameScondNodeResults = "#search-page-results li:nth-child(2) .title a";

    By nameTitle = By.cssSelector(cssnameScondNodeResults);
    public SearchResultPage(WebDriver driver) {

        this.driver = driver;
    }

    public void clickSecondTitle() {
        // clicks the second title
        driver.findElement(nameTitle).click();

    }
}
