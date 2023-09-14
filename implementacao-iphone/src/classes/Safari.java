package classes;

import interfaces.NavegadorInternet;

public class Safari implements NavegadorInternet {
    @Override
    public void exibirPagina() {
        System.out.println(" - Safari: Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println(" - Safari: Adicionando nova aba");
    }

    @Override
    public void atualizarPagina() {
        System.out.println(" - Safari: Atualizando página");
    }
}
