package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Homepage {
    WebDriver driver;
    WebDriverWait wait;

    public Homepage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void clickMenuItem(String menuName) {
        WebElement menu = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//span[contains(@class , 'oxd-text') and text() = '" + menuName + "']")));
        menu.click();
    }

    public String getPageHeaderText(String menuName) {
        WebElement header = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//h6[contains(@class , 'oxd-text') and text() = '" + menuName + "']")));
        return header.getText();
    }


}
