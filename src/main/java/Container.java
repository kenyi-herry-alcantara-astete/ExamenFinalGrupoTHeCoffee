
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;



public class Container {

    private int id;
    private ArrayList<Item> items = new ArrayList<>();
    private int costoTotal;
    private int pesoTotal;

    public ArrayList<Item> getItems() {
        return items;
    }

    public int getPesoTotal() {
        return pesoTotal;
    }

    public int getCostoTotal() {
        return costoTotal;
    }


    private Snapshot createSnapshot( ){
        return new Snapshot(this.id,this.items,this.costoTotal,this.pesoTotal);
    }

    class Snapshot{
        private int id;
        private ArrayList<Item> items = new ArrayList<>();
        private int costoTotal;
        private int pesoTotal;
        Snapshot(int id, ArrayList<Item> items,int costoTotal,int pesoTotal){
            this.id = id;
            this.costoTotal=costoTotal;
            this.items = items;
            this.pesoTotal=pesoTotal;
        }
    }

    public void restore(Memento history){

    }
}


