package homepagetest;

import base.CommonAPI;
import org.testng.annotations.Test;
import pom.PageFactory;

public class BestTest extends CommonAPI {
    @Test
    public void testbestSellers(){
    PageFactory pageFactory= org.openqa.selenium.support.PageFactory.initElements(driver,PageFactory.class);
    pageFactory.validatebestsellersDisplayed();
    pageFactory.validatebestsellerClick();
    }

}
