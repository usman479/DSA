public class Main {
    public static void main(String[] args) {
//        SinglyLinkedList LL = new SinglyLinkedList();
//        LL.insertLast(5);
//        LL.insertLast(10);
//        LL.insertLast(15);
//        LL.insertLast(20);
//        LL.insertLast(25);
//        LL.insertLast(30);
//        LL.insertLast(35);
//        LL.traverse();
//        System.out.println(LL.search(35));
//        System.out.println(LL.update(5,100));
//        LL.traverse();
//        System.out.println(LL.insertAfter(20,new Node(100)));
//        LL.traverse();
//        LL.printReverse(LL.head);

        DoublyLinkedList dll1 = new DoublyLinkedList();
        DoublyLinkedList dll2 = new DoublyLinkedList();
        dll1.insertLast(12);
        dll1.insertLast(1);
        dll1.insertLast(5);
        dll1.insertLast(7);
        dll1.insertLast(56);

        dll2.insertLast(100);
        dll2.insertLast(200);
        dll2.insertLast(300);
        dll2.insertLast(400);
        dll2.insertLast(500);

//        dll1.insertList(dll2);

//        dll1.traverseStart();

//        System.out.println(dll1.twoWaySearch(7));
            dll1.traverseStart();
            System.out.println();
//            dll1.insertAt(420,2);
//            dll1.traverseStart();
        dll1.delete(56);
        dll1.traverseStart();
    }
}