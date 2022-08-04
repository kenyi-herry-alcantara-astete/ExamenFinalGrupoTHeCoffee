package controller.memento;

import model.Item;

import java.util.ArrayList;

public class Container {

    private ArrayList<Item> items = new ArrayList<>();
    private int costoTotal = 0;
    private int pesoTotal = 0;

    public ArrayList<Item> getItems() {
        return items;
    }

    public void addItem(String name,int costo,int peso){
        items.add(new Item(name,costo,peso));
        this.costoTotal=this.costoTotal+costo;
        this.pesoTotal = this.pesoTotal+peso;
    }

    private void setItems(ArrayList items){
        this.items = items;
    }
    private void setCostoTotal(int costoTotal){
        this.costoTotal = costoTotal;
    }
    private void setPesoTotal(int pesoTotal){
        this.pesoTotal = pesoTotal;
    }
    public void removeItem (int indexRelative){
        this.costoTotal=this.costoTotal- this.items.get(indexRelative).getCosto();
        this.pesoTotal = this.pesoTotal-this.items.get(indexRelative).getPeso();
        items.remove(indexRelative);
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public int getCostoTotal() {
        return costoTotal;
    }

    //Clase interna
    class Snapshot implements Memento{
        private ArrayList<Item> items;
        private int costoTotal;
        private int pesoTotal;
        Snapshot(ArrayList<Item> items, int costoTotal, int pesoTotal){
            this.costoTotal=costoTotal;
            this.items = new ArrayList<>(items);
            this.pesoTotal=pesoTotal;
        }

        public int getCostoTotal() {
            return costoTotal;
        }
        public int getPesoTotal() {
            return pesoTotal;
        }
    }

    //Crea una copia
    public Snapshot createSnapshot( ){
        showINTHeConsole();
        System.out.println("Snapshot creado:");
        showINTHeConsole();
        return new Snapshot(this.items,this.costoTotal,this.pesoTotal);
    }

    //Restaura de una copia
    public void restore(Snapshot snapshot){
        //Verificando si existe un historial guardado
        if (snapshot != null){
            this.setItems(snapshot.items);
            this.setCostoTotal(snapshot.costoTotal);
            this.setPesoTotal(snapshot.pesoTotal);
            System.out.println("Restaurando:");
            showINTHeConsole();
        }else{
            System.out.println("No hay historial de donde recuperar!");
        }
    }
    public void showINTHeConsole(){
        System.out.println("-----------------------------------------------");
        int index = 0;
        for (Item item:
             this.items) {
            System.out.println((index+1)+")");
            System.out.println("Name:"+item.getName());
            System.out.println("Peso:"+item.getPeso());
            System.out.println("Costo:"+item.getCosto());
        index++;
        }
    }
}


