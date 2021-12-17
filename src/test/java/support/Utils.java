package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumberTest;

import java.util.Random;

public class Utils extends RunCucumberTest {

    public void esperarElementoEstarPresente(By elemento, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(driver, tempo);
        wait.until(ExpectedConditions.elementToBeClickable(elemento));
    }

    public String getRandomEmail() {
        String email_ini = "qazando_";
        String email_final = "@qazando.com.br";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999;
        int resultado = random.nextInt(maximo-minimo) + minimo;

        return email_ini + resultado + email_final;
    }
}
