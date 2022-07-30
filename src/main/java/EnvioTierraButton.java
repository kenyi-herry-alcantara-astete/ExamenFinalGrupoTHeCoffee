import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EnvioTierraButton implements Envio{
    public void enviar() {
        System.out.println("Enviado por Tierra");
        GUIApp obj = new GUIApp();
        obj.enviarPorTierraButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("Enviado por Tierra");
            }
        });
    }
}
