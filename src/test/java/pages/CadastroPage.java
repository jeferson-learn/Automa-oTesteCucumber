package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import support.Utils;

public class CadastroPage extends Utils {

    WebDriver driver;
    private By titleM = By.id("id_gender1");
    private By titleF = By.id("id_gender2");
    private By firstName = By.id("customer_firstname");
    private By lastName = By.id("customer_lastname");
    private By password = By.id("passwd");

    private By select_day_field = By.id("days");
    private By select_months_field = By.id("months");
    private By select_years_field = By.id("years");

    public CadastroPage(WebDriver driver) {
        this.driver = driver;
    }

    public void selectTitle(Integer type) {
        if(type == 1) {
            driver.findElement(titleM).click();
        } else if (type == 2) {
            driver.findElement(titleF).click();
        }
    }

    public void preencheNome(String nome) {
        driver.findElement(firstName).sendKeys(nome);
    }
    public void preencheSobrenome(String sobrenome) {
        driver.findElement(lastName).sendKeys(sobrenome);
    }
    public void preencheSenha(String senha) {
        driver.findElement(password).sendKeys(senha);
    }

    public void selecionaAniversario(Integer day, Integer month, Integer year) {
        Select select_day = new Select(driver.findElement(select_day_field));
        select_day.deselectByIndex(day);

        Select select_month = new Select(driver.findElement(select_months_field));
        select_month.deselectByIndex(month);

        Select select_year = new Select(driver.findElement(select_years_field));
        select_year.deselectByIndex(year);

    }
}
