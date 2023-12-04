import java.util.*;
// public class basic1 {
//     String name;
//     int id;
//     float marks;
//     basic1(String name,int id,float marks)
//     {
//         this.name=name;
//         this.id=id;
//         this.marks=marks;
//     }
//     void display()
//     {
//         System.out.println(this.name + this.id + this.marks);
//     }
//     public static void main(String[] args) {
//         basic1 b1=new basic1("fardeen",20021,98);
//         b1.display();
//     }
// }



// public class basic1 {

//     public static void main(String[] args) {
//         int sum=0;
//         int odd=0;
//         for(int i=0;i<20;i++)
//         {
//             if(i%2==0)
//             {
//                  sum=sum+i;
//             }
//             else{
//                 odd=odd+i;
//             }
//         }
//         System.out.println(sum);
//         System.out.println(odd);
//     }
// }


// import java.util.*;
// public class basic1 {

//     public static void main(String[] args) {
//         int a;
//         int b;
//         int res;
//         Scanner in=new Scanner (System.in);
//         res=in.nextInt();
//             switch(res) {
//             case 1:
//                 a=in.nextInt();
//                 b=in.nextInt();
//                 int sum=a+b;
//                 System.out.println(sum);
//                 break;
//             case 2:
//                 a=in.nextInt();
//                 b=in.nextInt();
//                 int sub=a-b;
//                 System.out.println(sub);
//                 break;
//             case 3:
//                 a=in.nextInt();
//                 b=in.nextInt();
//                 int mul=a*b;
//                 System.out.println(mul);
//                 break;
//             case 4:
//                 a=in.nextInt();
//                 b=in.nextInt();
//                 int div=a/b;
//                 System.out.println(div);
//                 break;

//             default:
//             System.out.println("invalid");
//                 break;
//         }
//     }
// }





// import java.util.Scanner;
// public class basic1 {
//     int roll;
//     float marks;
//     String branch;
//     // Scanner in;
//     Scanner in=new Scanner(System.in);
//     basic1(int roll,float marks,String branch)
//     {
//         this.roll=roll;
//         this.marks=marks;
//         this.branch=branch;
//          Scanner in=new Scanner(System.in);
//     }
//     basic1(basic1 Basic1)
//     {
//         roll=Basic1.roll;
//         marks=Basic1.marks;
//         branch=Basic1.branch;
//         Scanner in=new Scanner(System.in);
//     }
//     void read()
//     {
//         roll=in.nextInt();
//         marks=in.nextFloat();
//         in.nextLine();
//         branch=in.nextLine();
//     }
//     void display()
//     {
//         System.out.println(roll);
//         System.out.println(marks);
//         System.out.println(branch);
//     }
//     public static void main(String[] args) {
//         basic1 in=new basic1(0,0," ");
//         in.read();
//         in.display();
//     }
// }


// import java.util.Scanner;
// public class basic1 {

//     public static void main(String[] args) {
//         if(args.length >=3){
//        int roll=Integer.parseInt(args[0]);
//        int  marks=Integer.parseInt(args[1]);
//        String name=(args[2]);

//        System.out.println(roll);
//        System.out.println(marks);
//        System.out.println(name);
//     }
//     }
// }

// import java.util.Scanner;
// public class basic1
// { 
// public static void main(String[] args) 
// { 
// int rollno=Integer.parseInt(args[0]); 
// int sem= Integer.parseInt(args[1]); 
// String name= args[2]; 
// String branch= args[3]; 
// System.out.println("RollNum:"+rollno);
// System.out.println("\nBranch:"+branch);
// System.out.println("\nSem:"+sem);
// System.out.println("\nName:"+name); 
// }
// }


// public class basic1 {

//     public static void main(String[] args) {
//         int id;
//         String fruites[]={"apple","orange","mango"};
//         for(int i=0;i<3;i++)
//         {
//             System.out.println(fruites[i]);
//         }
//     }
    
// }




// public class basic1 {

//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int m,n,i,j;
//         m=in.nextInt();
//          n=in.nextInt();
//         int first[][]=new int[m][n];
//         int second[][]=new int[m][n];
//         int third[][]=new int[m][n];
//         int total[][]=new int[m][n];

//         System.out.println("enter the first month data");
//         for(i=0;i<m;i++){
//             for(j=0;j<n;j++)
//             {
//                 first[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("enter the second month data");
//         for(i=0;i<m;i++){
//             for(j=0;j<n;j++)
//             {
//                 second[i][j]=in.nextInt();
//             }
//         }
//         System.out.println("enter the third month data");
//         for(i=0;i<m;i++){
//             for(j=0;j<n;j++)
//             {
//                 third[i][j]=in.nextInt();
//             }
//         }
//         for(i=0;i<m;i++){
//             for(j=0;j<n;j++)
//             {
//                 total[i][j]=first[i][j]+second[i][j]+third[i][j];
//             }
//         }
//         for(i=0;i<m;i++){
//             for(j=0;j<n;j++)
//             {
//                System.out.println(total[i][j]);
//             }
//             System.out.print("/n");
//         }
//     }    
// }




// public class basic1 {

//     String name;
//     int roll;
//     float marks;
// void data()
// {
//     Scanner in=new Scanner(System.in);
//    name= in.nextLine();
//     roll=in.nextInt();
//     marks=in.nextFloat();
// }    
// void display()
// {
//     System.out.println(name);
//     System.out.println(roll);
//     System.out.println(marks);
// }
// public static void main(String[] args) {
//     Scanner in=new Scanner(System.in);
//     int max=in.nextInt();
//     basic1[] obj=new basic1[max];
//     for(int i=0;i<max;i++)
//     {
//        obj[i]=new basic1();
//        obj[i].data();
//     }
//     for(int i=0;i<max;i++)
//     {
//         obj[i].display();
//     }
   
// }
// }



// public class basic1 {

//     int roll,marks;
//     String name;
//     basic1(int roll,int marks,String name)
//     {
//         this.roll=roll;
//         this.marks=marks;
//         this.name=name;
//     }
//     basic1(basic1 Basic1)
//     {
//         roll=Basic1.roll;
//         marks=Basic1.marks;
//         name=Basic1.name;
//     }
//     void display()
//     {
//         System.out.println(roll +" "+ marks +" "+ name);
//     }

//     public static void main(String[] args) {
//         basic1 in=new basic1(20221,90,"fardeen");
//         in.display();
//         basic1 in1=new basic1(in);
//         in1.display();
//     }
// }


/**
 * basic1
 */
// public class basic1 {

//     int roll,marks;
//     String name;
//     void get()
//     {
//         Scanner in=new Scanner(System.in);
//         System.out.println("enter the name");
//         name=in.nextLine();
//         System.out.println("enter te roll");
//         roll=in.nextInt();
//         System.out.println("enter the marks");
//         marks=in.nextInt();
//     }
//     void display()
//     {
//         System.out.println(name+" "+roll+" "+marks);
//     }
//     public static void main(String[] args) {
//         Scanner in=new Scanner(System.in);
//         int res=in.nextInt();
//         basic1[] mm=new basic1[res];
//         for(int i=0;i<res;i++)
//         {
//             mm[i]=new basic1();
//             mm[i].get();
//         }
//         for(int i=0;i<res;i++)
//         {
//             mm[i].display();
//         }
//     }
// }

/**
 * basic1
 */
public class basic1 {

    public static void main(String[] args) {
        StringBuffer s1=new StringBuffer("science information");
        System.out.println(s1.insert(7,"for"));
        System.out.println(s1.insert(2,"o"));
        System.out.println(s1.insert(3,"trure"));
        char str[]={'f','a','r','d','e','e','n'};
        s1.insert(2, str);
        System.out.println(s1);
    }
}