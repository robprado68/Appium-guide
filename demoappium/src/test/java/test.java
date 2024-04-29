
import io.appium.java_client.remote.options.BaseOptions;
import io.appium.java_client.android.AndroidDriver;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Arrays;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.*;

public class test {
    private AndroidDriver driver;

    @BeforeEach
    public void setUp() {
        BaseOptions options = new BaseOptions()
        .amend("appium:deviceName", "Galaxy A34 G")
        .amend("appium:udid", "RFCW4273XKK")
        .amend("platformName", "Android")
        .amend("appium:platformVersion", "14")
        .amend("appium:appPackage", "com.Advantage.aShopping")
        .amend("appium:appActivity", "com.Advantage.aShopping.SplashActivity")
        .amend("appium:automationName", "UiAutomator2")
        .amend("appium:noReset", true)
        .amend("appium:ensureWebviewsHavePages", true)
        .amend("appium:nativeWebScreenshot", true)
        .amend("appium:newCommandTimeout", 3600)
        .amend("appium:connectHardwareKeyboard", true);

        URL url = this.getUrl();

        driver = new AndroidDriver(url,options);
        System.out.println("Application started...");
    }

    private URL getUrl() {
        try {
          return new URL("http://127.0.0.1:4723");
        } catch (MalformedURLException e) {
          e.printStackTrace();
        }
        return null;
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

    @AfterEach
    public void tearDown() {
        driver.quit();
    }
}
