package pom;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class PageFactory extends CommonAPI {
    @FindBy(xpath="//a[contains(text(),'Best Sellers')])")
     public static WebElement bestSellersvalue;
    @FindBy(how = How.XPATH,using = "//a[contains(text(),'Best Sellers')])")
     public static WebElement bestSellersvalue2;

    @FindBy(linkText ="Best Sellers")
    public static WebElement bestSellers;
  //  WebElement bestSellersvalue=getElement("//a[contains(text(),'Best Sellers')]");


    public void validatebestsellersDisplayed() {
      //  System.out.println(bestSellers.isDisplayed());
        Assert.assertEquals(bestSellers.isDisplayed(), true);
    }


    public void validatebestsellerClick() {
        bestSellers.click();
        Assert.assertEquals(bestSellers.isDisplayed(), true);




    }
}