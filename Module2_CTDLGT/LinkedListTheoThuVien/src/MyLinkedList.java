import java.util.LinkedList;

public class MyLinkedList<E> implements Cloneable {
    private Node head;
    private int numNodes = 0;

    private class Node {
        private Node next;
        private Object data;

        public Node(Object data) {
            this.data = data;
        }

        public Object getData() {
            return data;
        }
    }

    public MyLinkedList() {
        head = null;
    }

    public void addFirst(E e) {
        Node newNode = new Node(e);
        if (head == null) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        numNodes++;
    }

    public void addLast(E e) {
        Node newNode = new Node(e);
        Node temp = head;
        if (head == null) {
            head = newNode;
        } else {
            for (int i = 0; i < numNodes - 1; i++) {
                temp = temp.next;
            }

            temp.next = newNode;
        }
        numNodes++;
    }

    public void add(int index, E element) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("");
        }
        if (index == 0) {
            addFirst(element);
        } else {
            Node temp = head;
            for (int i = 0; i < index - 1; i++) {
                temp = temp.next;
            }
            Node newNode = new Node(element);
            newNode.next = temp.next;
            temp.next = newNode;
            numNodes++;
        }
    }

    public void printList() {
        Node temp = head;
        System.out.println("==========Head " + head.data);
        int i = 0;
        while (temp != null) {
            System.out.println("i= " + i + " value " + temp.data);
            temp = temp.next;
            i++;
        }
    }

    public E remove(int index) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = temp.next.next;
        numNodes--;
        return (E) holder.data;
    }

    public boolean removeData(Object object) {
        Node temp = head;
        Node holder = head;
        boolean isRemoved = false;
        for (int i = 0; i < numNodes; i++) {
            if (object.equals(temp.data)) {
                holder.next = temp.next;
                numNodes--;
                isRemoved = true;
            }
            holder = temp;
            temp = temp.next;
        }
        return isRemoved;
    }

    public int size() {
        return numNodes;
    }

    public MyLinkedList<E> clone() {
        try {
            MyLinkedList<E> list = (MyLinkedList<E>) super.clone();
            return list;
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
}
