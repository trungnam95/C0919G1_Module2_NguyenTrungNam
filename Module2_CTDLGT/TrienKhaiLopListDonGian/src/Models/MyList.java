package Models;
import java.util.Arrays;
public class MyList<E> {
    private int size = 0;
    private static final int Default_Capacity = 10;
    private Object element[];

    public MyList() {
        element = new Object[Default_Capacity];
    }

    private void ensureCapa() {
        int newSize = element.length * 2;
        element = Arrays.copyOf(element, newSize);
    }

    public void add(E e) {
        if (size == element.length) {
            ensureCapa();
        }
        element[size++] = e;
    }

    public E get(int index) {
        if (index >= size || index < 0) {
            throw new ArrayIndexOutOfBoundsException("Index: " + index + ", Size " + index);
//            IndexOutOfBoundsException("Index: "+i+", Size "+i);
        }
        return (E) element[index];
    }

    public void hienThi() {
        for (int i = 0; i < size; i++) {
            System.out.println(element[i]);
        }
    }
}
