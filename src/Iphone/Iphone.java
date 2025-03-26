package Iphone;
import AparelhosTelefonicos.AparelhoTelefonico;
import NavegadoresInternet.NavegadorInternet;
import ReprodutoresMusicais.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {
    @Override
    public void tocar() {
        System.out.println("Tocando musica pelo iPhone");
    }

    @Override
    public void pausar() {
        System.out.println("Musica pausada no iPhone");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica " + musica + " no iPhone");
    }

    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " pelo iPhone");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no iPhone");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no iPhone");
    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a pagina " + url + " no iPhone");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no iPhone");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando pagina no iPhone");
    }
}