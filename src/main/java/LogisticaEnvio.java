import java.awt.*;

public abstract class LogisticaEnvio {

    public void renderWindow(){
        Envio okButton = createButton();
        okButton.enviar();

    }
    public abstract Envio createButton();
}
