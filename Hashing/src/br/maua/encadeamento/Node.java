package br.maua.encadeamento;

public class Node {
    private int id;
    private Node next;

    public Node(int id) {
        this.id = id;
        this.next = null;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) { this.next = next; }

    @Override
    public String toString() {
        return "Node {" +
                "id = " + id +
                ", next = " + next +
                '}';
    }
}
