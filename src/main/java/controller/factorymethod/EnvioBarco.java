package controller.factorymethod;

public class EnvioBarco implements Envio{

    @Override
    public void enviar() {

        System.out.println("Enviado por Barco");

    }
}
