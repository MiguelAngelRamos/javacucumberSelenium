package pages;

public class GooglePage extends BasePage {
  
  public GooglePage() {
    super(driver);
  }

  public void navigateToGoogle() {
    //* navigateTo es un método estatico de la BasePage
    navigateTo("https://www.google.com");
  }
}
