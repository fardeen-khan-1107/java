import java.util.Arrays;
import java.util.Scanner;
public class basic
 {
    public static void main(String args[])
    {
   
      //System.out.println("hello world");
      //System.out.println(name.length());
      
      //string and they types
      
      //String name0="hello ";
      //String name1="world";
      //String name2= name0  + name1 +" how are you ";
      //System.out.println(name2);
      
         /*String name4="fardeen khan";
         System.out.println(name4.charAt(4));
         String name5=name4.replace('e','r');
         System.out.println(name5);
         String name6=name5.substring(0, 6);
         System.out.println(name6);*/
      
      
      //arrays
      /*int[] ages=new int[4];
      ages[0]=34;
      ages[1]=45;
      ages[2]=90;
      ages[3]=23;
      System.out.println(ages[0]);
      System.out.println(ages.length);

      Arrays.sort(ages);
      System.out.println(ages[3]);*/
      
      //casting
      //explicti casting
      /*int r=140;
      float finalrate= r+(float)3.14;
      System.out.println(finalrate);*/

      //constant
      /*final int PI=345;
       PI=2.34;
       System.out.println(PI);*/

       /*int a,b,c;
       a=1;
       b=2;
       c=a+b;
       System.out.println(c);*/
       //System.out.println(Math.max(10, 10));
       /*Scanner sc=new Scanner(System.in);
       //int age=sc.nextInt();
       String name=sc.nextLine();
       float rate=sc.nextFloat();
       System.out.println( rate  +" "+ name );*/
       
       //conditional statements

       Scanner sc=new Scanner(System.in);
       /*int a=sc.nextInt();
       int b=sc.nextInt();
       if(a<50&&b<50)
       {
         System.out.println("50 is greater");
       }
       else if (a<50||b<50) 
       {
         System.out.println("atleast one is greater");
      }
       else 
       {
         System.out.println("both are less than 50");  
       }*/

       //System.out.println("enter the number to repeate in loop");
       //int size=sc.nextInt();
       //int[] array=new int[size];
       /*for(int i=0;i<size;i++)
       {
        array[i]=sc.nextInt();
       }
       for(int i=0;i<size;i++)
       {
        System.out.println(array[i]);
       }*/

       /*int j=0;
       while(j<size)
       {
        array[j]=sc.nextInt();
        j++;
       }
        j=0;
       while(j<size)
       {
        System.out.println(array[j]);
        j++;
       }*/
        
       /*int i=0,sum=0;
       do{
        sum=sum+i;
        i++;
       }while(i<4);
       System.out.println(sum)*/;
       int var=1;
       System.out.println("enter your answer");
       String ans=sc.nextLine();
       do{
          System.out.println("the device is used "+ var +"times" );
          var++;
       }while(ans.equals("y")&&var<5);
      }
 }
