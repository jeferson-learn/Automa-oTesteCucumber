package pages;

import frameworks.utils.Wait;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Utils;

public class HomePage extends Utils {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acessarAplicacao() throws InterruptedException {
        driver.get("https://www.qazando.com.br/");
//        Thread.sleep(5000);

        driver.manage().window().maximize();
//        wait.waitVisibilityElement(By.cssSelector("#poptinDraggableContainer .close-icon"));
        esperarElementoEstarPresente(By.cssSelector("#poptinDraggableContainer .close-icon"), 15);
        System.out.println(driver.findElement(By.cssSelector("#poptinDraggableContainer .close-icon")).isDisplayed());
        driver.findElement(By.cssSelector("#poptinDraggableContainer .close-icon")).click();
    }

    public void preencheEmail() {
        driver.findElement(By.id("email")).sendKeys("jefy@gmail.com"+ Keys.ENTER);
    }

    public void clicarGanharDesconto() {

    }

    public void verificaCupomDesconto() {
        String codigo = driver.findElement(By.cssSelector(".cupom-text span")).getText();

        Assert.assertEquals("Codigo diferente", "QAZANDO15OFF", codigo);
    }
}
