package OrangeHRM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Admin {
    WebDriver driver;
    WebDriverWait wait;

    public Admin(WebDriver driver)
    {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void AdminUserManagementAddAccount(
            String userRole, String EmployeeName , String Status, String Username, String Password, String ConfirmPass)
    {
                //ADD BUTTON
        WebElement AddButton =  wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--secondary') and .//i[contains(@class, 'oxd-icon bi-plus')]]")));
                AddButton.click();

                //USER ROLE DROPDOWN
        WebElement firstDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[@class='oxd-form-row']//div[contains(@class, 'oxd-select-text--active')][1]")));
        firstDropdown.click();

        //USER ROLE LIST : ADMIN / ESS
        WebElement FindUserRole = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[contains(@class, 'oxd-select-option')][3]")));
        FindUserRole.click();
        System.out.println("USER ROLE FILLED");


        //STATUS DROPDOWN
        WebElement secondDropdown = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[contains(@class, 'oxd-select-text-input')and text() = '-- Select --']")));
        secondDropdown.click();
        System.out.println("STATUS CLICKED");

        //STATUS LIST : ENABLED / DISABLED
        WebElement FindStatus = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//div[contains(@class, 'oxd-select-option')][2]")));
        FindStatus.click();
        System.out.println("STATUS FILLED");


        WebElement FindEmployeeName = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@placeholder='Type for hints...']")));
        FindEmployeeName.sendKeys(EmployeeName);



        WebElement FindUsername = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@class='oxd-input oxd-input--active' and @autocomplete='off']")));
        FindUsername.sendKeys(Username);
        System.out.println("USERNAME FILLED");

        WebElement FindPassword = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@class='oxd-input oxd-input--active' and @type='password']")));
        FindPassword.sendKeys(Password);

        WebElement ConfirmPassword = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//input[@type='password' and @class='oxd-input oxd-input--active' and @autocomplete='off']")));
        ConfirmPassword.sendKeys(ConfirmPass);

        WebElement saveButton = wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space' and text()=' Save ']")));
        saveButton.click();

        WebElement UserCreatedChecker =  wait.until(ExpectedConditions.presenceOfElementLocated(
                By.xpath("//button[contains(@class, 'oxd-button') and contains(@class, 'oxd-button--secondary') and .//i[contains(@class, 'oxd-icon bi-plus')]]")));



    }







    public void AdminUserManagementFormShort()
    {

    }
    public void AdminUserManagementFormLong()
    {

    }
    public void AdminUserManagementFormNoInput()
    {

    }
    public void AdminUserManagementFormInvalid()
    {

    }





}
