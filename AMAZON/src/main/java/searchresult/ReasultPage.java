package searchresult;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import report.TestLogger;

public class ReasultPage extends CommonAPI {
    public void validateSearchPageDisplayed(){
        WebElement element = getElement("//span[@id='glow-ingress-line2']");
        Assert.assertEquals(element.isDisplayed(),true,"element isn't displayed");
        TestLogger.log("search result panal is displayed:" +element.isDisplayed());
    }
}
