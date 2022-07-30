import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIApp extends JFrame {
    private JButton enviarPorTierraButton;
    private JButton enviarPorAireButton;
    private JButton enlistarItemsButton;
    private JPanel PanelAppPrincipal;

    private GUIContainer guiContainer;

    public GUIApp(){
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
    }
}
