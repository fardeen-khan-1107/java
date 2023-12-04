import java.util.Scanner;
public class patter {

    public static void main(String args[])
    {
        /*for(int i=0;i<4;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/



        /*for(int i=0;i<=4;i++){
            for(int j=0;j<=i;j++){
                if(i==0||j==0||i==4||j==5){
                    System.out.print("*");
                }
                else{
                System.out.print(" ");
                }
            }
           System.out.println();
        }*/



        /*for(int i=4;i>=1;i--)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        } */



        Scanner hi=new Scanner(System.in);
        System.out.println("enter the n value");
        int n=hi.nextInt();
        /*for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }*/




        /*for(int i=1;i<=n;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/



        /* for(int i=1;i<=n;i++)
        {
            for(int j=0;j<=n-i;j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }*/


        
        /*int number=1;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(number);
                number++;
            }
            System.out.println();
        }*/

       
       
        /* for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=i;j++)
            {
                if(j%2==0)
                {
                    System.out.print("1");
                }
                else
                {
                    System.out.print("0");
                }
            }
            System.out.println();
        }*/
    

    }
}
