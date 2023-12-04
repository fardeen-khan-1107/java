import java.util.Scanner;

//public class test {

  /*static String name = new String();

    public static void name() {
        System.out.println("Your name is " + name);
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        name = scanner.nextLine();
        name();
    }*/



   /*  public static int multiply(int a,int b)
    {
        int sum=a*b;
        return sum;
    }
    public static void main(String args[])
    {
        Scanner hh=new Scanner(System.in);
        int one=hh.nextInt();
        int two=hh.nextInt();
        int product=multiply(one,two);
        System.out.println("the multiplication is" +product);
    }*/



    /*public static int factorial(int a)
    {
        int fact=1;
        while(a>=1)
        {
            fact=fact*a;
            a--;
        }
        return fact;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int b=in.nextInt();
        int result=factorial(b);
        System.out.println(result);
    }*/


   /* public static int average(int a,int b,int c)
    {
        int avg=(a+b+c)/3;
        return avg;
    }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int c=in.nextInt();
        System.out.println("the result is" +average(a,b,c));
        
   }*/


   /*public static int oddnum(int n)
   {
    int sum=0;
    for(int i=0;i<=n;i++)
    {
        if(i%2!=0)
        {
            sum=sum+i;
        }
    }
    return sum;
   }

   public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    int ans=in.nextInt();
    System.out.println("the result is" +oddnum(ans));
   }*/



  /* public static int gretest(int a,int b)
   {
     if(a>b)
     {
        return a;
     }
     else
     {
        return b;
     }
   }
   public static void main(String args[])
   {
    Scanner in= new Scanner(System.in);
    int high=in.nextInt();
    int high1=in.nextInt();
    System.out.println("the gretest number is" + gretest(high,high1));
   }*/


   /*public static float circle(float radius)
   {
    float circufreance=(2 * 3.14f )*radius;
    return circufreance;
   }
   public static void main(String args[])
   {
    Scanner in=new Scanner(System.in);
    float result=in.nextInt();
    System.out.println("the result is " +circle(result));
   }*/


   /*public static int power(int a,int b)
   {
    int result=1;
    for(int i=0;i<b;i++)
    {
     result=result*a;
    }
    return result;
   }
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int value=in.nextInt();
        int power=in.nextInt();
        System.out.println("the answer is"+ power(value,power));
    }*/

//    

// import java.util.Scanner;

// class Number {
//     int a, b, c;

//     public void sum() {
//         c = a + b;
//         System.out.println("Sum: " + c);
//     }

//     public void sum(int a, int b) {
//         c = a - b;
//         System.out.println("Difference: " + c);
//     }

//     public void sum(int a, int b, int c) {
//         this.c = a * b * c;
//         System.out.println("Product: " + this.c);
//     }

//     public void sum(double a, double b) {
//         double result = a / b;
//         System.out.println("Quotient: " + result);
//     }
// }

// public class test {
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         Number num = new Number();
//         num.a = in.nextInt();
//         num.b = in.nextInt();

//         num.sum(); // Sum
//         num.sum(num.a, num.b); // Difference
//         num.sum(num.a, num.b, num.c); // Product
//         num.sum((double) num.a, (double) num.b); // Quotient
//     }
// }


// import java.util.Scanner;

// class Main {
//     private int num;
//     private int mul = 1;

//     public void getfact(int num) {
//         this.num=num;
//         for (int i = 1; i <= num; i++) {
//             mul = mul * i;
//         }
//     }

//     public void getresult() {
//         System.out.println(mul);
//     }
// }

// public class test {
//     public static void main(String args[]) {
//         Scanner in = new Scanner(System.in);
//         System.out.print("Enter a number: ");
//         int a = in.nextInt();
//         Main kho = new Main();

//         kho.getfact(a);
//         kho.getresult();
//     }
// }



class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class linked {
    Node head;

    linked() {
        this.head = null;
    }

    // Other methods remain the same
    
    public void insert(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            ptr.data = data;
            ptr.next = null;
            head = ptr;
        } else {
            ptr.next = head;
            head = ptr;
        }
    }

    public void lastinsert(int data) {
        Node ptr = new Node(data);
        if (head == null) {
            ptr.next = head;
            head = ptr;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = ptr;
        }
    }
}

public class test{
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        linked list = new linked();

        System.out.println("Enter a value to insert at the beginning:");
        int value = in.nextInt();
        list.insert(value);

        System.out.println("Enter a value to insert at the end:");
        value = in.nextInt();
        list.lastinsert(value);

        System.out.println("Linked List after insertions:");
        // list.display();

        // list.delete();
        // list.lastdelete();
        // list.lastdelete();

        // System.out.println("Linked List after delete operations:");
        // list.display();
    }
}









