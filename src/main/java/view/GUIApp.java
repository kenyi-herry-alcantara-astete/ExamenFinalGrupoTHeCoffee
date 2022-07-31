package view;

import controller.factorymethod.Envio;
import controller.factorymethod.LogisticaAvion;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApp extends JFrame {
    private JButton enviar;
    private JButton enlistarItemsButton;
    private JPanel PanelAppPrincipal;
    private JLabel mensajeDeTipoDeEnvio;
    private JPanel panelMensaje;
    private JPanel topPanel;
    private JPanel mainPanel;

    private GUIContainer guiContainer;

    public static void main(String[] args) {

        //Inicio de app
        GUIApp guiApp= new GUIApp();

        //Tipo de envío con el patron factory.method
        LogisticaAvion logisticaAvion = new LogisticaAvion();

        //Obtenemos el tipo de envío dependiendo el container enlistado en el patron memento
        Envio envio = logisticaAvion.getEnvio(guiApp.guiContainer.getContainer());

        //Mostrando mensaje de envío
        guiApp.mensajeDeTipoDeEnvio.setText(envio.enviar());

    }

    public GUIApp(){


        PanelAppPrincipal.setLayout(new BorderLayout());
        PanelAppPrincipal.add(topPanel,BorderLayout.NORTH);
        PanelAppPrincipal.add(mainPanel,BorderLayout.CENTER);
        PanelAppPrincipal.add(panelMensaje,BorderLayout.SOUTH);

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
        enviar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }
}
