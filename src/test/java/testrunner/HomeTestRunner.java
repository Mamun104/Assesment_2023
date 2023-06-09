package testrunner;

import org.testng.annotations.Test;
import pages.Home;
import setup.Setup;

public class HomeTestRunner extends Setup {

    Home home;

    @Test(priority = 0, description = "select by index")
    public void testSelectByIndex() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        home = new Home(driver);
        home.selectDepartmentByIndex();

    }

    @Test(priority = 1, description = "select by value")
    public void testSelectByValue() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        home = new Home(driver);
        home.selectDepartmentByValue();

    }

    @Test(priority = 2, description = "select by visible text")
    public void testSelectByVisibleText() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        home = new Home(driver);
        home.selectDepartmentByVisibleText();

    }

    @Test(priority = 3, description = "select department by scrolling")
    public void testSelectDepartmentByScrolling() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        home = new Home(driver);
        home.selectDepartmentByScrolling();

    }

    @Test(priority = 4, description = "Search product test ")
    public void testSearchProduct() throws InterruptedException {

        driver.get("https://www.amazon.com/");
        home = new Home(driver);
        home.searchProduct();

    }


}
