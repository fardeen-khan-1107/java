import java.util.*;

// class  addition
// {
//     int a,b,c;

//     void sum()
//     {
//         c=a+b;
//         System.out.println(this.c);
//     }
// }


// public class classes {
//     public static void main(String args[])
//     {
//         Scanner in=new Scanner(System.in);
//         addition sum=new addition();
//         sum.a=in.nextInt();
//         sum.b=in.nextInt();
//         sum.sum();
//     }
// }



//constructure
// class information
// {
//     String name;
//     int id;
//     float marks;
// void printing()
// {
//     System.out.println("the details of the student are as follows");
//     System.out.println(this.name);
//     System.out.println(this.id);
//     System.out.println(this.marks);
// }
// }

// public class classes{
//     public static void main(String args[])
//     {
//         information info=new information();
//         Scanner in=new Scanner(System.in);

//         info.name=in.nextLine();
//         info.id=in.nextInt();
//         info.marks=in.nextFloat();

//         info.printing();
//     }
// }



//parameter constructure

class parameter
{
    int m1,m2,m3;
    int avg;
    parameter(int m1,int m2,int m3)
    {
        this.m1=m1;
        this.m2=m2;
        this.m3=m3;
        }
        void result()
        {
        this.avg=(m1+m2+m3)/3;
        System.out.println(this.avg);
    }
}
public class classes
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int marks=in.nextInt();
        int marks1=in.nextInt();
        int marks2=in.nextInt();
        parameter num=new parameter(marks,marks1,marks2);
        num.result();
     }
 }

