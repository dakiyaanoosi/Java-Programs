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
        // while(true)
        // {
        //     if(base.equals("0") || base.isEmpty() || base.length()>2)
        //     {
        //         System.out.print("Base (1-36) : ");
        //     }
        //     else if(base.length()==1)
        //     {
        //         if(!Character.isDigit(base.charAt(0)))
        //         {
        //             System.out.print("Base (1-36) : ");
        //         }
        //         else break;
        //     }
        //     else if(base.length()==2)
        //     {
        //         if(!Character.isDigit(base.charAt(0)) || !Character.isDigit(base.charAt(1)))
        //         {
        //             System.out.print("Base (1-36) : ");
        //         }
        //         else if(Integer.parseInt(base)>36)
        //         {
        //             System.out.print("Base (1-36) : ");
        //         }
        //         else break;
        //     }
        //     base=sc.nextLine();
        // }
        // Simplifying the above logic.......
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
        // int start=0;
        // if(num.charAt(0)=='-')
        // start=1;
        // if(base<=10)
        // {
        //     for(int i=start;i<num.length();i++)
        //     {
        //         if(Character.isDigit(num.charAt(i)))
        //         {
        //             if(num.charAt(i)-'0'>(base-1))
        //             return false;
        //         }
        //     }
        // }
        // else
        // {
        //     for(int i=start;i<num.length();i++)
        //     {
        //         if(Character.isLetter(num.charAt(i)))
        //         {
        //             if(num.charAt(i)<65 || num.charAt(i)>65+(base-10)-1)
        //             {
        //                 return false;
        //             }
        //         }
        //         else if(!(Character.isDigit(num.charAt(i))))
        //         return false;
        //     }
        // }
        // return true;
        //Simplification of the above logic............
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
    }

    public static void main(String[] args)
    {
        CustomBase.convert();
    }
}