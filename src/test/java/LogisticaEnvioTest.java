import controller.factorymethod.Envio;
import controller.factorymethod.LogisticaEnvio;
import controller.memento.Container;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticaEnvioTest extends LogisticaEnvio {

    @Test
    public void TestgetEnvio(){
        Container container = new Container();
        container.setPesoTotal(4200);
        Envio envio = getEnvio(container);
        assertEquals( "Enviado por Barco",envio.enviar());

        Container container2 = new Container();
        container2.setPesoTotal(800);
        Envio envio2 = getEnvio(container2);
        assertEquals("Enviado por Aire",envio2.enviar());

    }

    @Override
    public Envio createEnvio() {
        return null;
    }
}
