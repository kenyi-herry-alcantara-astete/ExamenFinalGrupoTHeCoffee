package controller.memento;

import java.util.Stack;

public class ContainerCaretaker {
    private final Stack<Memento> snapshotStack = new Stack<>();
    public void addSnapshot(Memento snapshot){
        snapshotStack.push(snapshot);
    }
    public Container.Snapshot getRecentSnapshot(){
        if(snapshotStack.empty()) {
            return null;
        }
        return (Container.Snapshot) snapshotStack.pop();
    }
}
