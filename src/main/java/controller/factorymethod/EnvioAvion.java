package controller.factorymethod;

//Clases encargada de la Logica del Envio por Aire
public class EnvioAvion implements Envio {
    @Override
    public String enviar() {

        System.out.println("¡Enviado por Aire!");
        return "¡Enviado por Aire!";
    }
}

