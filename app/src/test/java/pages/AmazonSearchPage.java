package pages;

public class AmazonSearchPage extends BasePage {
  
  private String inputSearchBox = "//*[@id='twotabsearchtextbox']";
  private String searchButton = "//*[@id='nav-search-submit-button']";

  public AmazonSearchPage() {
    super(driver);
  }

  public void navigateToAmazon() {
    navigateTo("https://www.amazon.com");
  }

  public void enterSearchCriteria(String criteria) {
    write(inputSearchBox, criteria); 
  } 

  public void clickSearchAmazon() {
    clickElement(searchButton);
  }

  public void goToPage2(String pageNumber){
    //* Ir hacia esa pagina
    goToLinkText(pageNumber);
  }

}
