package generics;

import java.util.Iterator;

public class NodeIterator implements Iterator<Node> {
    private Node currentNode;
    public NodeIterator(Node startNode) {
        this.currentNode = startNode;
    }
    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public Node next() {
        Node current = currentNode;
        currentNode = currentNode.getNext();
        return current;
    }
}
