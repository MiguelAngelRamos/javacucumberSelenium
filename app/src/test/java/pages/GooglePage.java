package pages;

public class GooglePage extends BasePage {
  
  private String searchButton = "//input[@value='Buscar con Google']";
  private String searchTextField = "//input[@title='Buscar']";
  private String firstResult = "";
  
  public GooglePage() {
    super(driver);
  }

  public void navigateToGoogle() {
    //* navigateTo es un método estatico de la BasePage
    navigateTo("https://www.google.com");
  }
}
