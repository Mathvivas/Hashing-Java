package br.maua.encadeamento;

public class SList {
    private Node head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    public void addFirst(Node node){
        if(node == null)
            return;

        node.setNext(head);
        head = node;
        size ++;
    }

    public void addLast(Node node) {
        if (size == 0)
            addFirst(node);
        else {
            Node no;

            for (no = head; no.getNext() != null; no = no.getNext());       // Percorre a lista até chegar no último

            node.setNext(null);
            no.setNext(node);
            size++;
        }
    }

    @Override
    public String toString() {
        return "SList {" +
                "head = " + head +
                '}';
    }
}


