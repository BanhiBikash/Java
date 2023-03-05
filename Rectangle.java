import java.util.Scanner;

class Area{
    int l,b;

    void setDim()
    {
        Scanner scn=new Scanner(System.in);

        System.out.println("Enter the length");
        l=scn.nextInt();

        System.out.println("Enter the breadth");
        b=scn.nextInt();
    }

    void getArea()
    {
        setDim();
        System.out.println("The area of the rectangle is "+l*b);
    }
}

class Rectangle
{
    public static void main (String args[])
    {
        Area obj=new Area();
        obj.getArea();      
    }
}