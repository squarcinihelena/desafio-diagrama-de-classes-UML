package interfaces;

// Interface para Navegador na Internet
public interface NavegadorInternet {
    void exibirPagina(String url);

    void adicionarNovaAba(String url);

    void atualizarPagina();
}