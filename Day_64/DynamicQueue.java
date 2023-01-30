package Day_64;

public class DynamicQueue extends CircularQueue{
    public DynamicQueue() {
        super();
    }

    public DynamicQueue(int size) {
        super(size);
    }

    @Override
    public boolean insert(int item) {

        // this takes care of it being full
        if (this.isFull()) {
            int[] data;
            // double the array size
            int[] temp = new int[data.length * 2];

            int front;
            // copy all previous items in new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[(front + i) % data.length];
            }
            front = 0;
            int end = data.length;
            data = temp;
        }

        // at this point we know that array is not full
        // insert item
        return super.insert(item);
    }

    private boolean isFull() {
        return false;
    }
}
