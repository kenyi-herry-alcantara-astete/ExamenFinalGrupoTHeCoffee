package controller.factorymethod;
import controller.memento.Container;

//clase que hace las veces de factory


public abstract class LogisticsShipping {


    public Shipping getEnvio(Container container){
        //Envio Barco mayor a 1000 , avion menor a 1000
        if(container.getPesoTotal()>1000){
            ShipLogistics logisticaBarco = new ShipLogistics();
            return logisticaBarco.createEnvio();
        }
        else{
            PlaneLogistics logisticaAvion = new PlaneLogistics();
            return logisticaAvion.createEnvio();
        }
    }


    public abstract Shipping createEnvio();
}

