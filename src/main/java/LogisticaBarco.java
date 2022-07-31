public class LogisticaBarco extends LogisticaEnvio {
    @Override
    public Envio createEnvio(){
        return new EnvioBarco();
    }
}
