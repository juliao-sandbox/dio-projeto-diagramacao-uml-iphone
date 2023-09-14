import classes.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone iphone = new IPhone();

        iphone.ligar();
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica();
    }
}
