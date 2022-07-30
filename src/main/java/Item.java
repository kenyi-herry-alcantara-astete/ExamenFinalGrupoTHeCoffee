public class Item {
    private String name;
    private int costo;
    private int peso;

    public Item(String name,int costo,int peso) {
        this.name = name;
        this.peso = peso;
        this.costo = costo;
    }

    public int getCosto() {
        return costo;
    }

    public String getName() {
        return name;
    }

    public int getPeso() {
        return peso;
    }
}
