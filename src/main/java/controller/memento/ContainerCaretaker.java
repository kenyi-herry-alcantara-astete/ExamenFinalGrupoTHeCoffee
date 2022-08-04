package controller.memento;

import java.util.Stack;

public class ContainerCaretaker {
    private final Stack<Container.Snapshot> snapshotStack = new Stack<>();


    /**
     *  PostCondition:
     *  Agrega una historial a la pila.
     */
    public void addSnapshot(Container.Snapshot snapshot){
        snapshotStack.push(snapshot);
    }

    /**
     *  PostCondition:
     *  Retorna una historial guardada.
     */
    public Container.Snapshot getRecentSnapshot(){
        if(snapshotStack.empty()){
            return null;
        }
        return snapshotStack.pop();
    }
}
