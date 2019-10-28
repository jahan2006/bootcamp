package homepage;

import base.CommonAPI;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Search extends CommonAPI {
    public void SearchFieldIsTypeAble(){
    //    for understanding
    //    boolean condition = isElementDisplayed("//input[@id='twotabsearchtextbox']");
    //    Assert.assertEquals(condition,true);
        Assert.assertEquals(isElementDisplayed("//input[@id='twotabsearchtextbox']"),true);
        clickOnElementByXpath("//input[@id='twotabsearchtextbox']");
        typeOnElementByXpath("//input[@id='twotabsearchtextbox']","java books");
    }
}
