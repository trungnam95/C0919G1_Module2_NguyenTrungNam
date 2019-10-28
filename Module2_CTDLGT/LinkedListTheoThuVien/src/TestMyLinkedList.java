public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll=new MyLinkedList();//khoi tao bien dau tien cho danh sach
//        ll.addFirst(1);
//        ll.addFirst(2);
        ll.add(0,4);
        ll.add(1,5);
        ll.add(2,6);
        ll.add(3,10);
//        ll.add(0,5);
        ll.remove(2);
//        System.out.println(ll.size());
        ll.printList();
        ll.add(4,11);
        ll.clone();
        ll.printList();
    }
}
