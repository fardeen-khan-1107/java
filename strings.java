import java.util.*;
public class strings {
    // public static void main(String args[])
    // {
    //    Scanner in=new Scanner(System.in);
    //     String name=in.nextLine();
    //     System.out.println(name.length());
    // }

    // public static void main(String args[]){
    //     Scanner in=new Scanner(System.in);
    //     int num=in.nextInt();
    //     int num1[]=new int[num];
    //     for(int i=0;i<num;i++)
    //     {
    //      num1[i]=in.nextInt();
    //     }
    //     for(int i=0;i<num-1;i++)
    //     {
    //         for(int j=0;j<num-1;j++)
    //         {
    //             if(num1[j]>num1[j+1])
    //             {
    //                 int temp=num1[j];
    //                 num1[j]=num1[j+1];
    //                 num1[j+1]=temp;
    //             }
    //         }
    //     }
    //     for(int i=0;i<num;i++)
    //     {
    //         System.out.println(num1[i]);
    //     }
    // }



    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int num=in.nextInt();
        int[] selection=new int[num];
        for(int i=0;i<num;i++)
        {
            selection[i]=in.nextInt();
        }
        for(int i=0;i<num;i++)
        {
            int smaller=i;
            for(int j=i+1;j<num;j++)
            {
                if(selection[smaller]>selection[j])
                {
                    smaller=j;
                }
            }
            int temp=selection[smaller];
            selection[smaller]=selection[i];
            selection[i]=temp;
        }
        System.out.println();
        for(int i=0;i<num;i++)
        {
            System.out.println(selection[i]);
        }
    }



}