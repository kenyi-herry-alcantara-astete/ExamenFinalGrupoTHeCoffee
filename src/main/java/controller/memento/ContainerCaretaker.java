package controller.memento;

import java.util.Stack;

public class ContainerCaretaker {
    private final Stack<Container.Snapshot> snapshotStack = new Stack<>();
    public void addSnapshot(Container.Snapshot snapshot){
        snapshotStack.push(snapshot);
    }
    public Container.Snapshot getRecentSnapshot(){
        if(snapshotStack.empty()){
            return null;
        }
        return snapshotStack.pop();
    }
}
