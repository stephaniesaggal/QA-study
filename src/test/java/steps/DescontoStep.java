package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Quando;
import cucumber.api.java.pt.Então;
import pages.HomePage;
import runners.RunCucumberTest;


public class DescontoStep extends RunCucumberTest {

    HomePage homePage = new HomePage(driver)

    @Dado("que estou no site da qazando")
    public void acessar_site_qazando() {
        homePage.acessarAplicacao();
    }

    @Quando("eu preencho meu e-mail")
    public void eu_preencho_meu_e_mail() throws InterruptedException{
        homePage.scrollDown();
        homePage.preencheEmail();
    }

    @Quando("clico em ganhar cupom")
    public void clico_em_ganhar_cupom() {
        homePage.cliqueGanharDesconto();
    }

    @Então("eu vejo o código de desconto")
    public void eu_vejo_o_código_de_desconto() {
        homePage.verificarCupomDesconto();
    }
}
