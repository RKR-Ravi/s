package qspiders;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FormValidation {
    public static void main(String[] args) {
        
        System.setProperty("webdriver.chrome.driver","D:\\SELENIUM\\chromedriver-win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
        
        driver.get("https://demoapps.qspiders.com/");
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("(//section[@class='poppins text-[14px]'])[2]")).click();
		driver.findElement(By.xpath("//section[text()='FormValidation']")).click();;

        // Locate form fields
        WebElement requiredField = driver.findElement(By.id("requiredField"));
        WebElement equalToField = driver.findElement(By.id("equalToField"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement retypePasswordField = driver.findElement(By.id("retypePassword"));
        WebElement emailField = driver.findElement(By.id("email"));
        WebElement urlField = driver.findElement(By.id("url"));
        WebElement digitsField = driver.findElement(By.id("digits"));
        WebElement numberField = driver.findElement(By.id("number"));
        WebElement alphanumericField = driver.findElement(By.id("alphanumeric"));
        WebElement minLengthField = driver.findElement(By.id("minLength"));
        WebElement maxLengthField = driver.findElement(By.id("maxLength"));
        WebElement rangeLengthField = driver.findElement(By.id("rangeLength"));
        WebElement minValueField = driver.findElement(By.id("minValue"));
        WebElement maxValueField = driver.findElement(By.id("maxValue"));
        WebElement rangeValueField = driver.findElement(By.id("rangeValue"));
        WebElement submitButton = driver.findElement(By.id("submit"));
        
        // Fill in form fields
        requiredField.sendKeys("Some text");
        equalToField.sendKeys("Match text");
        passwordField.sendKeys("password123");
        retypePasswordField.sendKeys("password123");
        emailField.sendKeys("test@example.com");
        urlField.sendKeys("http://example.com");
        digitsField.sendKeys("123456");
        numberField.sendKeys("42");
        alphanumericField.sendKeys("abc123");
        minLengthField.sendKeys("abcdef");
        maxLengthField.sendKeys("abcdef");
        rangeLengthField.sendKeys("abcdefgh");
        minValueField.sendKeys("7");
        maxValueField.sendKeys("5");
        rangeValueField.sendKeys("50");
        
        submitButton.click();
        
        
        wait.until(ExpectedConditions.urlToBe("http://example.com/success"));

        if (driver.getCurrentUrl().equals("http://example.com/success")) {
            System.out.println("Form submitted successfully!");
        } else {
            System.out.println("Form submission failed!");
        }

        
        validateErrorMessages(driver);

       
        driver.quit();
    }

    private static void validateErrorMessages(WebDriver driver) {
        
        checkErrorMessage(driver, "requiredFieldError", "This field is required.");
        checkErrorMessage(driver, "equalToFieldError", "Values do not match.");
        checkErrorMessage(driver, "emailFieldError", "Enter a valid email.");
        checkErrorMessage(driver, "urlFieldError", "Enter a valid URL.");
        checkErrorMessage(driver, "digitsFieldError", "Enter only digits.");
        checkErrorMessage(driver, "numberFieldError", "Enter only numbers.");
        checkErrorMessage(driver, "alphanumericFieldError", "Enter alphanumeric value.");
        checkErrorMessage(driver, "minLengthFieldError", "Min 6 chars.");
        checkErrorMessage(driver, "maxLengthFieldError", "Max 6 chars.");
        checkErrorMessage(driver, "rangeLengthFieldError", "Text between 5 - 10 chars length.");
        checkErrorMessage(driver, "minValueFieldError", "Min value is 6.");
        checkErrorMessage(driver, "maxValueFieldError", "Max value is 6.");
        checkErrorMessage(driver, "rangeValueFieldError", "Number between 6 - 100.");
    }

    private static void checkErrorMessage(WebDriver driver, String errorElementId, String expectedErrorMessage) {
        WebElement errorElement = driver.findElement(By.id(errorElementId));
        String actualErrorMessage = errorElement.getText();
        if (actualErrorMessage.equals(expectedErrorMessage)) {
            System.out.println("Validation passed for " + errorElementId);
        } else {
            System.out.println("Validation failed for " + errorElementId + ": Expected [" + expectedErrorMessage + "] but found [" + actualErrorMessage + "]");
        }
    }
}
