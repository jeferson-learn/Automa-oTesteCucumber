package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class MessagePage extends Utils {

    WebDriver driver;
    private By subject_select = By.id("id_contact");
    private By email_field = By.id("email");
    private By order_select = By.className("id_order");
    private By attach_file = By.id("fileUpload");
    private By message_filed = By.id("message");
    private By sendButton = By.id("submitMessage");
    private By messageSuccess = By.cssSelector(".alert-success");


    public MessagePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarTelaMessagem() {
        driver.get("http://automationpractice.com/index.php?controller=contact");
        String titulo = driver.findElement(By.cssSelector("#center_column .page-heading")).getText();
        Assert.assertEquals("CUSTOMER SERVICE - CONTACT US", titulo);
    }

    public void subjectHeadingSelect(String select) {
        Select select_subject = new Select(driver.findElement(subject_select));
        select_subject.selectByValue(select);
    }

    public void emailAddressField() {
        driver.findElement(email_field).sendKeys(getRandomEmail());
    }

    public void orderReferenceSelect() {
        Select select_subject = new Select(driver.findElement(subject_select));
        select_subject.selectByValue("0");
    }

    public void attacheFile(String pathFile) {
        driver.findElement(attach_file).sendKeys(pathFile);
    }

    public void messageFiled(String message) {
        driver.findElement(message_filed).sendKeys(message);
    }

    public void sendButton() {
        driver.findElement(sendButton).click();
    }

    public void validarSuccess() {
        String message = driver.findElement(messageSuccess).getText();
        Assert.assertEquals("Your message has been successfully sent to our team." , message);
    }

}
