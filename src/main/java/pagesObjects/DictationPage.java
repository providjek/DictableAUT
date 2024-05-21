package pagesObjects.home;

import lombok.Getter;
import managers.WebDrivenSingleton;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import pagesObjects.Page;

import java.time.Duration;

@Getter
public class HomePage extends Page {

    @FindBy(css = "button[aria-label='search']")
    private WebElement searchBtn;
    @FindBy(id = "outlined-start-adornment")
    private WebElement inputSearch;
    @FindBy(css = "body > div.MuiDialog-root.MuiModal-root.css-126xj0f > div.MuiDialog-container.MuiDialog-scrollPaper.css-ekeie0 > div > div > div > div > div > div")
    private WebElement result;


    private final WebDriver driver = WebDrivenSingleton.getInstance();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));

    public void clickOnSearchBtn(){
        super.clickOn(this.searchBtn);
    }

    public void writeInputSearch(String text){
        super.writeText(this.inputSearch, text);
    }

    public void searchADictation(String dictationTitle){
        this.clickOnSearchBtn();
        this.writeInputSearch(dictationTitle);
        super.waitVisibility(this.result);
        super.clickOn(this.result);
    }


}
