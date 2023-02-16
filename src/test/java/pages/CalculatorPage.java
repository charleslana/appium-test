package pages;

import driver.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class CalculatorPage {

    public final String plus = "com.miui.calculator:id/op_add";
    public final String minus = "com.miui.calculator:id/op_sub";
    public final String multiply = "com.miui.calculator:id/op_mul";
    public final String divider = "com.miui.calculator:id/op_div";
    public final String equals = "com.miui.calculator:id/btn_equal_s";
    private final String result = "com.miui.calculator:id/result";
    private final String dialogCloseButton = "android:id/button1";
    private final String digit = "com.miui.calculator:id/digit_%s";

    public void closeDialog() {
        WebElement element = Driver.getDriver().findElement(By.id(dialogCloseButton));
        element.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(5));
        wait.until(ExpectedConditions.invisibilityOf(element));
    }

    public void click(String number) {
        Driver.getDriver().findElement(By.id(String.format(digit, number))).click();
    }

    public String getResult() {
        String total = Driver.getDriver().findElement(By.id(result)).getText();
        return total.replace("=", "").trim();
    }
}
