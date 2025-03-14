package NumberConversion;
import java.math.BigInteger;
import java.util.Scanner;

public class Convert
{
    static int ch1,ch2;
    static final Scanner sc=new Scanner(System.in);

    static boolean checkDec(String n)
    {
        n=n.trim();
        int start=0;
        if(n.charAt(0)=='-')
        start=1;
        for(int i=start;i<n.length();i++)
        {
            if(!Character.isDigit(n.charAt(i)))
            return false;
        }
        return true;
    }
    static boolean checkBin(String n)
    {
        n=n.trim();
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch!='0' && ch!='1')
            return false;
        }
        return true;
    }
    static boolean checkOct(String n)
    {
        n=n.trim();
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(ch<48 || ch>55)
            return false;
        }
        return true;
    }
    static boolean checkHex(String n)
    {
        n=n.trim();
        n=n.toUpperCase();
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(!Character.isDigit(ch))
            {
                if(ch<65 || ch>70)
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args)
    {
        System.out.println("\nNUMBER CONVERSION");
        while(true)
        {
            String ch[]={"Decimal", "Binary", "Octal", "Hexadecimal"};
            System.out.println("1.Decimal\n2.Binary\n3.Octal\n4.Hexadecimal\n");
            System.out.print("From [1/2/3/4] : ");
            String choice1=sc.nextLine();
            choice1=choice1.trim();
            while(true)
            {
                if(choice1.isEmpty() || choice1.length()>1)
                {
                    System.out.print("Please enter a valid choice : ");
                    choice1=sc.nextLine();
                    choice1=choice1.trim();
                }
                else if(!Character.isDigit(choice1.charAt(0)))
                {
                    System.out.print("Please enter a valid choice : ");
                    choice1=sc.nextLine();
                    choice1=choice1.trim();
                }
                else if((Integer.parseInt(choice1)>=1 && Integer.parseInt(choice1)<=4))
                {
                    break;
                }
                else
                {
                    System.out.print("Please enter a valid choice : ");
                    choice1=sc.nextLine();
                    choice1=choice1.trim();
                }
            }
            System.out.print("To [1/2/3/4] : ");
            String choice2=sc.nextLine();
            choice2=choice2.trim();
            while(true)
            {
                if(choice2.isEmpty() || choice2.length()>1)
                {
                    System.out.print("Please enter a valid choice : ");
                    choice2=sc.nextLine();
                    choice2=choice2.trim();
                }
                else if(!Character.isDigit(choice2.charAt(0)))
                {
                    System.out.print("Please enter a valid choice : ");
                    choice2=sc.nextLine();
                    choice2=choice2.trim();
                }
                else if((Integer.parseInt(choice2)>=1 && Integer.parseInt(choice2)<=4) && !(choice2.equals(choice1)))
                {
                    break;
                }
                else
                {
                    System.out.print("Please enter a valid choice : ");
                    choice2=sc.nextLine();
                    choice2=choice2.trim();
                }
            }
            ch1=Integer.parseInt(choice1);
            ch2=Integer.parseInt(choice2);
            System.out.println("\n"+ch[ch1-1]+" To "+ch[ch2-1]+" !!\n");

            switch(ch1)
            {
                case 1:
                {
                    System.out.print("Decimal Number : ");
                    String n = sc.nextLine();
                    n=n.trim();
                    while(true)
                    {
                        if(n.isEmpty())
                        {
                            System.out.print("Please enter a valid decimal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else if(checkDec(n)==false)
                        {
                            System.out.print("Please enter a valid decimal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else
                        break;
                    }
                    BigInteger bg=new BigInteger(n,10);
                    if(ch2==2)
                    {
                        System.out.println("Binary Number : "+bg.toString(2)+"\n");
                    }
                    else if(ch2==3)
                    {
                        System.out.println("Octal Number : "+bg.toString(8)+"\n");
                    }
                    else if(ch2==4)
                    {
                        System.out.println("Hexadecimal Number : "+bg.toString(16).toUpperCase()+"\n");
                    }
                    break;
                }
                case 2:
                {
                    System.out.print("Binary Number : ");
                    String n = sc.nextLine();
                    n=n.trim();
                    while(true)
                    {
                        if(n.isEmpty())
                        {
                            System.out.print("Please enter a valid binary number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else if(checkBin(n)==false)
                        {
                            System.out.print("Please enter a valid binary number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else
                        break;
                    }
                    BigInteger bg=new BigInteger(n,2);
                    if(ch2==1)
                    {
                        System.out.println("Decimal Number : "+bg.toString(10)+"\n");
                    }
                    else if(ch2==3)
                    {
                        System.out.println("Octal Number : "+bg.toString(8)+"\n");
                    }
                    else if(ch2==4)
                    {
                        System.out.println("Hexadecimal Number : "+bg.toString(16).toUpperCase()+"\n");
                    }
                    break;
                }
                case 3:
                {
                    System.out.print("Octal Number : ");
                    String n = sc.nextLine();
                    n=n.trim();
                    while(true)
                    {
                        if(n.isEmpty())
                        {
                            System.out.print("Please enter a valid octal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else if(checkOct(n)==false)
                        {
                            System.out.print("Please enter a valid octal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else
                        break;
                    }
                    BigInteger bg=new BigInteger(n,8);
                    if(ch2==1)
                    {
                        System.out.println("Decimal Number : "+bg.toString(10)+"\n");
                    }
                    else if(ch2==2)
                    {
                        System.out.println("Binary Number : "+bg.toString(2)+"\n");
                    }
                    else if(ch2==4)
                    {
                        System.out.println("Hexadecimal Number : "+bg.toString(16).toUpperCase()+"\n");
                    }
                    break;
                }
                case 4:
                {
                    System.out.print("Hexadecimal Number : ");
                    String n = sc.nextLine();
                    n=n.trim();
                    while(true)
                    {
                        if(n.isEmpty())
                        {
                            System.out.print("Please enter a valid hexadecimal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else if(checkHex(n)==false)
                        {
                            System.out.print("Please enter a valid hexadecimal number : ");
                            n=sc.nextLine();
                            n=n.trim();
                        }
                        else
                        break;
                    }
                    BigInteger bg=new BigInteger(n,16);
                    if(ch2==1)
                    {
                        System.out.println("Decimal Number : "+bg.toString(10)+"\n");
                    }
                    else if(ch2==2)
                    {
                        System.out.println("Binary Number : "+bg.toString(2)+"\n");
                    }
                    else if(ch2==3)
                    {
                        System.out.println("Octal Number : "+bg.toString(8)+"\n");
                    }
                    break;
                }
            }

            System.out.println("1.Press ENTER to Convert again\n2.Type Anything & press ENTER to STOP");
            String input=sc.nextLine();
            if(!input.isEmpty())
            break;
        }
    }
}