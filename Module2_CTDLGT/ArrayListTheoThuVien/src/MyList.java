import java.util.ArrayList;
import java.util.Arrays;

public class MyList<E> {
    private int size = 0;
    private static final int Amount = 10;
    private Object element[];

    public MyList() {
        element = new Object[Amount];
    }

    public MyList(int capacity) {
        if (capacity < 0) {
            throw new IllegalArgumentException("loi");
        }
        element = new Object[capacity];
    }

    public void ensureCapa(int minCapacity) {
        element = Arrays.copyOf(element, element.length + minCapacity);
    }

    public void addIndex(int index, E val) {
        //IndexOutOfBoundsException - if the index is out of range (index < 0 || index > size())
        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("outOfBoundsMsg(index)");
        //Shifts the element currently at that position (if any) and any subsequent elements to the right
        // (adds one to their indices)
        ensureCapa(size + 1);
        System.arraycopy(element, index, element, index + 1, size - index);
        element[index] = val;
        size++;
    }

    public boolean add(E e) {
        ensureCapa(size + 1);
        element[size++] = e;
        return true;
    }

    public void hienThi() {
        for (int i = 0; i < element.length; i++) {
            System.out.println("i= " + i + "value= " + element[i]);
        }
    }

    public E remove(int index) {

        if (index > size || index < 0)
            throw new IndexOutOfBoundsException("outOfBoundsMsg(index)");
        E objRemoved = (E) element[index];

        System.arraycopy(element, index + 1, element, index,
                size - index - 1);
        element[size - 1] = null;
        size--;
        return objRemoved;
    }

    public void size() {
        System.out.println("size is:" + size);
    }

    public MyList<E> clone() {
        MyList<E> newMyList = new MyList<>();
        newMyList.element = element;
        newMyList.size = size;
        return newMyList;
    }

    public int indexOf(E o) {
//        if ( o== null) {//kiem tra doi tuong truyen vao co bang null
//            for (int i = 0; i < size; i++)
//                if (element[i] == null){
//                    System.out.println("not");
//                }
//
//        } else {
//        for (int i = 0; i < size; i++)
//            if (o.equals(element[i])) {
//                System.out.println(element[i]);
//            }
        for (int i = 0; i < element.length - 1; i++) {
            if (element[i] == o || element[i].equals(o)) {
                return i;//trả về giá trị index nếu đối tượng được truyền vào bằng với giá trị ở vị trí đó.
            }
        }
        return -1;
    }

    public void clear() {


        // clear to let GC do its work
        for (int i = 0; i < size; i++)
            element[i] = null;

        size = 0;
    }

    //}
    public boolean contains(E o) {
        return indexOf(o) >= 0;
    }
    public E get(int i){
        if(i<0||i>=size){
            throw new ArrayIndexOutOfBoundsException("loi");
        }
        return (E) element[i];//lấy đối tượng ở mảng element vị trí thứ i
    }
}
//}


