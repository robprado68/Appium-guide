
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.remote.DesiredCapabilities;

public class test {
    private WebDriver driver;

    @Before
    public void setUp() {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability("appium:deviceName", "Galaxy A34 G");
        cap.setCapability("appium:udid", "RFCW4273XKK");
        cap.setCapability("platformName", "Android");
        cap.setCapability("appium:platformVersion", "14");
        cap.setCapability("appium:appPackage", "com.Advantage.aShopping");
        cap.setCapability("appium:appActivity", "com.Advantage.aShopping.SplashActivity");
        cap.setCapability("appium:automationName", "UiAutomator2");
        cap.setCapability("appium:noReset", true);
        cap.setCapability("appium:ensureWebviewsHavePages", true);
        cap.setCapability("appium:nativeWebScreenshot", true);
        cap.setCapability("appium:newCommandTimeout", 3600);
        cap.setCapability("appium:connectHardwareKeyboard", true);

        URL url = getUrl();

        driver = new AndroidDriver(url, cap);
        System.out.println("Application started...");
    }

    private URL getUrl() {
        try {
            return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null; // or handle the exception accordingly
        }
    }

    @Test
    public void sampleTest() {
        // Write your test here
        // EJEMPLO DE UNA BUSQUEDA EN LA APLICACION Advantage Shopping
        // PASO 1: Hacer click en el boton de busqueda
        driver.findElement(By.id("com.Advantage.aShopping:id/editTextSearch")).sendKeys("Phones");
        // PASO 2: Hacer click en el boton de busqueda
        driver.findElement(By.id("com.Advantage.aShopping:id/imageViewSearch")).click();
        // PASO 3: Hacer click en el Beats studio 2 over-ear
        driver.findElement(By.xpath(
                "//android.widget.TextView[@resource-id=\"com.Advantage.aShopping:id/textViewProductName\" and @text=\"BEATS STUDIO 2 OVER-EAR MATTE BLACK HEADPHONES\"]"))
                .click();
        // PASO 4: Hacer click en el boton de agregar al carrito
        driver.findElement(By.id("com.Advantage.aShopping:id/buttonProductAddToCart")).click();
    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
