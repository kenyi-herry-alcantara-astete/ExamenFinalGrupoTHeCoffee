package view;

import controller.facade.Server;
import controller.factorymethod.Envio;
import controller.factorymethod.LogisticaAvion;

import javax.swing.*;
import java.awt.*;

public class GUIApp extends JFrame {
    private JButton enviar;
    private JButton enlistarItemsButton;
    private JPanel PanelAppPrincipal;
    private JLabel mensajeDeTipoDeEnvio;
    private JPanel panelMensaje;
    private JPanel topPanel;
    private JPanel mainPanel;

    private GUIContainer guiContainer;

    //Tipo de envío con el patron factory.method
    private final LogisticaAvion logisticaAvion = new LogisticaAvion();
    // Servidor para guardar datos del container
    private final Server server = new Server();

    private static GUIApp guiApp;

    public static void main(String[] args) {

        //Inicio de app
        guiApp= new GUIApp();

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
        enlistarItemsButton.addActionListener(e -> guiContainer = new GUIContainer());
        enviar.addActionListener(e -> enviarContainer());
    }
    private void enviarContainer() {
        //Obtenemos el tipo de envío dependiendo el container enlistado en el patron memento
        Envio envio = logisticaAvion.getEnvio(guiApp.guiContainer.getContainer());

        // Guardamos datos del container en base de datos
        server.saveContainer(guiApp.guiContainer.getContainer());

        //Mostrando mensaje de envío
        guiApp.mensajeDeTipoDeEnvio.setText(envio.enviar());
    }
}
