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


public class FunWithListsLength {

    static int length(Node head) {

        int count = 1;

        if(head == null) return -1;

        while(head.next!=null){
            count++;
            head = head.next;
        }

        return count;
    }

    static int indexOf(Node head, Object value) {

        if(head == null) return -1;

        boolean found = false;

        int count = 0;

        while(head.next!=null){

            if(head.data.equals(value)) return count;

            else{
                count++;
                head = head.next;
            }
        }

        if(!found) return -1;
        return count;
    }

    public static void main(String[] args){

        Node<Integer> head = new Node<Integer>(1,new Node(2,new Node(3,new Node(4))));

        System.out.println(length(head));

        System.out.println(indexOf(head,2));

        

    }
}
