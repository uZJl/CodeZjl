import com.sun.istack.internal.localization.NullLocalizable;

class Node {
    public int val;
    public Node next;
    public Node() {

    }
    public Node(int val) {
        this.val = val;
    }
}
public class MyLinkedList {
    public Node head;//表示当前链表的头 默认是null

    //创建单链表
    public void createLinked() {
        this.head = new Node(12);
        Node node2 = new Node(22);
        Node node3 = new Node(32);
        Node node4 = new Node(42);
        this.head.next = node2;
        node2.next = node3;
        node3.next = node4;
    }

    //打印单链表
    public void display() {
        Node cur = this.head;
        while (cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    //找到倒数第一个节点
    public Node findLastNode() {
        if (this.head == null) {
            System.out.println("head == null");
            return null;
        }
        Node cur = this.head;
        while (cur.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //链表的长度
    public int size() {
        Node cur = this.head;
        int count = 0;
        while (cur != null) {
            count++;
            cur = cur.next;
        }
        return count;
    }

    //找到倒数第二个节点
    public Node findLastTwoNode() {
        if (this.head == null) {
            System.out.println("链表为空！");
            return null;
        }
        if (this.head.next == null) {
            System.out.println("只有一个节点！");
            return null;
        }
        Node cur = this.head;
        while (cur.next.next != null) {
            cur = cur.next;
        }
        return cur;
    }

    //找到第n个节点（n从1开始）
    public Node findN(int n) {
        if (this.head == null) {
            System.out.println("链表为空！");
            return null;
        }
        if (n <= 0) {
            System.out.println("n太小了！");
            return null;
        }
        if (n > size()) {
            System.out.println("n太大了！");
        }
        int count = 1;
        Node cur = this.head;
        while (count != n) {
            count++;
            cur = cur.next;
        }
        return cur;
    }

    //是否包含关键字key节点
    public boolean contains(int key) {
        Node cur = this.head;
        while (cur != null) {
            if (cur.val == key) {
                return true;
            }
            cur = cur.next;
        }
        return false;
    }

    //头插法
    public void addFirst(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            node.next = this.head;
            this.head = node;
        }
    }

    //尾插法
    public void addLast(int data) {
        Node node = new Node(data);
        if (this.head == null) {
            this.head = node;
        } else {
            Node cur = this.head;
            while (cur.next != null) {
                cur = cur.next;
            }
            cur.next = node;
        }
    }

    //找到index-1位置的节点
    public Node moveIndex(int index) {
        Node cur = this.head;
        int count = 0;
        while (count != index - 1) {
            cur = cur.next;
            count++;
        }
        return cur;
    }

    //在任意位置插入data节点
    public void addIndex(int index, int data) {
        if (index < 0 || index > size()) {
            System.out.println("index不合法");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node cur = moveIndex(index);
        Node node = new Node(data);
        node.next = cur.next;
        cur.next = node;
    }

    //找到关键字key的节点前驱
    public Node searchPrev(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.next.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    public Node searchKey(int key) {
        Node cur = this.head;
        while (cur.next != null) {
            if (cur.val == key) {
                return cur;
            }
            cur = cur.next;
        }
        return null;
    }
    //删除第一个出现key的节点
    public void remove(int key) {
        if (this.head == null) {
            return;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
        Node prev = searchPrev(key);
        if (prev == null) {
            System.out.println("此前驱为空");
        } else {
            Node del = prev.next;
            prev.next = del.next;
        }
    }

    //删除所有key节点
    public void removeAllKey(int key) {
        Node prev = this.head;
        Node cur = prev.next;
        while (cur != null) {
            if (cur.val == key) {
                prev.next = cur.next;
            } else {
                prev = cur;
            }
            cur = cur.next;
        }
        if (this.head.val == key) {
            this.head = this.head.next;
        }
    }

    //清空一个单链表
    public void clear() {
        this.head = null;
    }

    //反转一个单链表
    public void reverseList() {
        Node cur = this.head;
        Node prev = null;
        Node newHead = null;
        while (cur != null) {
            Node curNext = cur.next;
            if (curNext == null) {
                newHead = cur;
            }
            cur.next = prev;//后继变前驱
            prev = cur;
            cur = curNext;
        }
        while(newHead != null) {
            System.out.print(newHead.val + " ");
            newHead = newHead.next;
        }
        System.out.println();
    }

    //返回中间链表，如果有两个中间节点，返回第二个
    public Node middleNode() {
        Node fast = this.head;
        Node slow = this.head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;

    }

    //输出该链表倒数第k个节点
    public Node findLastNnode(int k) {
        if (head == null || k == 0) {
            return null;
        }
            Node fast = this.head;
            Node slow = this.head;
            int n = k;
            int count = 0;
            while (fast.next != null) {
                fast = fast.next;
                count++;
                if (count >= n) {
                    slow = slow.next;
                }
            }
            if (n > count + 1) {
                return null;
            }
            return slow;
        }

        public void repeatNode() {
            Node newHead = new Node(-1);
            Node cur = this.head;
            Node tmp = newHead;
            while(cur != null) {
                if(cur.next!= null && cur.val == cur.next.val) {
                    while(cur.next!= null && cur.val == cur.next.val) {
                        cur = cur.next;
                    }
                    cur = cur.next;
                }else {
                    tmp.next = cur;
                    tmp = tmp.next;
                    cur = cur.next;
                }
            }
            tmp.next = null;
        }

        public void cutLinkedList(int x) {
            Node bs = null;
            Node be = null;
            Node as = null;
            Node ae = null;
            Node cur = this.head;
            while (cur != null) {
                if (cur.val < x) {
                    if (bs == null) {
                        bs = cur;
                        be = cur;
                    } else {
                        be.next = cur;
                        be = be.next;
                    }
                } else {
                    if (as == null) {
                        as = cur;
                        ae = cur;
                    } else {
                        ae.next = cur;
                        ae = ae.next;
                    }
                }
                cur = cur.next;
            }
            if (bs == null) {
                while (as != null) {
                    System.out.println(as.val + " ");
                    as = as.next;
                    System.out.println();
                }
            } else {
                be.next = as;
                if (as != null) {
                    ae.next = null;
                }
                while (bs != null) {
                    System.out.print(bs.val + " ");
                    bs = bs.next;
                }
                System.out.println();
            }
        }

    public void mergeTwoLists(MyLinkedList link1, MyLinkedList link2) {
        Node preHead = new Node(-1);
        Node prev = preHead;
        Node l1 = link1.head;
        Node l2 = link2.head;
        while(l1 != null && l2 != null) {
            if(l1.val <= l2.val) {
                prev.next = l1;
                l1 = l1.next;
            }else {
                prev.next = l2;
                l2 = l2.next;
            }
            prev = prev.next;
        }
        prev.next = l1 == null ? l2 : l1;
        Node cur = preHead.next;
        while(cur != null) {
            System.out.print(cur.val + " ");
            cur = cur.next;
        }
        System.out.println();
    }

    public boolean chkPalindrome() {
        // write code here
        //1、找到当前链表的中间位置
        if(head == null) return false;
        Node fast = this.head;
        Node slow = this.head;
        while(fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }

        //2、从中间位置开始，后半部分进行翻转
        Node cur = slow.next;
        Node curNext = null;
        while(cur != null) {
            curNext = cur.next;
            cur.next = slow;
            slow = cur;
            cur = curNext;
        }


        //3、head从头往后走   slow从后往前走
        //只要发现 对应的val值不一样 就返回false  直到head和slow相遇
        while(head != slow) {
            if(head.val != slow.val) return false;
            //偶数情况
            if(head.next == slow) return true;
            head = head.next;
            slow = slow.next;
        }
        return true;

    }

    public boolean findCircle() {
        if(this.head == null || this.head.next == null) return false;
        Node fast = this.head;
        Node slow = this.head;
        while(fast != slow) {
            if(fast == null || fast.next == null) return false;
            fast = fast.next.next;
            slow = slow.next.next;
        }
        return true;
    }

}

