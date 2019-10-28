import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<Object> arrayList=new ArrayList<>();
        arrayList.add(2);
        arrayList.add(34);
        arrayList.add(5.5);
        arrayList.addAll(2, Collections.singleton("ok"));
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.get(0));

    }
}
