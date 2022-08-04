package controller.facade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.memento.Container;

public class Converter {
    /**
     * poscondición:
     * retorna una instancia de la clase JSON con los datos de container convertidos a formato json
     */
    public static JSON coverterJson(Container container) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // creamos una instancia de la clase Gson
            String containerjson = gson.toJson(container); // convertimos los datos del container de texto plano a json
            System.out.println(containerjson);
            return new JSON(containerjson); // retornamos una instancia de la clase JSON con los datos del container
    }

    public static XML coverterXML(Container container) {
        // código que covierte datos de container a xml
        return null;
    }
}
