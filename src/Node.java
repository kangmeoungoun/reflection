/**
 * Created by jojoldu@gmail.com on 2020-12-13
 * Blog : http://jojoldu.tistory.com
 * Github : http://github.com/jojoldu
 */
public class Node {
    int data;
    Node next = null;
    Node(int data){
        this.data=data;
    }
    void append(int d){
        Node end  = new Node(d);
        Node n = this;
        while (n.next!=null){
            n=n.next;
        }
        n.next=end;
    }
    void delete(int d){
        Node n = this;
        while (n.next!=null){
            if(n.next.data == d){
                n.next = n.next.next;
            }else{
                n=n.next;
            }
        }
    }
    void retrieve(){
        Node n = this;
        while(n.next!=null){
            System.out.print(n.data+"->");
            n=n.next;
        }
        System.out.println(n.data);
    }
}
class SinglyLinkedList{
    public static void main(String[] args) {
        Node head = new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(2);
        head.retrieve();
    }
}
