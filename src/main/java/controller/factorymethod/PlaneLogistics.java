package controller.factorymethod;

public class PlaneLogistics extends LogisticsShipping {
    public Shipping createEnvio(){
        return new PlaneShipping();
    }
}