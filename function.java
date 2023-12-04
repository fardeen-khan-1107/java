import java.util.Scanner;

public class function {

    static String name=new String();

    public static void MYname(){
        System.out.println("your name is" + name);
    }
    public static void main(String args[]){
    Scanner fuck=new  Scanner(System.in);
     name=fuck.nextLine();
    MYname();
    }
}