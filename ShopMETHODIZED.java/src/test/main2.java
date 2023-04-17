package test;
    //=====================================================================================================\\
   //?==============================[   SAMUEL JAMES A. CINCO   ]===========================================\\
  //=========================================================================================================\\
 //?==========================[   GRADE 11    BLOCK 2   BERNERS   ]===========================================\\
//=============================================================================================================\\


import java.util.Scanner;

import main;
import menus;
import mon;

public class main2 
{

  
    
    public static void main(String[] args)  
    {
        mon mund = new mon();
        main lol = new main();
    
        

        System.out.println("\n\n");
        //*==========[ VARIABLES ]================================================================================================================================
        
                    int    choose        ;
                    int authorization = 1       ;
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
                    String bawal = "                        you have lost the rights to purchase in the mundae Shop";
                    String black =                   "You are now BLACK listed, you have lost the rights to purchase in the mundae Shop";
                    String white =                  "you have regained your privileges to purchase in the mundae shop";
                    String no = "                   YOU CURRENTLY HAVE LOW SOCIAL CREDIT SCORE TO BUY IN THE MUNDAE SHOP";
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
                if (authorization == 1)
                {
                    menus.menu ();
                }
                else 
                {
                    System.out.println(barsbruh+"\n\n");
                    System.out.println(no);
                    System.out.println("\n\n"+barsbruh);
                }
                

                int choice = user.nextInt(); 

                switch (choice) 
                {
                    case 1: 
                    {
                        if (authorization == 1) 
                        {
                            System.out.println(purchase);
                            double income  = user.nextInt();
                            menus.purchase1(income);
                            money += income;
                            break;
                        }
                        else 
                        {
                        System.out.println(bawal);
                        }
                        break;
                    }




                    case 2: 
                    {
                        if (authorization == 1) 
                        {
                            System.out.println(barsbruh);
                            System.out.printf(balance,money);
                            break;
                        }
                        else 
                        {
                        System.out.println(bawal);
                        }
                        break;
                    }




                    case 3: 
                    {
                        if (authorization == 1) 
                        {
                            System.out.println(barsbruh);
                            System.out.printf(spent,totalspent);
                            break;
                        }
                        else 
                        {
                        System.out.println(bawal);
                        }
                        break;
                    }


                

                    case 4: 
                    {
                        if (authorization == 1) 
                        {
                            double buy = money; 
                            buy = mund.shop(buy,pass); 
                            double total = money - buy;
                            totalspent += total ;
                            money = buy; 
                            break;
                        }
                        else 
                        {
                        System.out.println(bawal);
                        }
                        break;
                    }
                    



                    case 5: 
                    {
                        if (authorization == 1) 
                        {
                            System.out.println(barsbruh+"\n");
                            System.out.printf(thanks,login);
                            System.out.println("\n"+barsbruh);
                            System.out.println("\n\n");
                            System.exit(0);
                            break;
                        }
                        else 
                        {
                        System.out.println(bawal);
                        }
                        break;
                        
                    }







                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
                    case 69:
                    if (authorization == 1) 
                    {
                        System.out.println("\n"+barsbruh);
                        System.out.println(access);
                        pass += 1;
                        break;
                    }
                    else 
                    {
                    System.out.println(bawal);
                    }
                    break;


                    case 100:
                    if (authorization == 1) 
                    {
                        System.out.println("\n"+barsbruh);
                        System.out.println(out);
                        pass = 0;
                        break;
                    }
                    else 
                    {
                    System.out.println(bawal);
                    }
                    break;
                    

                    case 1619:
                    authorization = 0;
                    System.out.println(black);
                    break;


                    case 1865:
                    authorization = 1;
                    System.out.println(white);
                    break;
                    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

                }
            }
    
            
    }
}
