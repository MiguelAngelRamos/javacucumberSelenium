package pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

  protected static WebDriver driver; //* exista un valor para todas las instancias de esta clase */
  //* Una instancia del web driver compartida  todas la clases */
  private static WebDriverWait wait;

  static {
    // System.setProperty("webdriver.chrome.driver", "C:\\Users\\MIGUEL\\Desktop\\curso\\chromedriver\\chromedriver.exe" );
    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver\\chromedriver.exe" );
  
    //* Aqui estamos creando el driver una sola vez para todas las instancias */
    ChromeOptions chromeOptions = new ChromeOptions();
    driver = new ChromeDriver(chromeOptions);
    wait = new WebDriverWait(driver, 10); //* le pasamos el objeto del driver y tiempo que deseamos que espera para realize la tarea */
  }

  public BasePage(WebDriver driver) {
    BasePage.driver = driver;
    wait = new WebDriverWait(driver, 10);
  }
  //* Ir hacia al sitio web
  public static void navigateTo(String url) {
    System.out.println(url);
    //* Aqui donde entra en juego Selenium */
    driver.get(url);
  }

}
