import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnvioAireButton implements Envio{
    @Override
        public void enviar() {
            GUIApp obj = new GUIApp();
            obj.enviarPorAireButton.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.out.println("Enviado por Aire");
                }
            });
        }
    }

