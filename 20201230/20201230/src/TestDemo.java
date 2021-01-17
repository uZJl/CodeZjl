public class TestDemo {

    public static void main(String[] args) {
        DoubleLinkedList doubleLinkedList = new DoubleLinkedList();
        doubleLinkedList.addLast(6);
        doubleLinkedList.addLast(2);
        doubleLinkedList.addLast(7);
        doubleLinkedList.addLast(5);
        doubleLinkedList.addLast(18);
        doubleLinkedList.addLast(1);
        doubleLinkedList.display();
        System.out.println(doubleLinkedList.size());
        doubleLinkedList.remove(1);
        doubleLinkedList.display();
        doubleLinkedList.remove(18);
        doubleLinkedList.display();
        DoubleLinkedList doubleLinkedList1 = new DoubleLinkedList();
        doubleLinkedList1.addLast(6);
        doubleLinkedList1.addLast(1);
        doubleLinkedList1.addLast(7);
        doubleLinkedList1.addLast(5);
        doubleLinkedList.addLast(1);
        doubleLinkedList1.display();
        doubleLinkedList1.removeAllKey(1);
        doubleLinkedList1.display();
        doubleLinkedList1.addIndex(0,1);
        doubleLinkedList1.display();
        doubleLinkedList1.clear();
        System.out.println("=================");
    }
    public static void main8(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(6);
        myLinkedList.addLast(1);
        myLinkedList.addLast(6);
        myLinkedList.addLast(3);
        myLinkedList.addLast(2);
        if(myLinkedList.chkPalindrome()) {
            System.out.println("是回文结构");
        }else{
            System.out.println("不是回文结构");
        }
    }
    public static void main7(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(6);
        MyLinkedList myLinkedList1 = new MyLinkedList();
        myLinkedList1.addLast(1);
        myLinkedList1.addLast(2);
        myLinkedList1.addLast(5);
        myLinkedList.display();
        myLinkedList1.display();
        myLinkedList.mergeTwoLists(myLinkedList,myLinkedList1);
    }
    public static void main6(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(6);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(5);
        myLinkedList.display();
        System.out.println(myLinkedList.middleNode().val);
    }
    public static void main5(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(6);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(5);
        myLinkedList.display();
        myLinkedList.reverseList();
    }
    public static void main4(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addLast(2);
        myLinkedList.addLast(1);
        myLinkedList.addLast(3);
        myLinkedList.addLast(6);
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(5);
        myLinkedList.display();
        myLinkedList.cutLinkedList(4);
    }
    public static void main3(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.addFirst(19);
        myLinkedList.addFirst(29);
        myLinkedList.addFirst(39);
        myLinkedList.display();//39 29 19
        myLinkedList.addLast(1);
        myLinkedList.addLast(2);
        myLinkedList.addLast(3);
        myLinkedList.addLast(4);
        myLinkedList.display();//39 29 19 1 2 3 4
        myLinkedList.addIndex(0,110);
        myLinkedList.display();//110 39 29 19 1 2 3 4
        myLinkedList.addIndex(2,120);
        myLinkedList.display();//110 39 120 29 19 1 2 3 4
        myLinkedList.addIndex(9,119);
        myLinkedList.display();//110 39 120 29 19 1 2 3 4 119
        myLinkedList.addIndex(9,119);
        myLinkedList.display();
        myLinkedList.remove(1);
        myLinkedList.display();
        myLinkedList.removeAllKey(119);
        myLinkedList.display();
        myLinkedList.clear();
        myLinkedList.display();
    }

    public static void main2(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //这个函数结束之后，我们拿到了当前链表的头节点
        myLinkedList.createLinked();
        myLinkedList.display();
        System.out.println("==================");
        int n = 4;
        Node ret = myLinkedList.findN(n);
        System.out.println("第"+n+"个节点是："+ret.val);
        System.out.println("==================");
        System.out.println(myLinkedList.size());
        System.out.println("==================");
        System.out.println(myLinkedList.contains(421));
    }
    public static void main1(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        //这个函数结束之后，我们拿到了当前链表的头节点
        myLinkedList.createLinked();
        myLinkedList.display();
        System.out.println("==================");
        try {
            //放的是可能出现异常代码
            Node ret = myLinkedList.findLastTwoNode();
            System.out.println(ret.val);
        }catch (NullPointerException e) {

        }
        System.out.println("==================");
        /*ret = myLinkedList.findLastTwoNode();
        System.out.println(ret.val);*/
        System.out.println("虽然发生了异常，但是我还是想打印这句话");

    }
}
