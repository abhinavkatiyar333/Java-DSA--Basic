public class practice {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void addMid(int data, int index) {
        if (index < 0 || index > size) {
            System.out.println("Invalid index");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        if (index == size) {
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        head = head.next;
        size--;
        if (head == null) {
            tail = null;
        }
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked list is empty");
            return Integer.MIN_VALUE;
        }
        else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        for (int i = 0; i < size - 2; i++) {
            temp = temp.next;
        }
        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    public void print() {
        Node temp = head;
        if (temp == null) {
            System.out.println("Linked list is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " <- ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        practice ll = new practice();
        ll.print();
        ll.addFirst(2);
        ll.print();
        ll.addFirst(1);
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.addMid(9, 2);
        ll.print();
        System.out.println("Size: " + ll.size);
        ll.removeFirst();
        ll.print();
        ll.removeLast();
        System.out.println("Remove last");
        ll.print();
    }
}
