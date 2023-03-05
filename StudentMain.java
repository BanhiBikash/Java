import java.util.*;

class Student{

    String name;
    int roll_no;

}

class StudentMain{
public static void main(String args[]){

    Student obj=new Student();
        Scanner scn=new Scanner(System.in);
        

        System.out.println("Enter the name and roll no. respectively.");
        obj.name="John";
        obj.roll_no=2;

        System.out.println("Name is "+obj.name+" and roll no.is "+obj.roll_no);
}
}