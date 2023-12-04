import java.util.Scanner;

abstract class work
{
    int c;
    abstract void result(int a,int b);
}
class sum extends work
{
    public void result(int f,int t)
    {
        
        c=f+t;
        System.out.println(c);
    }
}
class sub extends work
{
    public void result(int a,int b)
    {
        c=a-b;
        System.out.println(c);
    }
    
}
public class abstraction {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        sum num=new sum();
        sub val=new sub();
        int a=in.nextInt();
        int b=in.nextInt();
        num.result(a,b);
        val.result(a,b);        
    }
}
