public class LogisticaAvion extends LogisticaEnvio{
    public Envio createEnvio(){
        return new EnvioAvion();
    }
}
