//Signal Traffic light code
//Name:-Ananya Kaushik
//Roll No. :- 68
import java.util.Scanner;
public class Traffic
{
    public static void main(String args[])
    {
        while(true)
        {
            System.out.println("Enter the Traffic Light Color (If you want to exit Enter Exit) :");
            Scanner s=new Scanner(System.in);
            String str=s.nextLine();
            switch(str)
            {
                case "red":
                case "Red":
                case "RED":
                            System.out.println("Stop");
                break;
                case "yellow":
                case "Yellow":
                case "YELLOW":
                            System.out.println("Prepare to Stop");
                break;
                case "green":
                case "Green":
                case "GREEN":
                System.out.println("GO");
                break;
                case "exit":
                case "Exit":
                case "EXIT":
                            System.exit(0);
                break;
                default:
                        System.out.println("Enter the Valid Prompt");
            }
        }
    }
}
/*
Enter the Traffic Light Color (If you want to exit Enter Exit) :
yellow
Prepare to Stop
Enter the Traffic Light Color (If you want to exit Enter Exit) :
green
GO
Enter the Traffic Light Color (If you want to exit Enter Exit) :
red
Stop
Enter the Traffic Light Color (If you want to exit Enter Exit) :
exit
*/
/*
Enter the Traffic Light Color (If you want to exit Enter Exit) :
GREEN
GO
Enter the Traffic Light Color (If you want to exit Enter Exit) :
YELLOW
Prepare to Stop
Enter the Traffic Light Color (If you want to exit Enter Exit) :
RED
Stop
Enter the Traffic Light Color (If you want to exit Enter Exit) :
EXIT
*/