package controller.factorymethod;

//Clases encargada de la Logica del Envio por Barco
public class EnvioBarco implements Envio{

    @Override
    public String enviar() {

        System.out.println("Enviado por Barco");
        return "Enviado por Barco";
    }
}
