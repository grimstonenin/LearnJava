package codewars;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

class TreeNode {
    public TreeNode left;
    public TreeNode right;
    public ListNode value;

    TreeNode(ListNode value, TreeNode left, TreeNode right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    TreeNode(ListNode value) {
        this(value, null, null);
    }
}

class ListNode {
    public int data;
    public ListNode next;

    ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }

    ListNode(int data) {
        this(data, null);
    }
}

public class FunWithListsFlatten {

    static ListNode flatten(TreeNode root) {

        if(root==null) return null;

        Set<Integer> resultSet = new TreeSet<>();

        traverseTree(root,resultSet);

        ArrayList<ListNode> arrayList = new ArrayList<>();

        for(int i : resultSet){
            arrayList.add(new ListNode(i));

        }

        for(int i = 0; i<arrayList.size()-1; i++){
            arrayList.get(i).next = arrayList.get(i+1);
        }



        return arrayList.get(0);
    }


    //TODO
    private static ListNode traverseTree(TreeNode root, Set resultSet){

        while(root.value!=null){
            resultSet.add(root.value.data);
            root.value = root.value.next;
        }

       if(root.left!=null) traverseTree(root.left,resultSet);
       if(root.right!=null) traverseTree(root.right,resultSet);

        return null;
    }

    public static void main(String[] args){

        ListNode l1 = new ListNode(17, new ListNode(1));
        ListNode l2 = new ListNode(3);
        ListNode l3 = new ListNode(1);
        ListNode l4 = new ListNode(2);
        ListNode l5 = new ListNode(16);
        ListNode l6 = new ListNode(7, new ListNode(3));
        TreeNode root = new TreeNode(l1, new TreeNode(l2, new TreeNode(l4), null), new TreeNode(l3, new TreeNode(l5), new TreeNode(l6)));


        flatten(root);

    }
}
