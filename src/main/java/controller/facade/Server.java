package controller.facade;

import controller.memento.Container;

public class Server {
    /**
     * postcondición:
     * Si container es diferente de null y el número de items almacenados en container es mayor a 0:
     * Guarda datos de container en base de datos
     */
    public void saveContainer(Container container)  {
        if(container != null && container.getItems().size() > 0){
            // Datos de container en formato json
            Json containerJson = Converter.coverterJson(container);

            // Guardamos los datos del contenedor
            Fetch fetch = new Fetch();
            fetch.post("containers.txt", containerJson);
        }
    }
}
