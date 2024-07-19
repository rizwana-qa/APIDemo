package org.example;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.net.MalformedURLException;
import java.net.URL;

import static io.appium.java_client.AppiumBy.*;


public class Setup {
    public static void main(String[] arg) throws MalformedURLException, InterruptedException {
        /* UI Automator variable */
        UiAutomator2Options options= new UiAutomator2Options();
        options.setDeviceName("samsung SM-G781U1");
        options.autoGrantPermissions();
        options.setCapability("platformName", "Android");
        options.setCapability("platformVersion","13.0");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("noReset", false);
        options.setApp("C:\\Users\\Dell\\IdeaProjects\\Mobileautomation\\src\\test\\java\\Resource\\ApiDemos-debug.apk");
        AndroidDriver driver=new AndroidDriver(new URL("http://127.0.0.1:4723/"),options);

        // by using resource id
        driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Views\"]")).click();
        driver.findElement(new ByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollable(true).instance(0)).scrollIntoView(new UiSelector().textContains(\"Visibility\").instance(0))")).click();



        /*WebElement controls=driver.findElements(new By.ById("android:id/text1")).get(4);
        controls.click();

        // by using resource id
        WebElement dark=driver.findElements(new By.ById("android:id/text1")).get(1);
        dark.click();

        // by using input variable
        WebElement text=driver.findElements(new By.ById("io.appium.android.apis:id/edit")).get(0);
        text.sendKeys("Assignemnt 5- Rizwana Zahoor");

         //by using checkbox
        driver.findElement(new ByXPath("//android.widget.CheckBox[@content-desc=\"Checkbox 1\"]")).click();

        // by using radio button
        driver.findElement(new By.ById("io.appium.android.apis:id/radio1")).click();

        Thread.sleep(1000);
        //by using drop down

        driver.findElement(new ByXPath("//android.widget.TextView[@resource-id=\"android:id/text1\"]")).click();
        driver.findElement(new ByXPath("//android.widget.CheckedTextView[@resource-id=\"android:id/text1\" and @text=\"Jupiter\"]")).click();


        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
        driver.navigate().back();
*/

        //













    }
}
