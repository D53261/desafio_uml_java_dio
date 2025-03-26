import AparelhosTelefonicos.AparelhoTelefonico;
import Iphone.Iphone;
import NavegadoresInternet.NavegadorInternet;
import ReprodutoresMusicais.ReprodutorMusical;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto Iphone e de outros objetos para teste de polimorfismo
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutor = iphone; // Polimorfismo: Iphone é um ReprodutorMusical
        AparelhoTelefonico telefone = iphone; // Polimorfismo: Iphone é um AparelhoTelefonico
        NavegadorInternet navegador = iphone; // Polimorfismo: Iphone é um NavegadorInternet
        // Testando os métodos do ReprodutorMusical
        reprodutor.tocar(); // Chama o método tocar do iPhone
        reprodutor.pausar(); // Chama o método pausar do iPhone
        reprodutor.selecionarMusica("Musica 1"); // Chama o método selecionarMusica do iPhone
        System.out.println("-----------------");

        // Testando os métodos do AparelhoTelefonico
        telefone.ligar("123456789"); // Chama o método ligar do iPhone
        telefone.atender(); // Chama o método atender do iPhone
        telefone.iniciarCorreioVoz(); // Chama o método iniciarCorreioVoz do iPhone
        System.out.println("-----------------");

        // Testando os métodos do NavegadorInternet
        navegador.exibirPagina("www.exemplo.com"); // Chama o método exibirPagina do iPhone
        navegador.adicionarNovaAba(); // Chama o método adicionarNovaAba do iPhone
        navegador.atualizarPagina(); // Chama o método atualizarPagina do iPhone
    }
}
