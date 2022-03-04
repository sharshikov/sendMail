import Pages.MailAccount;
import Pages.MailMain;
import Tools.PageFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import java.time.Duration;

public class SendMailTest {
    @BeforeAll
    public static void SetUp(){
        PageFactory.getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        PageFactory.getDriver().manage().window().maximize();
        PageFactory.getDriver().get("https://mail.ru");
    }
    @Test
    public void testSendMail(){
        new MailMain().loginMail("george.bush1946","D98SEdwR");
        new MailAccount().sendMail("zapp@javarush.ru","D98SEdwR");
    }
    @AfterAll
    public static void tearDown() {
        PageFactory.getDriver().quit();
    }
}
