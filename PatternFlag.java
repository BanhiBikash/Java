class PatternFlag
{
public static void main(String args[])
{
    for(int k=1;k<=3;k++)
    {
        if(k!=2)
        {

        for(int j=1;j<7;j++)
        {
            for(int i=1;i<=60;i++)
            {
                System.out.print("=");
            }
            System.out.print("\n");
        }

        }

        else
        {
        for(int j=1;j<7;j++)
        {
            for(int i=1;i<=60;i++)
            {
                System.out.print("");
            }
            System.out.print("\n");
        }

        }
   }
}
}