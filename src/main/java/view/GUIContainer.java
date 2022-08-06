package view;

import javax.swing.*;
import java.awt.*;

import controller.memento.Container;
import controller.memento.ContainerCaretaker;
import model.Item;

public class GUIContainer extends JFrame {
    private JTextField textFieldName;
    private JButton addItemButton;
    private JTextField textFieldCosto;
    private JTextField textFieldPeso;
    private JPanel PanelInputItem;
    private JPanel PanelShowItems;
    private JPanel PanelContainer;
    private JButton FinishedButton;
    private JButton deshacerButton;
    private Container container = new Container();
    ContainerCaretaker containerCaretaker = new ContainerCaretaker();
    public GUIContainer(){
        setContentPane(PanelContainer);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(250,100,720,520);
        setBounds(250,100,820,620);
        setVisible(true);




        PanelShowItems.doLayout();
        PanelShowItems.setLayout(new BoxLayout(PanelShowItems,BoxLayout.Y_AXIS));

        FinishedButton.addActionListener(e -> setVisible(false));

        addItemButton.addActionListener(e -> {
            //Antes de agregar se toma un snapshot y guardamos en la containerCaretaker
            containerCaretaker.addSnapshot(container.createSnapshot());

            //Agrego un item
            container.addItem(textFieldName.getText(),Integer.parseInt(textFieldCosto.getText()),Integer.parseInt(textFieldPeso.getText()));
            showItemsGui();

            //Limpiando campos
            textFieldName.setText("");
            textFieldCosto.setText("");
            textFieldPeso.setText("");
        });
        deshacerButton.addActionListener(e -> {
            //Si presionamos deshacer, volvemos a un snapshot anterior.
            container.restore(containerCaretaker.getRecentSnapshot());
            showItemsGui();
        });
    }

    private void showItemsGui(){

        //Limpiando la anterior lista
        PanelShowItems.removeAll();
        //Mostrando todos lis items actuales
        int idRelative = 0;
        for (Item item: container.getItems()) {
            int finalIdRelative = idRelative;
            //Creando panel item
            JPanel PanelOneItem= new JPanel();
            JLabel labelName = new JLabel();
            JLabel labelCosto = new JLabel();
            JLabel labelPeso = new JLabel();
            JLabel countLabel = new JLabel();

            countLabel.setText(finalIdRelative + 1 +". ");

            labelName.setText("Name:");
            labelCosto.setText("Costo:");
            labelPeso.setText("Peso:");

            JLabel labelNameItem = new JLabel();
            JLabel labelCostoItem = new JLabel();
            JLabel labelPesoItem=new JLabel();
            JButton buttonDeleteItem = new JButton();
            buttonDeleteItem.setText("Delete");
            buttonDeleteItem.addActionListener(e -> {

                //Elimino un item
                removeItemToContainer(finalIdRelative);
            });
            idRelative++;
            //Poniendo color
            PanelOneItem.setBackground(new Color(51,153,255));

            //Configurando valores para mostrar
            labelNameItem.setText(item.getName());
            labelCostoItem.setText(String.valueOf(item.getCosto()));
            labelPesoItem.setText(String.valueOf(item.getPeso()));

            //Agregando los labels al PanelOneItem
            PanelOneItem.add(countLabel);
            PanelOneItem.add(labelName);
            PanelOneItem.add(labelNameItem);
            PanelOneItem.add(labelCosto);
            PanelOneItem.add(labelCostoItem);
            PanelOneItem.add(labelPeso);
            PanelOneItem.add(labelPesoItem);
            PanelOneItem.add(buttonDeleteItem);

            //Agregando el panel model.memento.Item al PanelShowItems
            PanelShowItems.add(PanelOneItem);
            PanelShowItems.revalidate();
            PanelShowItems.repaint();

        }
    }

    private void removeItemToContainer( int idRelative){
        //Cada que eliminas un item se toma un snapshot y guardamos en la containerCaretaker
        containerCaretaker.addSnapshot(container.createSnapshot());

        //Elimino el item
        container.removeItem(idRelative);
        showItemsGui();
    }

    public Container getContainer() {
        return container;
    }
}
