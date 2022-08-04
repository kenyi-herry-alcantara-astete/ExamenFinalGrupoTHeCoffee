package controller.factorymethod;

//Clases encargada de la Logica del Envio por Aire
public class PlaneShipping implements Shipping {
    @Override
    public String enviar() {

        System.out.println("Enviado por Aire");
        return "Enviado por Aire";
    }
}

