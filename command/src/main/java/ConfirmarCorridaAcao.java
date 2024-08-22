public class ConfirmarCorridaAcao implements Acao {

    private Corrida corrida;

    public ConfirmarCorridaAcao(Corrida corrida) {
        this.corrida = corrida;
    }

    public void executar(){
        this.corrida.executarCorrida();
    }
    public void cancelar(){
        this.corrida.cancelarCorrida();
    }

}
