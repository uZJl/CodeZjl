import java.util.*;


class LURCache{
    static class Node {
        int key;
        int val;
        Node prev;
        Node next;
        public Node(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    HashMap<Integer,Node> map;
    Node head;
    Node tail;
    int k;
    int size;
    public LURCache(int k) {
        this.k = k;
        map = new HashMap<>();
        head = new Node(-1, -1);
        tail = new Node(-1, -1);
        head.next = tail;
        tail.prev = head;
        int size = 0;
    }

    private void removeNode(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

    private void addHead(Node node) {
        node.next = head.next;
        node.prev = head;

        head.next.prev = node;
        head.next = node;
    }

    private void moveHead(Node node) {
        removeNode(node);
        addHead(node);
    }

    private Node removeLast() {
        Node last = tail.prev;
        removeNode(last);
        return last;
    }

    public int get(int key) {
        Node node = map.get(key);
        if (map.get(key) == null) {
            return -1;
        } else {
            moveHead(node);
            return node.val;
        }
    }

    public void set(int key, int val) {
        Node node = map.get(key);
        if (node == null) {
            node = new Node(key,val);
            map.put(key,node);
            addHead(node);
            size++;
            if (size > k) {
                removeNode(removeLast());
                map.remove(removeLast().key);
                size--;
            }
        } else {
            node.val = val;
            addHead(node);
        }
    }
}
public class LUR {
    /**
     * lru design
     * @param operators int整型二维数组 the ops
     * @param k int整型 the k
     * @return int整型一维数组
     */
    public int[] LRU (int[][] operators, int k) {
        // write code here
        LURCache lur = new LURCache(k);
        ArrayList<Integer> list = new ArrayList<>();
        for (int[] op : operators) {
            if (op[0] == 1) {
                lur.set(op[1], op[2]);
            } else {
                list.add(lur.get(op[1]));
            }
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = list.get(i);
        }
        return arr;
    }
}