package classes;

import interfaces.ReprodutorMusical;

public class Ipod implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println(" - Ipod: Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println(" - Ipod: Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println(" - Ipod: Selecionando música");
    }
}
