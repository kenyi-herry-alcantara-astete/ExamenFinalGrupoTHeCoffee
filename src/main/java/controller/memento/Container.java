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

    public void removeItem (int indexRelative){
        this.costoTotal=this.costoTotal- this.items.get(indexRelative).getCosto();
        this.pesoTotal = this.pesoTotal-this.items.get(indexRelative).getPeso();
        items.remove(indexRelative);
    }

    public void setPesoTotal(int pesoTotal){
        this.pesoTotal = pesoTotal;
    }
    public int getPesoTotal() {
        return pesoTotal;
    }
    //Clase interna
     static class Snapshot implements Memento{
        private final ArrayList<Item> items;
        private final int costoTotal;
        private final int pesoTotal;
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
    /**
     *  PostCondition:
     *  Crea una historial.
     */
    //Crea una copia
    public Snapshot createSnapshot( ){
        showINTHeConsole();
        System.out.println("\nSnapshot creado:");
        showINTHeConsole();
        return new Snapshot(this.items,this.costoTotal,this.pesoTotal);
    }


    /**
     *  PostCondition:
     *  Restaura una historial anterior.
     */
    public void restore(Snapshot snapshot){
        //Verificando si existe un historial guardado
        if (snapshot != null){
            this.items=snapshot.items;
            this.costoTotal=snapshot.costoTotal;
            this.pesoTotal = snapshot.pesoTotal;
            System.out.println("\nRestaurando:");
            showINTHeConsole();
        }else{
            System.out.println("No hay historial de donde recuperar!");
        }
    }
    public void showINTHeConsole(){
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


