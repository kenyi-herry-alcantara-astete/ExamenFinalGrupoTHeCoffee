package controller.factorymethod;

public class EnvioAvion implements Envio {
    @Override
    public String enviar() {

        System.out.println("Enviado por Aire");
        return "Enviado por Aire";
    }
}

