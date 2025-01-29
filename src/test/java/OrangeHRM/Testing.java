package OrangeHRM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Testing {
    WebDriver driver;
    Login loginPage;
    Homepage homepage;
    Admin admin;

    @BeforeClass
    public void setUp() {
        driver = new ChromeDriver();
        //driver.manage().window().maximize();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        loginPage = new Login(driver);
        homepage = new Homepage(driver);
        admin = new Admin(driver);
    }

    @AfterClass
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test(priority = 1)
    public void testLogin() {
        loginPage.enterUsername("Admin");
        loginPage.enterPassword("admin123");
        loginPage.clickLoginButton();

        String actualHeader = loginPage.getDashboardHeader();
        Assert.assertEquals(actualHeader, "Dashboard");
    }

    @Test(priority = 2)
    public void testAdminMenu() {
        homepage.clickMenuItem("Admin");
        Assert.assertEquals(homepage.getPageHeaderText("Admin"), "Admin");
    }

    @Test(priority = 3)
    public void adminPage(){
        admin.AdminUserManagementAddAccount("Admin","Thomas Kutty Benny","Disabled","Rakim321"
        ,"Rakim123", "Rakim123");

    }

    @Test(priority = 13)
    public void testPimMenu() {
        homepage.clickMenuItem("PIM");
        Assert.assertEquals(homepage.getPageHeaderText("PIM"), "PIM");
    }

    @Test(priority = 4)
    public void testLeaveMenu() {
        homepage.clickMenuItem("Leave");
        Assert.assertEquals(homepage.getPageHeaderText("Leave"), "Leave");
    }

    @Test(priority = 5)
    public void testTimeMenu() {
        homepage.clickMenuItem("Time");
        Assert.assertEquals(homepage.getPageHeaderText("Time"), "Time");
    }

    @Test(priority = 6)
    public void testMyInfoMenu() {
        homepage.clickMenuItem("My Info");
        Assert.assertEquals(homepage.getPageHeaderText("My Info"), "My Info");
    }

    @Test(priority = 7)
    public void testRecruitmentMenu() {
        homepage.clickMenuItem("Recruitment");
        Assert.assertEquals(homepage.getPageHeaderText("Recruitment"), "Recruitment");
    }

    @Test(priority = 8)
    public void testPerformanceMenu() {
        homepage.clickMenuItem("Performance");
        Assert.assertEquals(homepage.getPageHeaderText("Performance"), "Performance");
    }

    @Test(priority = 9)
    public void testDashboardMenu() {
        homepage.clickMenuItem("Dashboard");
        Assert.assertEquals(homepage.getPageHeaderText("Dashboard"), "Dashboard");
    }
    @Test(priority = 10)
    public void testDirectoryMenu() {
        homepage.clickMenuItem("Directory");
        Assert.assertEquals(homepage.getPageHeaderText("Directory"), "Directory");
    }

    @Test(priority = 11)
    public void testClaimMenu() {
        homepage.clickMenuItem("Claim");
        Assert.assertEquals(homepage.getPageHeaderText("Claim"), "Claim");
    }
    @Test(priority = 12)
    public void testBuzzMenu() {
        homepage.clickMenuItem("Buzz");
        Assert.assertEquals(homepage.getPageHeaderText("Buzz"), "Buzz");
    }





























}
