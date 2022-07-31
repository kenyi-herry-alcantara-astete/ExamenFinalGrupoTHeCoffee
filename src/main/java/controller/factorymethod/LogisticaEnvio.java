package controller.factorymethod;
import controller.memento.Container;

public abstract class LogisticaEnvio {


    public Envio getEnvio(Container container){
        //Envio Barco mayor a 1000 , avion menor a 1000
        if(container.getPesoTotal()>1000){
            LogisticaBarco logisticaBarco = new LogisticaBarco();
            return logisticaBarco.createEnvio();
        }
        else{
            LogisticaAvion logisticaAvion = new LogisticaAvion();
            return logisticaAvion.createEnvio();
        }
    }

    public abstract Envio createEnvio();
}

