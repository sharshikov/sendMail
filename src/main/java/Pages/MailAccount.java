package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MailAccount {
    public MailAccount(){
        PageFactory.initElements(Tools.PageFactory.getDriver(),this);}

    @FindBy(xpath="//input[@class='container--H9L5q size_s--3_M-_' and not(@name='Subject')]")
    private WebElement mailToInput;

    @FindBy(xpath="//div[@role='textbox']")
    private WebElement mailBodyInput;

    @FindBy(xpath="//span[text()='Отправить']")
    private WebElement sendButton;

    @FindBy(xpath="//a[@title='Написать письмо']")
    private WebElement writeLetterButton;

    public void sendMail(String mailTo,String mailBody){
        writeLetterButton.click();
        mailToInput.sendKeys(mailTo);
        mailBodyInput.sendKeys(mailBody);
        sendButton.click();
    }
}
