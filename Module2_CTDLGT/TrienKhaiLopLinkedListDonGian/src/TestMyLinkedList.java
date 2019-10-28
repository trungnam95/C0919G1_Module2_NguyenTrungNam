public class TestMyLinkedList {
    public static void main(String[] args) {
        System.out.println("/=/=/=/= TESTING /=/=/=/=");
        MyLinkedList ll=new MyLinkedList(10);//khoi tao bien dau tien cho danh sach
        ll.addFirst(11);
        ll.addFirst(12);
        ll.addFirst(13);
        ll.add(1,3);
        ll.add(4,9);
        ll.add(4,9);
        System.out.println(ll.get(1));
        ll.printList();

    }
}
