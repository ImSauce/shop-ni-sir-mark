    //=====================================================================================================\\
   //?==============================[   SAMUEL JAMES A. CINCO   ]===========================================\\
  //=========================================================================================================\\
 //?==========================[   GRADE 11    BLOCK 2   BERNERS   ]===========================================\\
//=============================================================================================================\\


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class main 
{

        public ArrayList <String> usershop = new ArrayList<>();
        public ArrayList <Double> userprice = new ArrayList<>();
    
    
    public static void main(String[] args)  
    {
        mon mund = new mon();
        main lol = new main();


       


    
        

        System.out.println("\n\n");
        //*==========[ VARIABLES ]================================================================================================================================
        
                    int    choose        ;
                    String login = ""    ;
                    double money = 0     ;
                    double totalspent = 0;
                    int    pass = 0      ;
                    String barsbruh = "=================================================================================================================";
                    String welcome =    "                    [] Welcome to the Mundae Shop, %s []\n\n";
                    String purchase =                        "(Enter amount of in-game coins you want to purchase )";
                    String balance =                         "( You have [ %,5.2f ]  coins in your account balance )\n";
                    String spent =                           "( Your total spent is [ %,5.2f ] coins )\n";
                    String thanks =         "                [] Thank you for visiting the Mundae Shop, %s []\n";
                    String access = "\n                           [    YOU CAN NOW ACCESS THE BLACK MARKET   ]\n";
                    String out =    "\n                           [    YOU HAVE LOGGED OUT FROM THE BLACKMARKET   ]\n";
                    String incognito ="                            [ YOU ENABLED INCOGNITO MODE ]";
                    String fencebruh ="*****************************************************************************************************************";
                    

        //*=======================================================================================================================================================



        menus.Mundae ();

        Scanner choose1=new Scanner(System.in);

        choose = choose1.nextInt();

        if (choose == 1) 
            {
                System.out.println("\n");
                System.out.println("Login :");
            }
        else
            {
                System.exit(0);
            }

        Scanner user=new Scanner(System.in);
        login = user.nextLine();
        boolean empty = login.isEmpty();

        if (empty == true)
            {
                System.out.println(incognito);
                login = "nameless User";
            }
        
        System.out.println(fencebruh);
        System.out.printf(welcome,login);

        while (true) 
            {
                menus.menu ();
                

                int choice = user.nextInt(); 

                switch (choice) 
                {
                    case 1: 
                    {
                        System.out.println(purchase);
                        double income  = user.nextInt();
                        menus.purchase1(income);
                        money += income;
                        break;
                    }




                    case 2: 
                    {
                        System.out.println(barsbruh);
                        System.out.printf(balance,money);
                        break;
                    }




                    case 3: 
                    {
                        System.out.println(barsbruh);
                        System.out.printf(spent,totalspent);
                        break;
                    }


        


                    case 4: 
                    {

                        
                        double buy = money; 
                        buy = mund.shop(buy,pass); 
                        double total = money - buy;
                        totalspent += total ;
                        money = buy; 
                        break;
                        
                    }

                    

                    case 5:
                    {

                        System.out.println(barsbruh+"\n");
                        System.out.printf(thanks,login);
                        System.out.println("\n"+barsbruh);
                        System.out.println("\n\n");
                        System.exit(0);
                        break;

                    }







                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 69:
                    System.out.println("\n"+barsbruh);
                    System.out.println(access);
                    pass += 1;
                    break;


                    case 100:
                    System.out.println("\n"+barsbruh);
                    System.out.println(out);
                    pass = 0;
                    break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


                }
            }
    
            
    }
}
