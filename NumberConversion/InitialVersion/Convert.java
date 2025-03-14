package NumberConversion.InitialVersion;

import java.util.Scanner;
public class Convert
{
    static boolean checkValidity(String n)
    {
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
    static boolean checkBin(long n)
    {
        while(n!=0)
        {
            long r=n%10;
            n/=10;
            if(r==1 || r==0)
            continue;
            else
            {
                return false;
            }
        }
        return true;
    }
    static boolean checkOct(long n)
    {
        while(n!=0)
        {
            long r=n%10;
            n/=10;
            if(!(r<8))
            return false;
        }
        return true;
    }
    static boolean checkHex(String n)
    {
        n=n.toUpperCase();
        for(int i=0;i<n.length();i++)
        {
            char ch=n.charAt(i);
            if(!Character.isDigit(ch))
            {
                if(!(ch>='A' && ch<='F'))
                return false;
            }
        }
        return true;
    }
    static String returnHex(String n,Scanner sc)
    {
        while(checkHex(n)==false)
        {
            System.out.print("Please Enter a Valid Hexadecimal Number : ");
            n=sc.nextLine();
        }
        return n;
    }
    static long returnOct(long n,Scanner sc)
    {
        while(checkOct(n)==false)
        {
            System.out.print("Please Enter a Valid Octal Number : ");
            n=sc.nextInt();
        }
        return n;
    }
    static long returnBin(long n,Scanner sc)
    {
        while(checkBin(n)==false)
        {
            System.out.print("Please Enter a Valid Binary Number : ");
            n=sc.nextInt();
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("\nNUMBER CONVERSION");
        while(true)
        {
        String ch[]={"Decimal", "Binary", "Octal", "Hexadecimal"};
        System.out.println("1.Decimal\n2.Binary\n3.Octal\n4.Hexadecimal\n");
        System.out.print("From [1/2/3/4] : ");
        String choice1=sc.nextLine();
        while(true)
        {
            if(choice1.isEmpty() || choice1.length()>1)
            {
                System.out.print("Please enter a valid choice : ");
                choice1=sc.nextLine();
            }
            else if(!Character.isDigit(choice1.charAt(0)))
            {
                System.out.print("Please enter a valid choice : ");
                choice1=sc.nextLine();
            }
            else if((Integer.parseInt(choice1)>=1 && Integer.parseInt(choice1)<=4))
            {
                break;
            }
            else
            {
                System.out.print("Please enter a valid choice : ");
                choice1=sc.nextLine();
            }
        }
        System.out.print("To [1/2/3/4] : ");
        String choice2=sc.nextLine();
        while(true)
        {
            if(choice2.isEmpty() || choice2.length()>1)
            {
                System.out.print("Please enter a valid choice : ");
                choice2=sc.nextLine();
            }
            else if(!Character.isDigit(choice2.charAt(0)))
            {
                System.out.print("Please enter a valid choice : ");
                choice2=sc.nextLine();
            }
            else if((Integer.parseInt(choice2)>=1 && Integer.parseInt(choice2)<=4) && !(choice2.equals(choice1)))
            {
                break;
            }
            else
            {
                System.out.print("Please enter a valid choice : ");
                choice2=sc.nextLine();
            }
        }
        int ch1=Integer.parseInt(choice1);
        int ch2=Integer.parseInt(choice2);
        System.out.println("\n"+ch[ch1-1]+" To "+ch[ch2-1]+" !!\n");

        switch(ch1)
        {
            case 1:
            {
                System.out.print("Decimal Number : ");
                String n = sc.nextLine();
                while(checkValidity(n)==false)
                {
                    System.out.print("Please enter a valid decimal number : ");
                    n=sc.nextLine();
                }
                long d=Long.parseLong(n);
                if(ch2==2)
                {
                    long result=DecTo.decToBin(d);
                    System.out.println("Binary Number : "+result+"\n");
                }
                else if(ch2==3)
                {
                    long result=DecTo.decToOct(d);
                    System.out.println("Octal Number : "+result+"\n");
                }
                else if(ch2==4)
                {
                    String result=DecTo.decToHex(d);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 2:
            {
                System.out.print("Binary Number : ");
                String n = sc.nextLine();
                while(checkValidity(n)==false)
                {
                    System.out.print("Please enter a valid binary number : ");
                    n=sc.nextLine();
                }
                long b=Long.parseLong(n);
                b=returnBin(b, sc);
                if(ch2==1)
                {
                    long result=BinTo.binToDec(b);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                else if(ch2==3)
                {
                    long result=BinTo.binToOct(b);
                    System.out.println("Octal Number : "+result+"\n");
                }
                else if(ch2==4)
                {
                    String result=BinTo.binToHex(b);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 3:
            {
                System.out.print("Octal Number : ");
                String n = sc.nextLine();
                while(checkValidity(n)==false)
                {
                    System.out.print("Please enter a valid octal number : ");
                    n=sc.nextLine();
                }
                long o=Long.parseLong(n);
                o=returnOct(o, sc);
                if(ch2==1)
                {
                    long result=OctTo.octToDec(o);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                else if(ch2==2)
                {
                    long result=OctTo.octToBin(o);
                    System.out.println("Binary Number : "+result+"\n");
                }
                else if(ch2==4)
                {
                    String result=OctTo.octToHex(o);
                    System.out.println("Hexadecimal Number : "+result+"\n");
                }
                break;
            }
            case 4:
            {
                System.out.print("Hexadecimal Number : ");
                String h=sc.nextLine();
                h=returnHex(h, sc);
                if(ch2==1)
                {
                    long result=HexTo.hexToDec(h);
                    System.out.println("Decimal Number : "+result+"\n");
                }
                else if(ch2==2)
                {
                    long result=HexTo.hexToBin(h);
                    System.out.println("Binary Number : "+result+"\n");
                }
                else if(ch2==3)
                {
                    long result=HexTo.hexToOct(h);
                    System.out.println("Octal Number : "+result+"\n");
                }
                break;
            }
        }
        System.out.println("1.Press ENTER to Convert again\n2.Type Anything & press ENTER to STOP");
        String input=sc.nextLine();
        if(!input.isEmpty())
        break;
        }
        sc.close();
    }
}
