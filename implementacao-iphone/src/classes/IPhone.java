package classes;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class IPhone implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical {
    private Phone phone;
    private Ipod ipod;
    private Safari safari;
    public IPhone() {
        phone = new Phone();
        ipod = new Ipod();
        safari = new Safari();
        System.out.println("iPhone inicializado");
    }

    @Override
    public void ligar() {
        phone.ligar();
    }

    @Override
    public void atender() {
        phone.atender();
    }

    @Override
    public void iniciarCorreioVoz() {
        phone.iniciarCorreioVoz();
    }

    @Override
    public void exibirPagina() {
        safari.exibirPagina();
    }

    @Override
    public void adicionarNovaAba() {
        safari.adicionarNovaAba();
    }

    @Override
    public void atualizarPagina() {
        safari.atualizarPagina();
    }

    @Override
    public void tocar() {
        ipod.tocar();
    }

    @Override
    public void pausar() {
        ipod.pausar();
    }

    @Override
    public void selecionarMusica() {
        ipod.selecionarMusica();
    }
}
