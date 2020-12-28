public class Test {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(0,9);
        myArrayList.add(1,19);
        myArrayList.add(2,29);
        myArrayList.display();
        myArrayList.add2(8888);
        myArrayList.add2(11111);
        myArrayList.add2(444444);
        myArrayList.display();
        System.out.println(myArrayList.search(29));
        System.out.println(myArrayList.getPos(5));
        myArrayList.setPos(0,999999);
        myArrayList.display();
        System.out.println(myArrayList.size());
        myArrayList.remove(19);
        myArrayList.display();
        myArrayList.clear();
    }
}
