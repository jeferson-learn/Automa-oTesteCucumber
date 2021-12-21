package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.MessagePage;
import runner.RunCucumberTest;

public class MessageSteps extends RunCucumberTest {

    MessagePage messagePage = new MessagePage(driver);

    @Dado("^que estou na tela de mensagem$")
    public void que_estou_na_tela_de_mensagem() {
        messagePage.acessarTelaMessagem();
    }

    @Dado("^preencho todos os campos$")
    public void preencho_todos_os_campos() {
        messagePage.subjectHeadingSelect("1");
        messagePage.emailAddressField();
        messagePage.attacheFile("C:\\Users\\Jeferson\\IdeaProjects\\QazandoSeleniumTest\\update.jpeg");
        messagePage.messageFiled("Minha mensagem");
    }

    @Quando("^clico em enviar mensagem$")
    public void clico_em_enviar_mensagem() {
        messagePage.sendButton();
    }

    @Então("^vejo feedback de mensagem enviada com sucesso$")
    public void vejo_feedback_de_mensagem_enviada_com_sucesso() {
        messagePage.validarSuccess();
    }
}
