package DiceGame;
import java.util.Random;
public class Initial
{
    void graphics(int n)
    {
        String graphic = switch(n)
        {
            case 1 -> """
                    ___________
                    |         |
                    |         |
                    |    *    |
                    |         |
                    |_________|
                    """;
            case 2 -> """
                    ___________
                    |         |
                    |         |
                    | *     * |
                    |         |
                    |_________|
                    """;
            case 3 -> """
                    ___________
                    |         |
                    |         |
                    | *  *  * |
                    |         |
                    |_________|
                    """;
            case 4 -> """
                    ___________
                    | *     * |
                    |         |
                    |         |
                    |         |
                    |_*_____*_|
                    """;
            case 5 -> """
                    ___________
                    | *     * |
                    |         |
                    |    *    |
                    |         |
                    |_*_____*_|
                    """;
            case 6 -> """
                    ___________
                    | *     * |
                    |         |
                    | *     * |
                    |         |
                    |_*_____*_|
                    """;
            default -> "Invalid Dice Number!";                                                
        };
        System.out.println(graphic);
    }
    
    public static void main(String[] args)
    {
        Initial d=new Initial();
        Random random=new Random();

        int userRoll=random.nextInt(6)+1;
        int computerRoll=random.nextInt(6)+1;

        System.out.println("\nYou : ");
        d.graphics(userRoll);
        System.out.println("Computer : ");
        d.graphics(computerRoll);

        if(userRoll>computerRoll)
        System.out.println("\nYou Won!\n");
        else if(userRoll<computerRoll)
        System.out.println("\nComputer Won!\n");
        else
        System.out.println("\nIt's a Tie\n");
    }
}