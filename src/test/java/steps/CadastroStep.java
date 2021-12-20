package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.CadastroPage;
import pages.LoginPage;
import runner.RunCucumberTest;

public class CadastroStep extends RunCucumberTest {

    CadastroPage cadastroPage = new CadastroPage(driver);

    @Quando("^eu preencho o formulário de cadastro$")
    public void eu_preencho_o_formulário_de_cadastro() {
        cadastroPage.selectTitle(1);
        cadastroPage.preencheNome("Jeferson");
        cadastroPage.preencheSobrenome("Lopes");
        cadastroPage.preencheSenha("123456");
        cadastroPage.selecionaAniversario(3, 11, "1992");
        cadastroPage.preencheEndereco("Setor 1 Quadra N");
        cadastroPage.preencheCidade("Canoas");
        cadastroPage.selecioneEstado("Colorado");
        cadastroPage.preenchePostalCode("88800");
//        cadastroPage.selecionePais("");
        cadastroPage.preencheTelefone("98765432");
        cadastroPage.preencheAssign("jefy@gmail.com");
    }

    @Quando("^clico em registrar$")
    public void clico_em_registrar() {
        cadastroPage.clicaBotaoRegistrar();
    }

    @Então("^vejo cadastro realizado com sucesso$")
    public void vejo_cadastro_realizado_com_sucesso() {

    }


}
