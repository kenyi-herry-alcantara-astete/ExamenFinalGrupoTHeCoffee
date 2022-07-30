public class LogisticaTierra extends LogisticaEnvio {
    @Override
    public Envio createButton(){
        return new EnvioTierraButton();
    }
}
