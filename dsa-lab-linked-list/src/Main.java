public class Main {
    public static void main(String[] args) {
        SinglyLinkedList LL = new SinglyLinkedList();
        LL.insertLast(5);
        LL.insertLast(10);
        LL.insertLast(15);
        LL.insertLast(20);
        LL.insertLast(25);
        LL.insertLast(30);
        LL.insertLast(35);
//        LL.traverse();
//        System.out.println(LL.search(35));
//        System.out.println(LL.update(5,100));
//        LL.traverse();
//        System.out.println(LL.insertAfter(20,new Node(100)));
//        LL.traverse();
        LL.printReverse(LL.head);


    }
}