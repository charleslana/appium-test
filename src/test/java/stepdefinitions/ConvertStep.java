package stepdefinitions;

import driver.Driver;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.ConvertPage;

public class ConvertStep {

    ConvertPage convertPage = new ConvertPage();

    @Quando("O usuário clica no menu converter")
    public void oUsuárioClicaNoMenuConverter() {
        Driver.getDriver().findElement(By.xpath(convertPage.menuConvert)).click();
    }

    @Quando("O usuário clica no menu time")
    public void oUsuárioClicaNoMenuTime() {
        Driver.getDriver().findElement(By.xpath(convertPage.menuTime)).click();
    }

    @Quando("O usuário seleciona o primeiro tipo de tempo")
    public void oUsuárioSelecionaOPrimeiroTipoDeTempo() {
        Driver.getDriver().findElement(By.xpath(convertPage.firstSelectTime)).click();
        Driver.getDriver().findElement(By.xpath(convertPage.selectTimeChooseHour)).click();
    }

    @Quando("O usuário seleciona o segundo tipo de tempo")
    public void oUsuárioSelecionaOSegundoTipoDeTempo() {
        Driver.getDriver().findElement(By.xpath(convertPage.secondSelectTime)).click();
        Driver.getDriver().findElement(By.xpath(convertPage.selectTimeChooseSecond)).click();
    }

    @Entao("A aplicação deve mostrar no resultado da conversão {string}")
    public void aAplicaçãoDeveMostrarNoResultadoDaConversão(String arg0) {
        Assertions.assertEquals(arg0, Driver.getDriver().findElement(By.xpath(String.format(convertPage.result, arg0.replace(",", "")))).getText());
    }
}
