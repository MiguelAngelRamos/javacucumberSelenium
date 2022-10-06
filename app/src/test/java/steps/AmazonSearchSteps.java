package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import pages.AmazonSearchPage;

public class AmazonSearchSteps {
  
  AmazonSearchPage amazon = new AmazonSearchPage();

  @Given("^the user navigate to www.amazon.com$")
  public void navigateToAmazonWebSite() {
    amazon.navigateToAmazon();
  }
  @And("^searches for (.+)$")
  public void enterSearchCriteriaAmazonWebSite(String criteria) {
    amazon.enterSearchCriteria(criteria);
    amazon.clickSearchAmazon();
  }
  // @And("^navigates to the page number (.+)$")
  // public void 
}
