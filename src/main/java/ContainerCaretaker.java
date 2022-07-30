import java.util.Stack;

public class ContainerCaretaker {
    private  Stack<Container.Snapshot> snapshotStack = new Stack<>();
    public void addSnapshot(Container.Snapshot snapshot){
        System.out.println("Agregado costo total:"+snapshot.getCostoTotal());
        snapshotStack.push(snapshot);
    }
    public Container.Snapshot getRecentSnapshot(){
        Container.Snapshot aux= snapshotStack.pop();

        System.out.println("Obteniendo costo total:"+aux.getCostoTotal());
        return aux;
    }
}
