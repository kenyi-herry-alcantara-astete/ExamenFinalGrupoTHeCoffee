package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApp extends JFrame {
    private JButton enviarPorTierraButton;
    private JButton enlistarItemsButton;
    private JPanel PanelAppPrincipal;
    private JLabel mensajeDeTipoDeEnvio;
    private JPanel panelMensaje;

    private GUIContainer guiContainer;

    public static void main(String[] args) {

        //Inicio de app
        GUIApp guiApp= new GUIApp();


        String mensaje = "HOla";
        //Mostrando mensaje de envio
        guiApp.mensajeDeTipoDeEnvio.setText(mensaje);

    }

    public GUIApp(){

        PanelAppPrincipal.setLayout(new BorderLayout());


        setContentPane( PanelAppPrincipal);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,720,520);
        setBounds(250,100,820,620);
        setVisible(true);
        enlistarItemsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                guiContainer = new GUIContainer();
            }
        });
        enviarPorTierraButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
