class ListNode {
    private int val;
    private ListNode next;
    private ListNode prev;
    //alt+insert   ->   Constructor
    public ListNode(int val) {
        this.val = val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public int getVal() {
        return val;
    }

    public ListNode getNext() {
        return next;
    }

    public ListNode getPrev() {
        return prev;
    }
}

public class DoubleLinkedList {

    public ListNode dummyHead;//头
    public ListNode last;//尾巴

    public DoubleLinkedList () {
        this.dummyHead = new ListNode(-1);
    }
    //头插法
    public void addFirst(int data) {
        ListNode node = new ListNode(data);
        if(this.dummyHead.getNext() == null) {
            this.dummyHead.setNext(node);
            this.last = node;
        }else {
            node.setNext(this.dummyHead.getNext());
            this.dummyHead.getNext().setPrev(node);
            this.dummyHead.setNext(node);
        }
    }

    public void display() {
        ListNode cur = this.dummyHead.getNext();
        while (cur != null) {
            System.out.print(cur.getVal()+ " ");
            cur = cur.getNext();
        }
        System.out.println();
    }
    //尾插法
    public void addLast(int data) {
        ListNode node = new ListNode(data);
        if(this.dummyHead.getNext() == null) {
            this.dummyHead.setNext(node);
            this.last = node;
        }else {
            this.last.setNext(node);
            node.setPrev(this.last);
            this.last = node;
        }
    }
    //任意位置插入,第一个数据节点为0号下标
    public void addIndex(int index,int data) {
        if(index < 0 || index > size()) {
            return;
        }
        if(index == 0) {
            addFirst(data);
            return;
        }
        if(index == size()) {
            addLast(data);
            return;
        }
        ListNode cur = this.dummyHead.getNext();
        while (index != 0) {
            cur = cur.getNext();
            index--;
        }
        ListNode node = new ListNode(data);
        node.setNext(cur);
        node.setPrev(cur.getPrev());
        node.getPrev().setNext(node);
        cur.setPrev(node);
    }
    //查找是否包含关键字key是否在单链表当中
    public boolean contains(int key) {
        ListNode cur = this.dummyHead.getNext();
        while (cur != null) {
            if(cur.getVal() == key) {
                return true;
            }
            cur = cur.getNext();
        }
        return false;
    }
    //得到单链表的长度
    public int size() {
        ListNode cur = this.dummyHead.getNext();
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.getNext();
        }
        return count;
    }

    public ListNode findNode(int key) {
        ListNode cur = this.dummyHead.getNext();
        while (cur != null) {
            if(cur.getVal() == key) {
                return cur;
            }
            cur = cur.getNext();
        }
        return null;
    }

    //删除第一次出现关键字为key的节点
    public void remove(int key) {
        ListNode cur = this.findNode(key);
        if(cur == null) {
            return;
        }
        if(cur == this.dummyHead.getNext()) {
            this.dummyHead.setNext(dummyHead.getNext().getNext());
            this.dummyHead.getNext().setPrev(null);
            return;
        }
        if(cur == this.last) {
            cur.getPrev().setNext(null);
            this.last = this.last.getPrev();
            return;
        }
        cur.getPrev().setNext(cur.getNext());
        cur.getNext().setPrev(cur.getPrev());
    }

   /* public void remove2(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    //头结点
                    this.head = this.head.next;
                    this.head.prev = null;
                }else {
                    cur.prev.next = cur.next;
                    if(cur.next != null) {
                        cur.next.prev = cur.prev;
                    }else {
                        //cur.next == null
                        this.last = this.last.prev;
                    }
                }
                return;
            }
            cur = cur.next;
        }
    }

    public void remove3(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur == this.last) {
                    cur.prev.next = null;
                    this.last = this.last.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                return;
            }
            cur = cur.next;
        }
    }*/
    //删除所有值为key的节点
    public void removeAllKey(int key) {
        ListNode cur = this.dummyHead.getNext();
        while (cur != null) {
            if(cur.getVal() == key) {
                if(cur == this.dummyHead.getNext()) {
                    //头结点
                    this.dummyHead.getNext().setNext(this.dummyHead.getNext().getNext());
                    this.dummyHead.getNext().setNext(null);
                }else {
                    //cur.prev.next = cur.next;
                    cur.getPrev().setNext(cur.getNext());
                    if(cur.getNext() != null) {
                        //cur.next.prev = cur.prev;
                        cur.getNext().setPrev(cur.getPrev());
                    }else {
                        //cur.next == null
                        //this.last = this.last.prev;
                        last.setPrev(last.getPrev());
                    }
                }
            }
            cur = cur.getNext();

        }
    }

    /*public void removeAllKey2(int key) {
        ListNode cur = this.head;
        while (cur != null) {
            if(cur.val == key) {
                if(cur == this.head) {
                    this.head = this.head.next;
                    this.head.prev = null;
                }else if(cur == this.last) {
                    cur.prev.next = null;
                    this.last = this.last.prev;
                }else {
                    cur.prev.next = cur.next;
                    cur.next.prev = cur.prev;
                }
                //return;
            }
            cur = cur.next;
        }
    }
*/
    public void clear() {
        this.dummyHead.getNext().setNext(null);
        this.last = null;
    }

    /*public void clear2() {
        ListNode cur = this.head;
        while (cur != null) {
            ListNode curNext = cur.next;
            cur.next = null;
            cur.prev = null;
            cur = curNext;
        }
        this.last = null;
        this.head = null;
    }*/

}
