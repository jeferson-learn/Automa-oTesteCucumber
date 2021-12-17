package steps;


import cucumber.api.java.pt.*;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import pages.HomePage;
import runner.RunCucumberTest;

public class DescontosStep extends RunCucumberTest {

//    WebDriver driver = new ChromeDriver();
    HomePage homePage = new HomePage(driver);

    @Dado("^que estou no site da Qazando$")
    public void acessar_site_Qazando() throws InterruptedException {
        homePage.acessarAplicacao();
//        driver.get("https://www.qazando.com.br/");
//        driver.manage().window().maximize();

//        Thread.sleep(3000);
//        System.out.println("1: " + driver.findElement(By.cssSelector("#liteboxFormat15 #poptinDraggableContainer .close-icon")).isDisplayed());
//        wait.waitElementToBeClickable(By.cssSelector("#poptinDraggableContainer .close-icon"));
//        driver.findElement(By.cssSelector("#poptinDraggableContainer .close-icon")).click();
    }
    @Quando("^eu preencho no site da Qazando$")
    public void eu_preencho_no_site_da_Qazando() {
        homePage.preencheEmail();
//        driver.findElement(By.id("email")).sendKeys("jefyx1@hotmail.com");
//        driver.findElement(By.id("email")).sendKeys("jefy@gmail.com"+ Keys.ENTER);
    }

    @Quando("^clico em ganhar cupom$")
    public void clico_em_ganhar_cupom() throws InterruptedException {

//        Thread.sleep(5000);
//        wait.waitElementToBeClickable();
//        wait.waitElementToBeClickable(By.id("button"));
//        wait.waitVisibilityElement(By.id("button"));
//        System.out.println(">>>"+driver.findElement(By.id("button")).isDisplayed());
//        driver.findElement(By.cssSelector(".duvidas-content")).click();
//        System.out.println("2: " +driver.findElement(By.id("button")).isEnabled());
//        driver.findElement(By.id("button")).click();
//        System.out.println(">>>"+driver.findElement(By.cssSelector("#form #button")).isDisplayed());
//        driver.findElement(By.cssSelector("#form #button")).click();
//        WebElement element = driver.findElement(By.cssSelector("#form #button"));
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

    @Entao("^eu vejo o código de desconto$")
    public void eu_vejo_o_codigo_de_desconto() {
        homePage.verificaCupomDesconto();
//        String codigo = driver.findElement(By.cssSelector(".cupom-text span")).getText();
//        System.out.println("4: " + codigo);
//
//        Assert.assertEquals("Codigo diferente", "QAZANDO15OFF", codigo);

//        driver.quit();
    }

    @Dado("^que tenho cupom gerado$")
    public void gerarCupom() throws InterruptedException {
        homePage.acessarAplicacao();
        homePage.preencheEmail();
        homePage.verificaCupomDesconto();
    }

    @Quando("^eu falho$")
    public void eu_falho() {
        driver.findElement(By.id("emailx")).sendKeys("jefy@gmail.com"+ Keys.ENTER);
    }

}
