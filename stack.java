import java.util.*;
// class list
// {
//     public ArrayList<Integer> list=new ArrayList<>();
//     public int size=0;

// public void push(int data)
// {
//     list.add(data);
//     size++;
// }
// public int pop()
// {
//   list.remove(size-1);
//   size--;
//   return size;
// }
// public  int peek()
// {
//     return list.get(size-1);
// }
// public boolean empty()
// {
//     return size==0;
// }
// }

// class number{

// public static void addtop(int data,Stack<Integer> stack)
// {
//     if(stack.isEmpty())
//     {
//         stack.push(data);
//         return;
//     }
//     else{
//     int top=stack.pop();
//     addtop(data,stack);
//     stack.push(top);
//     }
// }
// public static void reverse(Stack<Integer>stack){
//     if(stack.isEmpty())
//     {
//         return;
//     }
//     else{
//     int top=stack.pop();
//     reverse(stack);
//     addtop(top,stack);
// }
// }
// }

//  public class stack
// {
//     public static void main(String args[])
//     {
//         Stack<Integer> non=new Stack<>();
//         non.push(3210);
//         non.push(908);
//         non.push(120);
//         // number.addtop(4,non);
//         number.reverse(non);
//         // System.out.println(stack.peek());
//         while(!non.isEmpty())
//         {
//             System.out.println(non.peek());
//             non.pop();
//         }
//     }
// }

class node
{
    int data;
    node next;
node(int data)
{
    this.data=data;
    this.next=null;
}
}
class linkedlist{
    node head;
    linkedlist()
    {
        this.head=null;
    }
    public  int push(int data)
    {
        node ptr=new node(data);
        if(head==null)
        {
            head=ptr;
            return 0;
        }
        else
        {
            ptr.next=head;
            head=ptr;
            return 0;
        }
    }
    public  int pop()
    {
        if(head==null)
        {
            System.out.println("stack is empty");
            return -1;
        }
        else
        {
            int ptr=head.data;
            head=head.next;
            return ptr;
        }
    }
    public int peek()
    {
        if(head==null)
        {
            return -1;
        }
        else
        {
            return head.data;
        }
    }
    public boolean isEmpty()
    {
        return head==null;
    }
}
public class stack
{
    public static void main(String args[])
    {
        linkedlist list=new linkedlist();
        list.push(1);
        list.push(2);
        list.push(3);
        while(!list.isEmpty())
        {
            System.out.println(list.peek());
            list.pop();   
        }
    }
}