class ModeloAvancado implements Celular {
    private StringBuilder historicoLigacoes = new StringBuilder();
    private StringBuilder historicoMensagens = new StringBuilder();

    @Override
    public void ligar() {
        System.out.println("Celular avançado ligado.");
    }

    @Override
    public void desligar() {
        System.out.println("Celular avançado desligado.");
    }

    @Override
    public void fazerLigacao(String numero) {
        System.out.println("Ligando para " + numero);
        historicoLigacoes.append("Ligação para ").append(numero).append("\n");
    }

    @Override
    public void enviarMensagem(String numero, String mensagem) {
        System.out.println("Enviando mensagem para " + numero + ": " + mensagem);
        historicoMensagens.append("Mensagem para ").append(numero).append(": ").append(mensagem).append("\n");
    }

    public void exibirHistorico() {
        System.out.println("Histórico de ligações:\n" + historicoLigacoes);
        System.out.println("Histórico de mensagens:\n" + historicoMensagens);
    }
}