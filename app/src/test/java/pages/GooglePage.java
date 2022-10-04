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

  //* Método para realizar click en el boton de google
  public void clickGoogleSearch() {
    clickElement(searchButton);
  }

  //* Método para escribir en el input de google
  public void enterSearchCriteria(String criteria) {
    write(searchTextField, criteria);
  }

}
