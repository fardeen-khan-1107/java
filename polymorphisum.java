import java.util.Scanner;

class number{
        int a,b,c;

    public void sum(Float a,Float b)
    {
        c=(int)(a+b);
        System.out.println(c);
    }
    public void sum(int a,int b)
    {
        c=a-b;
        System.out.println(c);
    }
    public void sum(int a,int b,int c)
    {
        c=a*b*c;
        System.out.println(c);
    }
    public void sum(double a,double b)
    {
        double c=a/b;
        System.out.println(c);
    }
    }


  public class polymorphisum {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        number num=new number();
        int a=in.nextInt();
        int b=in.nextInt();
        Float af=in.nextFloat();
        Float bf=in.nextFloat();
        num.sum(af,bf);
        num.sum(a,b);
        num.sum(a,b,num.c);
        num.sum((double)a,(double)b);
    }
  }

