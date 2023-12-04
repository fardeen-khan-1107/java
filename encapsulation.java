import java.util.Scanner;

class encap{
    private float marks;
    encap(float mark)
    {
        this.marks=mark;
    }
    void getmark()
    {
        System.out.println(this.marks);
    }
}


public class encapsulation {
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        float a=in.nextFloat();
        encap oo=new encap(a);
        oo.getmark();

    }
    
}
