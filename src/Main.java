import AparelhosTelefonicos.AparelhoTelefonico;
import AparelhosTelefonicos.Telefone;
import Iphone.Iphone;
import NavegadoresInternet.Internet;
import NavegadoresInternet.NavegadorInternet;
import ReprodutoresMusicais.MP3;
import ReprodutoresMusicais.ReprodutorMusical;

public class Main {
    public static void main(String[] args) throws Exception {
        // Criação de um objeto Iphone e de outros objetos para teste de polimorfismo
        Iphone iphone = new Iphone();
        ReprodutorMusical reprodutor = iphone; // Polimorfismo: Iphone é um ReprodutorMusical
        MP3 mp3 = new MP3(); // Criação de um objeto MP3
        AparelhoTelefonico telefone = iphone; // Polimorfismo: Iphone é um AparelhoTelefonico
        Telefone telefone_fixo = new Telefone(); // Criação de um objeto Telefone
        NavegadorInternet navegador = iphone; // Polimorfismo: Iphone é um NavegadorInternet
        Internet internet = new Internet(); // Criação de um objeto Internet
        // Testando os métodos do MP3
        mp3.tocar(); // Chama o método tocar do MP3
        mp3.pausar(); // Chama o método pausar do MP3
        mp3.selecionarMusica("Musica 1"); // Chama o método selecionarMusica do MP3
        System.out.println("-----------------");

        // Testando os métodos do Telefone fixo
        telefone_fixo.ligar("123456789"); // Chama o método ligar do Telefone
        telefone_fixo.atender(); // Chama o método atender do Telefone
        telefone_fixo.iniciarCorreioVoz(); // Chama o método iniciarCorreioVoz do Telefone
        System.out.println("-----------------");

        // Testando os métodos do Internet
        internet.exibirPagina("www.exemplo.com"); // Chama o método exibirPagina do Internet
        internet.adicionarNovaAba(); // Chama o método adicionarNovaAba do Internet
        internet.atualizarPagina(); // Chama o método atualizarPagina do Internet
        System.out.println("-----------------");
        System.out.println("-----------------");

        // Testando os métodos do ReprodutorMusical do Iphone
        reprodutor.tocar(); // Chama o método tocar do iPhone
        reprodutor.pausar(); // Chama o método pausar do iPhone
        reprodutor.selecionarMusica("Musica 1"); // Chama o método selecionarMusica do iPhone
        System.out.println("-----------------");

        // Testando os métodos do AparelhoTelefonico do iPhone
        telefone.ligar("123456789"); // Chama o método ligar do iPhone
        telefone.atender(); // Chama o método atender do iPhone
        telefone.iniciarCorreioVoz(); // Chama o método iniciarCorreioVoz do iPhone
        System.out.println("-----------------");

        // Testando os métodos do NavegadorInternet do iPhone
        navegador.exibirPagina("www.exemplo.com"); // Chama o método exibirPagina do iPhone
        navegador.adicionarNovaAba(); // Chama o método adicionarNovaAba do iPhone
        navegador.atualizarPagina(); // Chama o método atualizarPagina do iPhone
    }
}
