import org.intellij.lang.annotations.JdkConstants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIContainer extends JFrame {
    private JTextField textFieldName;
    private JButton addItemButton;
    private JTextField textFieldCosto;
    private JTextField textFieldPeso;
    private JPanel PanelInputItem;
    private JPanel PanelShowItems;
    private JPanel PanelContainer;
    private JButton FinishedButton;
    Container container = new Container();
    public GUIContainer(){
        setContentPane(PanelContainer);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,720,520);
        setBounds(250,100,820,620);
        setVisible(true);




        PanelShowItems.doLayout();
        PanelShowItems.setLayout(new BoxLayout(PanelShowItems,BoxLayout.Y_AXIS));

        FinishedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //
            }
        });

        addItemButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                container.addItem(textFieldName.getText(),Integer.parseInt(textFieldCosto.getText()),Integer.parseInt(textFieldPeso.getText()));
                showItemsGui();

                //Limpiando campos
                textFieldName.setText("");
                textFieldCosto.setText("");
                textFieldPeso.setText("");
            }
        });
    }

    private void showItemsGui(){

        //Limpiando la anterior lista
        PanelShowItems.removeAll();
        //Mostrando todos lis items actuales
        for (Item item: container.getItems()) {
            //Creando panel item
            JPanel PanelOneItem= new JPanel();
            JLabel labelNameItem = new JLabel();
            JLabel labelCostoItem = new JLabel();
            JLabel labelPesoItem=new JLabel();

            //Poniendo color
            PanelOneItem.setBackground(new Color(51,153,255));

            //Configurando valores para mostrar
            labelNameItem.setText(item.getName());
            labelCostoItem.setText(String.valueOf(item.getCosto()));
            labelPesoItem.setText(String.valueOf(item.getPeso()));

            //Agregando los labels al PanelOneItem
            PanelOneItem.add(labelNameItem);
            PanelOneItem.add(labelCostoItem);
            PanelOneItem.add(labelPesoItem);

            //Agregando el panel Item al PanelShowItems
            PanelShowItems.add(PanelOneItem);
            PanelShowItems.revalidate();
            PanelShowItems.repaint();



        }
    }
}
