package unit10_dsa_list.practice;

public class Node {

    private Node next;
    private Object data;

    public Node(Object data) {
        this.data = data;
    }

    public Object getData() {
        return this.data;
    }
}
