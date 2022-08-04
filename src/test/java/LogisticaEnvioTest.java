import controller.factorymethod.Shipping;
import controller.factorymethod.LogisticsShipping;
import controller.memento.Container;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LogisticaEnvioTest extends LogisticsShipping {

    @Test
    public void TestgetEnvio(){
        Container container = new Container();
        container.setPesoTotal(4200);
        Shipping envio = getEnvio(container);
        assertEquals( "Enviado por Barco",envio.enviar());

        Container container2 = new Container();
        container2.setPesoTotal(800);
        Shipping envio2 = getEnvio(container2);
        assertEquals("Enviado por Aire",envio2.enviar());

    }

    @Override
    public Shipping createEnvio() {
        return null;
    }
}
