package entidades;

public class Iphone implements AparelhoTelefonico, NavegadorDeInternet, ReprodutorMusical{


    @Override
    public void ligar(int numero) {
        System.out.println("Ligando para o numero: " + numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo chamada");
    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("Correio de voz iniciado");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Aba nova adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Música Pausada");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Música selecionada");
    }
}
