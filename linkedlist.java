import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class linked{
    Node head;
    private int size;

    linked(){
        this.head=null;
        this.size=0;
    }
public void insert(int data )
{
    Node ptr=new Node(data);
    size++;
    if(head==null)
    {
        ptr.data=data;
        ptr.next=null;
        head=ptr;
    }
    else{
        ptr.next=head;
        head=ptr;
    }
}
public  void lastinsert(int data)
{
    size++;
    Node ptr=new Node(data);
    if(head==null)
    {
        ptr.next=head;
        head=ptr;
    }
    else{
        Node temp=head;
        while(temp.next!=null)
        {
            temp=temp.next;
        }
        temp.next=ptr;

    }
}
public void randominsert(int data,int n)
{
    size++;
    Node ptr=new Node(data);
    Node temp=head;
    for(int i=0;i<n;i++)
    {
        temp=temp.next;
    }
    ptr.next=temp.next;
    temp.next=ptr;
}
public void delete()
{
    size--;
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else if(head.next== null)
    {
        head=null;
    }
        head=head.next;
}
public void lastdelete()
{
    if(head==null)
    {
        System.out.println("list is empty");
    }
    size--;
    if (head.next== null)
    {
        head=null;
    }
        Node temp1=null;
        Node temp=head;
        while(temp.next!=null)
        {
            temp1=temp;
            temp=temp.next;
        }
        temp1.next=null;
}
public void randomdelete(int n)
{
    if(head==null)
    {
        System.out.println("list is empty");
    }
    else
    {
        Node temp=head;
        for(int i=0;i<n;i++)
        {
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }
}
public  void display()
{
    Node temp=head;
    while(temp!=null)
    {
        System.out.println(temp.data);
        temp=temp.next;
    }
}

public int size()
{
    return size;
}
}


public class linkedlist {
    public static void main(String args[]){
        linked list=new linked();
      Scanner in=new Scanner(System.in);
      int value=in.nextInt();
        list.insert(value);
        
        int value1=in.nextInt();
        list.insert(value1);
        
        int value2=in.nextInt();
        list.insert(value2);
        
        int value3=in.nextInt();
         int value31=in.nextInt();
        list.randominsert(value3,value31);
        
        int value4=in.nextInt();
        list.lastinsert(value4);
        
        System.out.println();
       
        list.display();
       
        System.out.println(list.size());
        System.out.println();
       
        list.delete();
        list.display();

        int value34=in.nextInt();
        list.randomdelete(value34);
       
        list.lastdelete();
       
        list.lastdelete();
       
        System.out.println();
       
        list.display();
    }
}





// linkedlist without any methods

// public class linkedlist {
//     public static void main(String args[]){
//         LinkedList<Integer> list=new LinkedList<Integer>();
//         list.addFirst(20);
//         list.addFirst(30);
//          list.addFirst(40);
//           list.addFirst(50);
//           list.addLast(90);
//           for(int i=0;i<list.size();i++)
//           {
//             System.out.println(list.get(i));
//           }
//           list.remove();
//           System.out.println();
//           for(int i=0;i<list.size();i++)
//           {
//             System.out.println(list.get(i));
//           }
//           list.removeLast();
//           System.out.println();
//           for(int i=0;i<list.size();i++)
//           {
//             System.out.println(list.get(i));
//           }
//         }
// }    
       