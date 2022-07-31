package controller.factorymethod;

public class EnvioAvion implements Envio {
    @Override
    public void enviar() {

        System.out.println("Enviado por Aire");

    }
}

