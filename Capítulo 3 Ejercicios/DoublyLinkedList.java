public class Node<E> {

    private E element;
    private Node<E> previous;
    private Node<E> next;

    public Node<E> getPrevious() {
        return previous;
    }

    public Node<E> getNext() {
        return next;
    }

    public E getElement() {
        return element;
    }

    public Node(E element, Node<E> previous, Node<E> next) {
        this.element = element;
        this.previous = previous;
        this.next = next;
    }

    @Override
    @SuppressWarnings("unchecked")
    public boolean equals(Object that) {
        if (!(that instanceof Node)) {
            return false;
        }
        Node<E> other = (Node<E>) that;
        if (element == null) {
            return other.element == null ? true : false;
        }
        return element.equals(other.element);
    }

    @Override
    public String toString() {
        return element.toString();
    }
}


DoublyLinkedList<Integer> dll1 = new DoublyLinkedList<Integer>();
dll1.addFirst(100);
dll1.addFirst(200);

DoublyLinkedList<Integer> dll2 = new DoublyLinkedList<Integer>();
dll2.addFirst(100);
dll2.addFirst(200);

DoublyLinkedList<Integer> dll3 = new DoublyLinkedList<Integer>();
dll3.addFirst(42);

DoublyLinkedList<String> blankList1 = new DoublyLinkedList<String>();
DoublyLinkedList<String> blankList2 = new DoublyLinkedList<String>();

if (blankList1.equals(blankList2)) {
    System.out.println(blankList1 + " = " + blankList2);
}

if (!dll1.equals(dll3)) {
    System.out.println(dll1 + " != " + dll3);
}

if (dll1.equals(dll2)) {
    System.out.println(dll1 + " = " + dll2);
}

