public class List {
    
    private int[] numbers;
    private int size;

    public List() {
        numbers = new int[10];
        size = 0;
    }

    public void add(int item) {
        if (size == numbers.length) {
            int num = numbers.length * 2;
            int[] newNumbers = new int[num];
            System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
            numbers = newNumbers;
        }
        numbers[size++] = item;
    }

    public int size() {
        return size;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return;
        }
        for (int i = index; i < size - 1; i++) {
            numbers[i] = numbers[i + 1];
        }
        size--;
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        return numbers[index];
    }

    public String toString() {
        if (size == 0) {
            return "[]";
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(numbers[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    public boolean contains(int item) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == item) {
                return true;
            }
        }
        return false;
    }

    public int indexOf(int item) {
        for (int i = 0; i < size; i++) {
            if (numbers[i] == item) {
                return i;
            }
        }
        return -1;
    }
}

