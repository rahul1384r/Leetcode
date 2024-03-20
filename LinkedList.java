public class LinkedList {

    class Node{
        int data;
        Node next;
    }

    int size;
    Node head;
    Node tail;


    // function to add the element in the linked list at the first position of the linked list
    public void addFirst(int val){
        // object Node is created
        Node nn=new Node();
        nn.data=val;

        if(size==0){
            head=nn;
            tail=nn;
            nn.next=null;
        }
        else{
            nn.next=head;
            head=nn;
        }
        size++;
    }

    public void display(){
        System.out.print("head"+"--->");
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        System.out.println("null");
    }

    public void merge(LinkedList l1,LinkedList l2){
        int i=0;
        int j=0;
        int idx=0;
    }
    public static void main(String[] args) {
        LinkedList l1=new LinkedList();
        LinkedList l2=new LinkedList();
        LinkedList ans=new LinkedList();
        l1.addFirst(4);
        l1.addFirst(2);
        l1.addFirst(1);
        l2.addFirst(4);
        l2.addFirst(3);
        l2.addFirst(1);
        l1.display();
        l2.display();

    }
}
