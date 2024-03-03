public class PrincipalDois {
    public static void main(String[] args) {
        Celular celularBasico = new ModeloBasico();
        celularBasico.ligar();
        celularBasico.fazerLigacao("31 996390255");
        celularBasico.enviarMensagem("31 996289047", "Olá!");

        Celular celularAvancado = new ModeloAvancado();
        celularAvancado.ligar();
        celularAvancado.fazerLigacao("31996390255");
        celularAvancado.enviarMensagem("31988332412", "Tudo bem?");
        ((ModeloAvancado) celularAvancado).exibirHistorico();
    }
}