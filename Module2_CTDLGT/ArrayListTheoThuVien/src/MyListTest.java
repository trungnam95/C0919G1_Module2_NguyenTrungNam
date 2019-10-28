public class MyListTest {
    public static void main(String[] args) {
        MyList<Object> list = new MyList<Object>();
        System.out.println("============");
        list.addIndex(0,"OO");
        list.addIndex(1,3);
        list.addIndex(2,5);
        list.addIndex(3,8);
        list.addIndex(4,14);
        list.addIndex(5,15);
        list.add(20);
        System.out.println("get is:"+list.get(5));
        System.out.println("index of "+list.indexOf(3));

//        list.remove(1);
//        list.hienThi();
//        System.out.println(list.indexOf(null));
//        System.out.println(list.contains(2));


//        System.out.println("list1 ===============");
//        MyList<Object> list1=list.clone();
//        list1.hienThi();
//        System.out.println("list2 ==============");
//        MyList<Object> list2=list.clone();
//        list2.hienThi();
    }
}
