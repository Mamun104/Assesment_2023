package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Home {

    @FindBy(id= "searchDropdownBox")
    WebElement selectDepartment;
    @FindBy(id= "twotabsearchtextbox")
    WebElement searchProduct;

    public WebDriver driver;
    public Home(WebDriver driver) {

        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public void selectDepartmentByIndex() throws InterruptedException {

        Thread.sleep(3000);
        Select department  = new Select(selectDepartment);
        department.selectByIndex(22);

    }
    public void selectDepartmentByValue() throws InterruptedException {

        Thread.sleep(1000);
        Select department  = new Select(selectDepartment);
        department.selectByValue("search-alias=software-intl-ship");

    }
    public void selectDepartmentByVisibleText() throws InterruptedException {

        Thread.sleep(1000);
        Select department  = new Select(selectDepartment);
        department.selectByVisibleText("Software");

    }

    public void selectDepartmentByScrolling() throws InterruptedException {

        Thread.sleep(1000);
        selectDepartment.click();
        Thread.sleep(1000);
        for (int i = 0; i < 22; i++) {

            Thread.sleep(300);

            selectDepartment.sendKeys(Keys.ARROW_DOWN);
        }

        Thread.sleep(1000);
        selectDepartment.sendKeys(Keys.ENTER);

    }
    public void searchProduct() throws InterruptedException {

        Thread.sleep(1000);
        searchProduct.sendKeys("games");
        searchProduct.sendKeys(Keys.ENTER);

    }
}
