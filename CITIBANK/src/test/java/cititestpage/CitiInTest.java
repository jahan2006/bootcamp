package cititestpage;

import base.CommonAPI;
import citipackge.CitiSignIn;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CitiInTest{
    CitiSignIn citiSignIn= new CitiSignIn();

        @BeforeMethod
        public void initialization() {
          //  CitiSignIn = PageFactory.initElements(driver, CitiSignIn.class);

        }

        @Test(enabled = true)
        public void testSignIn(){
          //  CitiSignIn.testSignIn();

        }

        @Test(enabled = true)
        public void testbanking(){
          //  CitiSignIn.banking();
        }

        @Test(enabled = true)
        public void testSearch(){
          //  CitiSignIn.search();

        }


    }



