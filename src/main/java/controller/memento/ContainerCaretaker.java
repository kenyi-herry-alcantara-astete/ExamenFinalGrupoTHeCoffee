package controller.memento;

import java.util.Stack;

public class ContainerCaretaker {
    private  Stack<Container.Snapshot> snapshotStack = new Stack<>();
    public void addSnapshot(Container.Snapshot snapshot){
        snapshotStack.push(snapshot);
    }
    public Container.Snapshot getRecentSnapshot(){
        Container.Snapshot aux= snapshotStack.pop();
        return aux;
    }
}
