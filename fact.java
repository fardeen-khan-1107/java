import java.util.Scanner;

class main
{
    private int num;
    private int mul=1;
    public void getfact(int num)
    {
        this.num=num;
        for(int i=1;i<=num;i++)
        {
            mul=mul*i;
        }
    }
    public void getresult()
    {
        System.out.println(mul);
    }

}


public class fact {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        main kho=new main();
        kho.getfact(a);
        kho.getresult();         
    }
}
