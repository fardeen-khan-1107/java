import java.util.Scanner;

public class arrays {

    /*public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        int size=in.nextInt();
        int marks[]=new int[size];
        for(int i=0;i<size;i++)
        {
            marks[i]=in.nextInt();
        }
        System.out.println("enter the value to search");
        int search=in.nextInt();
        for(int i=0;i<size;i++)
        {
            if(search==marks[i])
            {
                int position=i;
                System.out.println("the value is present at position"+position);
            }
                 
        }

    }*/

/*public static void main(String args[])
{
    int ages[]={10,20,30,40,50};
    System.out.println(ages[1]);
}*/

public static void main(String args[])
{
    Scanner in=new Scanner(System.in);
    int row=in.nextInt();
    int col=in.nextInt();
    int array1[][]=new int[row][col];
    int array2[][]=new int[row][col];
    System.out.println("enter the data for first array");
    int number[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
        array1[i][j]=in.nextInt();
        }
    }
    System.out.println("enter the data for second array");
    int number1[][]=new int[row][col];
    for(int i=0;i<row;i++)
    {
        for(int j=0;j<col;j++)
        {
            array2[i][j]=in.nextInt();          
        }
    }
    System.out.println("the sum of data is");
    {
        int[][] sum=new int[row][col];
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                sum[i][j]=array1[i][j]+array2[i][j];
            }
        }
        System.out.println("the sum is");
        for(int i=0;i<row;i++)
        {
            for(int j=0;j<col;j++)
            {
                System.out.print(" ");
                System.out.println(sum[i][j]);
            }
            System.out.println();
        }
    }
}
}