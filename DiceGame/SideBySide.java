package DiceGame;
import java.util.Random;
public class SideBySide
{
    String [][] graphics =
    {
        {
           "___________",
           "|         |",
           "|         |",
           "|    *    |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "|         |",
           "|         |",
           "| *     * |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "|         |",
           "|         |",
           "| *  *  * |",
           "|         |",
           "|_________|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "|         |",
           "|         |",
           "|_*_____*_|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "|    *    |",
           "|         |",
           "|_*_____*_|"
        },
        {
           "___________",
           "| *     * |",
           "|         |",
           "| *     * |",
           "|         |",
           "|_*_____*_|"
        }
    };

    void printSideBySide(int userRoll,int computerRoll)
    {
        System.out.printf("\n%-15s %13s\n","You","Computer");
        for(int i=0;i<6;i++)
        {
            System.out.printf("%-15s %15s\n",graphics[userRoll-1][i],graphics[computerRoll-1][i]);
        }       
    }
    public static void main(String[] args)
    {
        SideBySide d=new SideBySide();
        Random random=new Random();

        int userRoll=random.nextInt(6)+1;
        int computerRoll=random.nextInt(6)+1;

        d.printSideBySide(userRoll, computerRoll);

        if(userRoll>computerRoll)
        System.out.println("\nYou Won!\n");
        else if(userRoll<computerRoll)
        System.out.println("\nComputer Won!\n");
        else
        System.out.println("\nIt's a Tie!\n");

    }
}
