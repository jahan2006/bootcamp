package bootcamp;

import base.CommonAPI;
import org.testng.annotations.Test;
import report.TestLogger;

public class NewBootcamp extends CommonAPI {
    @Test
    public void logInPage(){
        clickOnElementByXpath("//span[contains(text(),'Hello, Sign in')]");
        TestLogger.log("login page clicked");
        sleepFor(5);
    }
    @Test
    public void shoppingCartCheck(){
        clickOnElementByXpath("//span[@id='nav-cart-count']");
        TestLogger.log("click on shopping cart");
        sleepFor(5);

    }
    @Test
    public void searchVarify(){
        clickOnElementById("twotabsearchtextbox");
        TestLogger.log("search varify");
        sleepFor(5);
    }
    @Test
    public void autosuggestion(){
        clickOnElementByXpath("//a[contains(text(),'daily deals email')]");
        TestLogger.log("Click auto suggestion");
        sleepFor(5);
    }
    @Test
    public void navigate(){
        // clickOnElementByXpath();
        //  TestLogger.log();
    }


}

