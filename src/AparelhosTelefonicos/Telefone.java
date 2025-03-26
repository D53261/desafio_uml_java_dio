package AparelhosTelefonicos;
public class Telefone implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + " pelo Nokia");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada no Nokia");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz no Nokia");
    }
}
