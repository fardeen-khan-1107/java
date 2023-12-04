import java.util.Scanner;
class StudentLab2
{
Scanner input = new Scanner(System.in);
int rollno, sem;
String name, branch; 
StudentLab2() // default constructor
{
rollno=100;
sem= 1;
name="Munna";
branch="CSE"; 
}
StudentLab2(int roll,int s,String stname, String stbranch) // Parametrized constructor
{
rollno=roll;
sem= s;
name=stname;
branch=stbranch; 
}
StudentLab2(StudentLab2 studentlab2) // copy constructor
{
rollno=studentlab2.rollno;
sem=studentlab2.sem;
name=studentlab2.name;
branch=studentlab2.branch; 
}
/*void read()
{
System.out.println("Enter Name of the Student:");
name = input.nextLine();
System.out.println("Enter Rollnumber of the Student:");
rollno = input.nextInt();
System.out.println("Enter Sem of the Student:");
sem = input.nextInt();
System.out.println("Enter Branch of the Student:");
branch = input.next();
}*/
void display()
{
System.out.println("Name of the Student:"+name);
System.out.println("Rollnumber of the Student:"+rollno);
System.out.println("Sem of the Student:"+sem);
System.out.println("Branch of the Student:"+branch);
}
public static void main(String args[])
{
StudentLab2 s1 = new StudentLab2(); // default constructor will be called 
//s1.display();
StudentLab2 s2 = new StudentLab2(1000,1,"Basha","CSE"); // parameterized constructor will be 
//s2.display();
StudentLab2 s3 = new StudentLab2(s2); //copy
s3.display();
}
}