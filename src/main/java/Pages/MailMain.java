package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailMain {

    public MailMain(){PageFactory.initElements(Tools.PageFactory.getDriver(),this);}

    @FindBy(xpath="//button[@data-testid='enter-mail-primary']")
    private WebElement enterMailButton;

    @FindBy(xpath="//input[@name='username']")
    private WebElement userName;

    @FindBy(xpath="//button[@data-test-id='next-button']")
    private WebElement setPasswordButton;

    @FindBy(xpath="//input[@name='password']")
    private WebElement userPassword;

    @FindBy(xpath="//button[@data-test-id='submit-button']")
    private WebElement loginButton;

    @FindBy(xpath="//iframe[@class='ag-popup__frame__layout__iframe']")
    private WebElement frame;

    @FindBy(xpath="//a[@title='Написать письмо']")
    private WebElement writeLetterButton;

    public void loginMail(String name, String password){
        WebDriver webDriver = Tools.PageFactory.getDriver();
        enterMailButton.click();
        webDriver.switchTo().frame(frame);
        userName.clear();
        userName.sendKeys(name);
        setPasswordButton.click();
        userPassword.clear();
        userPassword.sendKeys(password);
        loginButton.click();
        webDriver.switchTo().defaultContent();
    }
}
