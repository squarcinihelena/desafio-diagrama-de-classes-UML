import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

// Classe IPhone implementando as interfaces ReprodutorMusical, AparelhoTelefonico e NavegadorInternet
public class IPhone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    // Implementação dos métodos da interface ReprodutorMusical
    public void tocarMusica() {
        // Código para tocar música
    }

    public void pausarMusica() {
        // Código para pausar música
    }

    public void mudarMusica(String musica) {
        // Código para selecionar música
    }

    // Implementação dos métodos da interface AparelhoTelefonico
    public void ligar(String numero) {
        // Código para realizar uma chamada
    }

    public void atender() {
        // Código para atender uma chamada
    }

    public void correioVoz() {
        // Código para iniciar o correio de voz
    }

    // Implementação dos métodos da interface NavegadorInternet
    public void exibirPagina(String url) {
        // Código para exibir uma página da web
    }

    public void adicionarNovaAba(String url) {
        // Código para adicionar uma nova aba no navegador
    }

    public void atualizarPagina() {
        // Código para atualizar a página atual do navegador
    }

    public static void main(String[] args) {
        IPhone iPhone = new IPhone();

        // Testando funcionalidades do ReprodutorMusical
        iPhone.tocarMusica();
        iPhone.pausarMusica();
        iPhone.mudarMusica("Something About Us - Daft Punk");

        // Testando funcionalidades do AparelhoTelefonico
        iPhone.ligar("19985654");
        iPhone.atender();
        iPhone.correioVoz();

        // Testando funcionalidades do NavegadorInternet
        iPhone.exibirPagina("www.JoaoMaria.com");
        iPhone.adicionarNovaAba("www.MiniBunny.com");
        iPhone.atualizarPagina();
    }
}
