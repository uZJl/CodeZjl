import java.util.Arrays；

public class MyArrayList {
    /*public int[] elem = new int[10];
    public int usedSize = 0;
    */
    private int[] elem;//null
    private int usedSize;

    public MyArrayList() {
        this.elem=new int[10];
    }

    public MyArrayList(int capacity) {
        this.elem=new int[capacity];
    }

    // 打印顺序表
    public void display() {
        for (int i=0; i<this.usedSize; i++) {
            System.out.print(this.elem[i]+" ");
        }
        System.out.println();
    }
    // 在 pos 位置新增元素
    // 1.full
    // 2.pos是否合法
    // 3.插入数据时，插入位置前一定要有数据
    public boolean isFull(){
        if(this.usedSize==this.elem.length){
            return true;
        }
            return false;
    }
    public void reSize(){
        this.elem= Arrays.copyOf(this.elem,2*this.elem.length);
    }
    public void add(int pos, int data) {
        if(isFull()){
            reSize();
        }
        if(pos<0||pos>this.usedSize){
            System.out.println("pos位置不合法！");
        }
        for(int i=this.usedSize-1;i>=pos;i--){
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //默认插入到数组的最后
    public void add2(int data) {
        //顺序表是否满
        if(isFull()) {
            reSize();
        }
        this.elem[this.usedSize]=data;
        this.usedSize++;
    }
    // 判定是否包含某个元素
    public boolean contains(int toFind) {
        for(int i=0;i<this.elem.length;i++){
            if(toFind==this.elem[i]){
                return true;
            }
        }
        return false;
    }
    // 查找某个元素对应的位置
    public int search(int toFind) {
        for(int i=0;i<this.elem.length;i++){
            if(toFind==this.elem[i]){
                return i;
            }
        }
        return -1;
    }
    // 获取 pos 位置的元素
    public int getPos(int pos) {
        if(pos<0||pos>=this.usedSize){
            return -1;
        }
        return this.elem[pos];
    }
    // 给 pos 位置的元素设为 value
    public void setPos(int pos, int value) {
        if(pos<0||pos>=this.usedSize){
            return;
        }
        this.elem[pos]=value;
    }

    // 获取顺序表长度
    public int size() {
        return this.usedSize;
    }
    //删除第一次出现的关键字key
    public void remove(int key) {
        //1.是否有key  index
        //2.i=index   i<useSize-1
        //3.this.useSize--
        int index=search(key);
        if(index == -1) {
            System.out.println("没有啊！老铁");
            return;
        }
        for(int i=index;i<this.usedSize-1;i++){
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    // 清空顺序表
    public void clear() {
        this.usedSize=0;
    }


}
