package controller.facade;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import controller.memento.Container;

public class Converter {
    /**
     * poscondición:
     * Si container diferente de null y el número de items en el container mayor a cero entonces
     * datos de container convertidos a formato json
     * Caso contrario retorna null
     */
    public static Json coverterJson(Container container){
        if (container != null && container.getItems().size() > 0) {
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            String containerjson = gson.toJson(container);
            System.out.println(containerjson);
            return new Json(containerjson);
        }
        return null;
    }
}
