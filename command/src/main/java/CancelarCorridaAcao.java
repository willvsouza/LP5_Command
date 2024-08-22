public class CancelarCorridaAcao implements Acao {

    private Corrida corrida;

    public CancelarCorridaAcao(Corrida corrida) {
        this.corrida = corrida;
    }

    public void executar(){
        this.corrida.cancelarCorrida();
    }
    public void cancelar(){
        this.corrida.executarCorrida();
    }

}
