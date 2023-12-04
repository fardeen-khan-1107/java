import java.util.*;
class inputs
{
    int a, b, c;
    public void sum(int a,int b)
    {
        c=a+b;
        System.out.println(this.c);
    }
}
class otherinputs extends inputs
{
    public void sub(int a ,int b)
    {
     c=a-b;
    }
}
class output extends otherinputs
{
    public void result()
    {
        System.out.println(c);
    }
}

public class inheritance {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
       
        int a=in.nextInt();
        int b=in.nextInt();
        inputs num2=new inputs();
        num2.sum(a,b);
       // num2.sub(a,b);
        //num2.result();

    }  
}
