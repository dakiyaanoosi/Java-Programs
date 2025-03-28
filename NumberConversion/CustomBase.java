package NumberConversion;

import java.math.BigInteger;
import java.util.Scanner;
class CustomBase
{
    static final Scanner sc=new Scanner(System.in);

    static int Base()
    {
        System.out.print("Base (1-36) : ");
        String base=sc.nextLine();
        base=base.trim();
        while(true)
        {
            try
            {
                int in=Integer.parseInt(base);
                if(in>=2 || in<=36)
                break;
                else
                {
                    System.out.print("Enter Valid Input : ");
                    base=sc.nextLine();
                }
            }
            catch(Exception e)
            {
                System.out.print("Enter Valid Input : ");
                base=sc.nextLine();
            }
        }
        return Integer.parseInt(base);
    }

    static boolean check(String num,int base)
    {
        try
        {
            new BigInteger(num,base);
            return true;
        }
        catch(Exception e)
        {
            return false;
        }
    }

    static String input(int from)
    {
        System.out.print("Enter the number : ");
        String num=sc.nextLine();
        num=num.trim();
        while(check(num,from)==false)
        {
            System.out.print("Enter valid Base "+from+" number : ");
            num=sc.nextLine();
            num=num.trim();
        }
        return num;
    }
    static void convert()
    {   
        System.out.print("\nFrom ");
        int from=Base();
        System.out.print("\nTo ");
        int To=Base();
        System.out.println("\nFrom base "+from+" to base "+To+"!\n");
        String number=input(from);

        BigInteger bg=new BigInteger(number,from);
        System.out.println("Result : "+bg.toString(To));

        System.out.println("\n1.Press ENTER to Convert again\n2.Type Anything & press ENTER to STOP");
        String input=sc.nextLine();
        if(!input.isEmpty())
        {
            return;
        }
        convert();
    }

    public static void main(String[] args)
    {
        CustomBase.convert();
    }
}