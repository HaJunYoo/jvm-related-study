package linkedList;

public abstract class MyNode {
    protected MyNode next;
    public MyNode getNext() {
        return next;
    }

    abstract public String getKey();
    abstract public void printNode();
}
