package stepdefinitions;

import driver.Driver;
import io.cucumber.java.After;
import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import pages.CalculatorPage;

public class CalculatorStep {

    CalculatorPage calculatorPage = new CalculatorPage();

    @After
    public void close() {
        Driver.closeApp();
    }

    @Dado("Que o usuário abra a aplicação")
    public void queOUsuárioAbraAAplicação() {
        Driver.createInstance();
    }

    @Quando("O usuário fecha a diálogo de mensagem inicial")
    public void oUsuárioFechaADiálogoDeMensagemInicial() {
        calculatorPage.closeDialog();
    }

    @Quando("O usuário clica no dígito {string}")
    public void oUsuárioClicaNoDígito(String arg0) {
        calculatorPage.click(arg0);
    }

    @Quando("O usuário clica no botão somar")
    public void oUsuárioClicaNoBotãoSomar() {
        Driver.getDriver().findElement(By.id(calculatorPage.plus)).click();
    }

    @E("O usuário clica no botão igual")
    public void oUsuárioClicaNoBotãoIgual() {
        Driver.getDriver().findElement(By.id(calculatorPage.equals));
    }

    @Entao("A aplicação deve mostrar o resultado da operação {string}")
    public void aAplicaçãoDeveMostrarOResultadoDaOperação(String arg0) {
        Assertions.assertEquals(arg0, calculatorPage.getResult());
    }

    @Quando("O usuário clica no botão subtrair")
    public void oUsuárioClicaNoBotãoSubtrair() {
        Driver.getDriver().findElement(By.id(calculatorPage.minus)).click();
    }

    @Quando("O usuário clica no botão multiplicar")
    public void oUsuárioClicaNoBotãoMultiplicar() {
        Driver.getDriver().findElement(By.id(calculatorPage.multiply)).click();
    }

    @Quando("O usuário clica no botão dividir")
    public void oUsuárioClicaNoBotãoDividir() {
        Driver.getDriver().findElement(By.id(calculatorPage.divider)).click();
    }
}
