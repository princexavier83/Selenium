package com.qaguru.seleniumstudy.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoTest {
    private final String baseUrl = "https://www.homeandstuff.com/";

   @Test
    public void testHomePageTitle() throws InterruptedException {
       System.out.println("Test for home page title");
       WebDriverManager.chromedriver().setup();
       WebDriver driver = new ChromeDriver();
       driver.get(baseUrl);
       String expTitle = "Furniture, Kitchen, Dining Room, Entertainment, Bedroom Sets, Outdoor, Fireplaces";
       String actTitle = driver.getTitle();
       Assert.assertEquals(actTitle,expTitle);

       Thread.sleep(1000);
       driver.quit();
    }
}
