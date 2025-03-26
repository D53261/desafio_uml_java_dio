package NavegadoresInternet;
public class Internet implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + " na Internet");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba na Internet");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página na Internet");
    }

}
