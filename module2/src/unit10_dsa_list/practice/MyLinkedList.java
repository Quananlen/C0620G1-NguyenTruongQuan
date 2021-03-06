package unit10_dsa_list.practice;
import org.w3c.dom.Node;
public class MyLinkedList {
    private Node head;
    private int numNodes = 0;
    public MyLinkedList(Object data) {
        head = new Node(data);
    }
    private class Node {
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data = data;
        }
        public Object getData() {
            return this.data;
        }
    }
    //thêm đối tượng vào vị trí index
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;
        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
    }
    //thêm đối tượng vào vị trí đầu tiên của danh sách
    public void addFisrt(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }

    //lấy phần tử thử index trong danh sách
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }

    //hiển thị các phần tử trong danh sách
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
