import static org.junit.jupiter.api.Assertions.*;

import controller.memento.Container;
import controller.memento.ContainerCaretaker;
import org.junit.jupiter.api.Test;
class ContainerTest {
    @Test
    void restore() {
        //Creamos un container
        Container container = new Container();
        //Creamos la cuidadora del historial
        ContainerCaretaker containerCaretaker = new ContainerCaretaker();

        //Agrego item 1
        container.addItem("carro",2500,4600);
        //Agrego item 2
        container.addItem("lavadora",250,200);
        //Agrego item 3
        container.addItem("Dron",1000,20);

        //Creamos una snapshot
        containerCaretaker.addSnapshot(container.createSnapshot());

        //¿Qué pasaría si eliminamos el item 2 de index = 1?
        container.removeItem(1); // ¡Ho no! eliminamos el item equivocado

        //Restauremos la historial
        container.restore(containerCaretaker.getRecentSnapshot());

        //Verificando que el item2 aún está en la lista
        assertEquals("lavadora",container.getItems().get(1).getName());
    }
}