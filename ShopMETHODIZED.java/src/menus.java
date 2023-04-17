import java.util.Scanner;
public class menus {




   
    

    public static void Mundae ()
    {
        System.out.println("\t\t\t\t=============================");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|      Mundae Shopping      |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|        [1] Start          |");       
        System.out.println("\t\t\t\t|        [2] exit           |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t=============================");
    }

     
    public static void menu ()
    {

        System.out.println("==========================================[ MAIN MENU ]==========================================================");
        System.out.println("");
        System.out.println("        [1] Buy In game Purchase");
        System.out.println("        [2] Account balance");
        System.out.println("        [3] Total spending");
        //System.out.println("        [4] Your shop");
        System.out.println("        [4] Shop");
        System.out.println("        [5] Exit");
        System.out.println("");
        System.out.println("=================================================================================================================");
    }


    public static double purchase1 (double monar)
    {
        Scanner user=new Scanner(System.in);

        double result=0; 
        result = result + monar ;


        System.out.println("");
        System.out.println("            ( TRANSACTION SUCCESSFUL ) ");
        System.out.printf("[ %+,5.2f ] pyroxines has been added to your account\n",monar);

        return result;

    }


    public static void warning ()
    {

                                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
                                System.out.println("                                        >> WARNING <<");
                                System.out.println("                            [ YOUR ACCOUNT BALANCE HAS BEEN HACKED ]");
                                System.out.println("");
                                System.out.println("            [ You do not have the authorization required to purchase in the Black Market ]");
                                System.out.println("");
                                System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }

    
/*public static void usershopmenu()
    {

        System.out.println("\t\t\t\t=============================");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|        USER SHOP MENU     |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t|        [1] Sell items     |");       
        System.out.println("\t\t\t\t|        [2] Remove items   |");
        System.out.println("\t\t\t\t|        [3] exit           |");
        System.out.println("\t\t\t\t|                           |");
        System.out.println("\t\t\t\t=============================");

    } */
    



    /*                 menus.usershopmenu();
                        int select = user.nextInt();

                        switch(select)
                        {
                            case 1:
                            {
                                Scanner choose2=new Scanner(System.in);
                                System.out.println("what do you want to sell?");
                                String selling = choose2.nextLine();

                                Scanner choose3=new Scanner(System.in);
                                
                                System.out.println("how much does it cost?");
                                double userpric = choose3.nextDouble();

                                lol.usershop.add (selling);
                                lol.userprice.add (userpric);

                                System.out.println("your shop has been updated");
                                System.out.println(lol.usershop);
                                System.out.println(lol.userprice);
                                break;

                            }



                        }break;*/
   



}
