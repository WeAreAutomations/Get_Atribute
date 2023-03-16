package Tests;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.image.PixelGrabber;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.time.Duration;

import static Main.TestNg.driver;

public class Static_Test_1 {


    @Parameters({"StartUrlLogin2"})
    @Test(groups = {"test1"}, testName = "Log in")
    public void test1(String StartUrlLogin2) throws InterruptedException, IOException {

        System.out.println("*** Pixel_Perfect ***");

        // Переход на начальную страницу
        driver.get(StartUrlLogin2);
        Thread.sleep(1000);

        // Waiting until Sing up button is not present
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement signUpBtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@data-test-id=\"header signup\"]")));

        // Find the div element with class "logo-nav"
        WebElement volume = driver.findElement(By.xpath("(//h3[@class=\"main-statistic-title\"])[1]"));

        String value = volume.getAttribute("innerText");
        System.out.println("getAttribute: " + value);
//        driver.quit();


    }

}


