import javax.swing.*;

public class GUIContainer extends JFrame {
    private JTextField textField1;
    private JButton addButton;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel PanelInputItem;
    private JPanel PanelShowItem;
    private JPanel PanelContainer;
    private JButton FinishedButton;

    Container container = new Container();


    public GUIContainer(){
        setContentPane(PanelContainer);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,720,520);
        setBounds(250,100,820,620);
        setVisible(true);
    }
}
