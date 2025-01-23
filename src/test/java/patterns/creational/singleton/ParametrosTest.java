package patterns.creational.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParametrosTest {
    @Test
    public void deveRetornarUsuarioLogado(){
        Parametros.getInstance().setUsuarioLogado("MDHG");
        assertEquals("MDHG", Parametros.getInstance().getUsuarioLogado());
    }

    @Test
    public void deveRetornarCodigoLaboratorio(){
        Parametros.getInstance().setCodigoLaboratorio("100");
        assertEquals("100", Parametros.getInstance().getCodigoLaboratorio());
    }
}