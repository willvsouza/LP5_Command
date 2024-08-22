public class Corrida {

    private String motorista;
    private float valorCorrida;
    private boolean corridaAtiva;

    public Corrida(String motorista, float valorCorrida) {
        this.motorista = motorista;
        this.valorCorrida = valorCorrida;
    }

    public boolean isCorridaAtiva() {
        return corridaAtiva;
    }

    public void setCorridaAtiva(boolean corridaAtiva) {
        this.corridaAtiva = corridaAtiva;
    }

    public String executarCorrida(){
        setCorridaAtiva(true);
        return "Corrida com o(a) motorista "+ this.motorista +", no valor de R$"+ this.valorCorrida +" confirmada.";
    }
    public String cancelarCorrida(){
        setCorridaAtiva(false);
        return "Corrida cancelada - o valor de R$"+ this.valorCorrida +" será estornado no seu cartão.";
    }

}
