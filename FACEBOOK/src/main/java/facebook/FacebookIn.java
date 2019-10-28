package facebook;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FacebookIn extends CommonAPI {

// login
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(id = "pass")
    public WebElement pass;
//
    @FindBy(partialLinkText = "Forgot account")
    public WebElement forgot;
//search name
    @FindBy(xpath = "//input[@placeholder='Search']")
    WebElement search;
//
    @FindBy(linkText = "People")
    WebElement people;

    @FindBy(xpath = "//button[@aria-label='Add Friend']")
    WebElement addFriend;
//friend request
    @FindBy(className = "_4kny")
    WebElement friendReq;
//accetp
    @FindBy(name = "actions[accept]")
    WebElement acceptButton;
//like
    @FindBy(partialLinkText = "Like")
    WebElement like;
//upload
    @FindBy(xpath = "//input[@type='file']")
    WebElement upload;
//
    @FindBy(xpath = "//input[@type='submit']")
    WebElement submit;
//comment
    @FindBy(partialLinkText = "Comment")
    WebElement comment;



    }
