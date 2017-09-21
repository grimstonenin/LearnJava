package codewars;


class Node<T> {
    public Object data;
    public Node next;

    Node(T data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(T data) {
        this(data, null);
    }
}


public class FunWithListsLastIndex {

    static int lastIndexOf(Node head, Object value) {

        if(head == null) return -1;

       int lastIndex = 0;
       int index = 0;

       boolean found = false;

       while(head != null){
           if(head.data.equals(value)){
               found = true;
               lastIndex= index;
               index++;
               head = head.next;
           } else {
               index++;
               head = head.next;
           }

       }

       if(found) return lastIndex;
       else return -1;
    }

    public static void main(String[] args){
        Node<Integer> head = new Node<Integer>(1,new Node(2,new Node(3, new Node(3))));

        System.out.println(lastIndexOf(head,3));
    }

}
