package generics;

import java.util.Iterator;

public class Node implements Iterable<Node> {
    private int data;
    private Node next;

    public Node(int data, Node next){
        this.data = data;
        this.next = next;
    }

    // Getter methods for data and next

    public int getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    // Iterator implementation
    @Override
    public Iterator<Node> iterator() {
        return new NodeIterator(this);
    }

    // Iterator class

}
