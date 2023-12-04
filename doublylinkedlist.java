import java.util.*;
class Node
{
    String name;
    int data;
    Float marks;
    Node next;
    Node prev;
Node(String name,int data,Float marks)
{
    this.name=name;
    this.data=data;
    this.marks=marks;
    this.next=null;
    this.prev=null;
}
}

class linkedlist
{
    Node head;
    linkedlist()
    {
        this.head=null;
    }
    public void insert(String name,int data,float marks)
    {
        Node ptr=new Node(name,data,marks);
        if(head==null)
        {
            head=ptr;
        }
        else
        {
            ptr.next=head;
            head.prev=ptr;
            head=ptr;
        }
    }
    public void lastinsert(String name,int data,float marks)
    {
        Node ptr=new Node(name,data,marks);
        if(head==null)
        {
            head=ptr;
        } 
        else
        {
            Node temp=head;
            while(temp.next !=null)
            {
                temp=temp.next;
            }
            temp.next=ptr;
            ptr.prev=temp;
        }   
    }
    public void randominsert(String name,int data,float marks,int n)
    {
        Node ptr=new Node(name,data,marks);
         if(head==null)
        {
            head=ptr;
        } 
        else
        {
            Node temp=head;
            for(int i=0;i<n;i++)
            {
                temp=temp.next;
            } 
            temp.next.prev=ptr;
            ptr.next=temp.next;
            ptr.prev=temp;
        }
    }
    public void delete()
    {
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        head=head.next;
        
    }
    public void lastdelete()
    {
        Node ptr=head;
        if(head==null)
        {
            System.out.println("list is empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            while(ptr.next!=null)
            {
                ptr=ptr.next;
            }
            ptr.prev.next=null; 
        }
    }
    public void randomdelete(int n)
    {
        Node temp;
         if(head==null)
        {
            System.out.println("list is empty");
        }
        else if(head.next==null)
        {
            head=null;
        }
        else
        {
            temp=head;
            for(int i=0;i<n && temp!=null;i++)
            {
                temp=temp.next;
            }
            if(temp.next!=null){
            temp.next.prev=temp;
            }
             temp.next.prev=temp.next;

        }
    }
        public void display()
        {
            Node ptr=head;
            while(ptr!=null)
            {
                System.out.println(ptr.name + ptr.data + ptr.marks);
                ptr=ptr.next;
            }
        }
}


public class doublylinkedlist {
    public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    linkedlist list = new linkedlist();

    String val1 = in.nextLine();
    int val2 = in.nextInt();
    Float val3 = in.nextFloat();
    list.insert(val1, val2, val3);

    in.nextLine(); // Consume newline

    String val4 = in.nextLine();
    int val5 = in.nextInt();
    Float val6 = in.nextFloat();
    list.insert(val4, val5, val6);

    in.nextLine(); // Consume newline

    String val7 = in.nextLine();
    int val8 = in.nextInt();
    Float val9 = in.nextFloat();
    int value=in.nextInt();
    list.randominsert(val7, val8, val9,value);

    in.nextLine(); // Consume newline
        
    list.display();

    in.nextLine(); // Consume newline

    int val10 = in.nextInt();
    list.randomdelete(val10);

    in.nextLine(); // Consume newline

    list.display();

    in.nextLine(); // Consume newline

    String val11 = in.nextLine();
    int val12 = in.nextInt();
    Float val13 = in.nextFloat();
    list.lastinsert(val11, val12, val13);

    in.nextLine(); // Consume newline

    list.display();

    in.nextLine(); // Consume newline
        
    list.delete();

    in.nextLine(); // Consume newline

    list.display();

    in.close();
}
}