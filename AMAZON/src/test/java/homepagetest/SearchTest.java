package homepagetest;

import homepage.HomePage2;
import homepage.Search;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import searchresult.ReasultPage;

import java.util.List;

public class SearchTest extends HomePage2 {
    HomePage2 homePage2 = new HomePage2();

    @Test(enabled =false)
    public void validatesearchbuttonworks() {
        clickonsearchBar();
        //  typeonsearchbar();
        //clickonsearchbutton();
        sleepFor(20);
        //   SearchTest.();
        sleepFor(20);
    }

    @Test(enabled =false)
    public void testAlldropdown() {
            List<WebElement> elementList = getAllElementFromlist();
             System.out.println(elementList.size());
             for (int i = 0;i<elementList.size();i++){
            System.out.println(elementList.get(i).getText());

        }


    }
}