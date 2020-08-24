package unit11_dsa_queue_stack.practice;

public class MyQueue {
    private int capacity;
    private int queueArr[];
    private int head = 0;
    private int tail = -1;
    private int currentSize;

    public MyQueue(int queueSize) {
        this.capacity = queueSize;
        queueArr = new int[this.capacity];
    }

    public boolean isQueueFull() {
        boolean status = false;
        if (currentSize == capacity) {
            status = true;
        }
        return status;
    }

    public boolean isQueueEmtry() {
        boolean status = false;
        if (currentSize == 0) {
            status = true;
        }
        return status;
    }

    public void enqueue(int item) {
        if (isQueueFull()) {
            System.out.println("Overflow ! Unable to add element " + item);
        } else {
            tail++;
            if (tail == capacity - 1) {
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element" + item + "is pushed to Queue");
        }
    }

    public void dequeue() {
        if (isQueueEmtry()) {
            System.out.println("Underflow! Unable to remove elemetn from Queue ");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Pop operation done ! removed" + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Pop operation done ! removed" + queueArr[head - 1]);
            }
            currentSize--;
        }
    }
}