import javax.lang.model.util.SimpleAnnotationValueVisitor6;

import java.util.Scanner;
public class check {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        Linked_1 list = new Linked_1();
        int n= sc.nextInt();
        for(int i=0;i<n;i++){
            list.add(sc.nextInt());
        }
        list.remove();
//        list.add(1);
//        list.add(2);
//        list.add(3);
//        list.print();
//        list.seek();
//        list.seek(1);
//        list.print();
//        list.reverse();

    }

}

class Linked_1 {
    private Node head = null;
    private Node lastnode = null;

    public void print() {
        if (head == null) {
            System.out.println("Empty linked List");
        } else {
            Node ptr = head;
            while (ptr != null) {
                System.out.print(ptr.val);
                ptr = ptr.next;
                if(ptr != null){
                    System.out.print(" -> ");
                }
            }
            System.out.println();
        }
    }

    public void add(int x) {
        Node node = new Node(x);
        if (head == null) {
            head = node;
            lastnode = node;
        } else {
//            System.out.println("last element"+Lastnode.val);
            lastnode.next = node;

            lastnode = lastnode.next;
//            System.out.println("last element"+node.val);
        }
    }

    public void remove() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node node = head;
            while (node.next.next != null) {
                node = node.next;
            }
            System.out.println("value of last element deleted is :" + node.next.val);
            node.next = null;
        }
    }
    public void seek() {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            System.out.println("last element is :" + lastnode.val);
        }
    }
    public void seek(int n) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node node = head;
            for(int i=0;i<n;i++){
                node=node.next;
            }
            System.out.println(n+ " index element value is :" + node.val);
        }
    }
    public void remove(int n) {
        if (head == null) {
            System.out.println("list is empty");
        } else {
            Node node = head;
            int value = 0;
            if (n == 0) {
                value = node.val;
                head = head.next;
                System.out.println(n + " index value was :" + value);
            } else {
                for (int i = 0; i < n - 1; i++) {
                    node = node.next;
                }
                value = node.next.val;
                node.next = node.next.next;
                System.out.println(n + " index value was :" + value);
            }
        }
    }
//    public void reverse(){
//        Node newhead = reversenode(head.next,head);
//        print();
//    }
    public Node reversenode(Node current_node,Node prev_node){
        if(current_node==null){
            return prev_node;
        }
        current_node.next=prev_node;
        return reversenode(current_node.next,prev_node.next);
    }
    private class Node {
        private Node next;
        private int val;

        public Node(int x) {
            this.val = x;
            this.next = null;
        }
    }
}