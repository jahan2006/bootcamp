package homepage;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import report.TestLogger;

import java.util.List;

public class HomePage2 extends CommonAPI {
        public void clickonsearchBar() {
        clickOnElementByXpath("//span[contains(text(),'Try Prime')]");
            TestLogger.log("search bar clicked");
        }
        public void typeonsearchbar(String Value){
     //   typeOnElementByXpath("//nav-line-2)", Value);
        TestLogger.log(Value + "type on the search bar ");
        }
        public void clickonsearchbutton(){
        clickOnElementByXpath("nav-line-1");
        TestLogger.log("search button clicked");
        }
        public List<WebElement>getAllElementFromlist() {
        //return elementlist
        return driver.findElements(By.xpath("//select[@id='searchDropdownBox']"));

        }
    }



