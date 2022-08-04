package controller.factorymethod;


public class ShipLogistics extends LogisticsShipping {
    @Override
    public Shipping createEnvio(){
        return new ShipShipping();
    }
}

