package controller.factorymethod;

public class EnvioBarco implements Envio{

    @Override
    public String enviar() {

        System.out.println("Enviado por Barco");
        return "Enviado por Barco";
    }
}
