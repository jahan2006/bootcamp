package testclass;

import newpage.CignaPage;
import org.testng.annotations.Test;

public class CignaTest {
    CignaPage cignaPage=new CignaPage();



  //  @BeforeMethod
  //  public void initialization(){
      //  cignaPage= PageFactory.initElements(driver,cignaPage.class);
 //   }

    @Test(enabled = true)
    public void testSetPlan1(){
        cignaPage.sleepFor(5);
    }

    @Test(enabled = true)
    public void testSetPlan2(){
        cignaPage.sleepFor(5);
    }

    @Test(enabled = true)
    public void testSetPlan3(){
        cignaPage.sleepFor(5);
    }

    @Test(enabled = true)
    public void testSetPlan4(){
        cignaPage.sleepFor(5);
    }

}
