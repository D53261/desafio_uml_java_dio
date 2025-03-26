package NavegadoresInternet;
public class Internet implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo a página " + url + " no Google Chrome");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba no Google Chrome");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página no Google Chrome");
    }

}
