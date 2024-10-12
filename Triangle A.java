//Triangles program
//Name:-Ananya Kaushik
//Roll No. :- 68
import java.util.Scanner;
public class Triangle
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the side 1:");
        int a=s.nextInt();
        System.out.println("Enter the side 2:");
        int b=s.nextInt();
        System.out.println("Enter the side 3:");
        int c=s.nextInt();
        if (a==b && b==c)
        {
            System.out.println("Equilateral Triangle");
        }
        else if (a==b || a==c || a==b)
        {
            System.out.println("Isosceles Triangle");
        }
        else if((a*a+b*b==c*c) || (b*b+c*c==a*a) || (a*a+c*c==b*b))
        {
            System.out.println("Right Angle Triangle");
        }
        else
        {
            System.out.println("Scalene Triangle");
        }
    }
}
/*
Enter the side 1:
1
Enter the side 2:
2
Enter the side 3:
3
Scalene Triangle
*/

/*
Enter the side 1:
9
Enter the side 2:
9
Enter the side 3:
9
Equilateral Triangle
*/

/* 
Enter the side 1:
5
Enter the side 2:
5
Enter the side 3:
9
Isosceles Triangle
*/

/*
Enter the side 1:
3
Enter the side 2:
4
Enter the side 3:
5
Right Angle Triangle
*/