import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AplicativoTransporteTeste {

    AplicativoTransporte aplicativoTransporte;
    Corrida corrida;

    @BeforeEach
    void setUp() {
        aplicativoTransporte = new AplicativoTransporte();
        corrida = new Corrida ("Rayane", 35);
    }

    @Test
    void deveConfirmarCorrida() {
        Acao executarCorrida = new ConfirmarCorridaAcao(corrida);
        aplicativoTransporte.executarCorrida(executarCorrida);

        assertEquals("Corrida com o(a) motorista Rayane, no valor de R$35.0 confirmada.", corrida.executarCorrida());
    }

    @Test
    void deveCancelarCorrida() {
        Acao cancelarCorrida = new CancelarCorridaAcao(corrida);
        aplicativoTransporte.cancelarCorrida(cancelarCorrida);

        assertEquals("Corrida cancelada - o valor de R$35.0 será estornado no seu cartão.", corrida.cancelarCorrida());
    }

    @Test
    void deveConfirmarCorridaAtiva() {
        Acao executarCorrida = new CancelarCorridaAcao(corrida);
        aplicativoTransporte.executarCorrida(executarCorrida);
        corrida.executarCorrida();

        assertTrue(corrida.isCorridaAtiva());
    }

    @Test
    void deveConfirmarCorridaNaoAtiva() {
        Acao cancelarCorrida = new CancelarCorridaAcao(corrida);
        aplicativoTransporte.executarCorrida(cancelarCorrida);
        corrida.cancelarCorrida();

        assertFalse(corrida.isCorridaAtiva());
    }

}
