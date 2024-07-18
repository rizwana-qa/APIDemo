package org.example;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import java.net.MalformedURLException;
import java.net.URL;


        public class Setup {


            public static void main(String[] arg) throws MalformedURLException, InterruptedException {
                /* UI Automator variable */
                UiAutomator2Options options = new UiAutomator2Options();
                options.setDeviceName("samsung SM-G781U1");
                options.autoGrantPermissions();
                options.setCapability("platformName", "Android");
                options.setCapability("platformVersion", "13.0");
                options.setCapability("automationName", "UiAutomator2");
                options.setCapability("noReset", false);
                options.setApp("C:\\Users\\Dell\\IdeaProjects\\Mobileapp\\src\\test\\java\\Resource\\ApiDemos-debug.apk");
                AndroidDriver driver = new AndroidDriver(new URL("http://127.0.0.1:4723/"), options);

            }
        }
