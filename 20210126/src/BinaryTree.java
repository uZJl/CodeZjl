import java.util.*;

/**
 * Created by JiaLe on 2021/1/26 14:05
 */
class BTNode {
    char val;
    BTNode right;
    BTNode left;

    public BTNode(char val) {
        this.val = val;
    }
}
public class BinaryTree {

    /**
     * 我们要首先创建二叉树，但是为了好理解，我们先以穷举的方式
     * 创建二叉树
     * 后期我们会以遍历的方式 创建二叉树
     * 当前只是权宜之计
     * @return
     */
    public BTNode createTree() {
        BTNode A = new BTNode('A');
        BTNode B = new BTNode('B');
        BTNode C = new BTNode('C');
        BTNode D = new BTNode('D');
        BTNode E = new BTNode('E');
        BTNode F = new BTNode('F');
        BTNode G = new BTNode('G');
        BTNode H = new BTNode('H');
        A.left = B;
        A.right = C;
        B.left = D;
        B.right = E;
        E.right = H;
        C.left = F;
        C.right = G;
        return A;
    }
    // 前序遍历
    void preOrderTraversal(BTNode root) {
        if(root == null) return;
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }
    // 中序遍历
    void inOrderTraversal(BTNode root) {
        if(root == null) return;
        inOrderTraversal(root.left);
        System.out.print(root.val);
        inOrderTraversal(root.right);
    }
    // 后序遍历
    void postOrderTraversal(BTNode root) {
        if(root == null) return;
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    // 遍历思路-求结点个数
    static int size = 0;
    void getSize1(BTNode root) {
        if(root == null) return;
        size++;
        getSize1(root.right);
        getSize1(root.left);
    }
    // 子问题思路-求结点个数
    int getSize2(BTNode root){
        if(root == null) return 0;
        return getSize2(root.right) + getSize2(root.left) + 1;
    }
    // 遍历思路-求叶子结点个数
    static int leafSize = 0;
    void getLeafSize1(BTNode root){
        if(root == null) return;
        if(root.right == null && root.left ==null) {
            leafSize++;
        }
        getLeafSize1(root.right);
        getLeafSize1(root.left);
    }
    // 子问题思路-求叶子结点个数
    int getLeafSize2(BTNode root){
        if(root == null) return 0;
        if(root.right == null && root.left ==null) {
            return 1;
        }
        return getLeafSize2(root.right) + getLeafSize2(root.left);
    }
    // 子问题思路-求第 k 层结点个数 BTNode root为二叉树的根节点
    int getKLevelSize(BTNode root,int k) {
        if(root == null) return 0;
        if(k == 1) return 1;
        return getKLevelSize(root.right,k-1) + getKLevelSize(root.left,k-1);
    }
    // 获取二叉树的高度
    int getHeight(BTNode root) {
        if(root == null) return 0;
        return getHeight(root.right) > getHeight(root.left) ? getHeight(root.right)+1 : getHeight(root.left)+1;
    }


    BTNode find(BTNode root, char val) {
        if(root == null) return null;
        if(root.val == val) return root;
        BTNode ret = find(root.left,val);
        if(ret != null) return ret;
        ret = find(root.right,val);
        if(ret != null) return ret;
        return null;
    }

    //层序遍历
    void levelOrderTraversal(BTNode root) {
        if(root == null) return;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BTNode cur = queue.poll();
            System.out.println(cur.val);
            if(cur.left != null) queue.offer(cur.left);
            if(cur.right != null) queue.offer(cur.right);
        }
    }

    boolean isCompleteTree(BTNode root) {
        if(root == null) return true;
        Queue<BTNode> queue = new LinkedList<>();
        queue.offer(root);
        while(!queue.isEmpty()) {
            BTNode cur = queue.poll();
            if(cur != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
            } else {
                break;
            }
        }
        while(!queue.isEmpty()) {
            BTNode cur = queue.peek();
           if(cur != null) {
               return false;
           } else {
               queue.poll();
           }
        }
        return true;
    }

    //非递归先序遍历
    void preOrderTraversal1(BTNode root) {
        if (root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while (cur != null) {
            while (cur != null) {
                stack.push(cur);
                System.out.print(cur.val + " ");
                cur = cur.left;
            }
            BTNode top = stack.peek();
            cur = top.right;
        }
        System.out.println();
    }

    void inOrderTraversal1(BTNode root) {
        if (root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.pop();
            System.out.print(top.val + " ");
            cur = top.right;
        }
        System.out.println();
    }

    void postOrderTraversal1(BTNode root) {
        if(root == null) return;
        Stack<BTNode> stack = new Stack<>();
        BTNode cur = root;
        BTNode prev = null;
        while (cur != null || !stack.isEmpty()) {
            while (cur != null) {
                stack.push(cur);
                cur = cur.left;
            }
            BTNode top = stack.peek();
            if(top.right == null || top.right == prev) {
                stack.pop();
                System.out.print(top.val+" ");
                prev = top;
            }else {
                cur = top.right;
            }
        }
        System.out.println();
    }

}






















