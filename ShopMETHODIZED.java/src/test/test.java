package test;

import java.util.Scanner;

public class test
{


    
    public static void main(String[] args)  
    {
        
       
    

        System.out.println("\n\n");
        //*==========[ VARIABLES ]==================
        int choose ;
        String login = "";
        double money =0;
       

        //*=========================================



        Mundae ();



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
            login = "User";
        }
        

        System.out.println("[] Welcome to the Mundae Shop, " + login + " []");
        System.out.println("");

        while (true) 
        {
            menu ();

            int choice = user.nextInt(); 

            switch (choice) 
            {
                case 1: 
                {
                    System.out.println("( Enter amount of in-game coins you want to purchase )");
                    double income  = user.nextInt();
                    purchase1(income);
                    money += income;
                    break;
                }


                case 2: 
                {
                    System.out.println("( You have [ "+ money +" ] in your account balance )");
                    break;
                }
            

                case 3: 
                {

                    double buy = money; 
                    buy = shop(buy); 
                    money = buy; 
                    break;
                   
                }
                

                case 4: 
                {
                    System.exit(0);
                    break;
                }


                case 5: 
            }





        }

    }























    


    
public static void menu ()
{

    System.out.println("===========================================");
    System.out.println("");
    System.out.println("        [1] Buy In game Purchase");
    System.out.println("        [2] Account balance");
    System.out.println("        [3] Shop");
    System.out.println("        [4] Exit");
    System.out.println("        [5] Inventory");
    System.out.println("");
    System.out.println("===========================================");
}




public static void Mundae ()
{
    System.out.println("============================");
    System.out.println("");
    System.out.println("      Mundae Shopping    ");
    System.out.println("");
    System.out.println("        [1] Start");
    System.out.println("        [2] exit");
    System.out.println("");
    System.out.println("============================");

}




























   public static double purchase1 (double monar)
    {
        Scanner user=new Scanner(System.in);

        double result=0; 
        result = result + monar ;


        System.out.println("");
        System.out.println("            ( TRANSACTION SUCCESSFUL ) ");
        System.out.println("[ "+ monar +" ] coins has been added to your account");

        return result;

    }


    public static double shop (double monar)  
    {

        Scanner user=new Scanner(System.in);

        //*==========[ VARIABLES ]===============================================================================================


        int [] Winventory = {0,0,0};
        int [] Ainventory = {0,0,0};
        int [] Pinventory = {0,0,0};
        

        String [] Shoptype = {"WEAPONS", "GEAR", "CONSUMABLES" }; 
        String [] weaponName = {"Sword", "Shield", "Bow" };
        String [] gearName = {"Armor", "Helmet", "Underwear" };
        String [] potionName = {"Health potion", "Mana potion", "Fresh Hamburger Sandwhich with mustard and chili sauce" };


        double []weapons = {200, 100, 150 };
        double [] gear = {700, 400 , 900};
        double [] potion = {1000, 2000 , 5000};

        int [] counter = {1,1,1,1,1,1,1,1,1,1};
        double coins = 0;
        coins = coins + monar;
        int selectweapon=0;

        

        counter[0] = 1;
        counter[1] = 1;
        counter[2] = 1;
        counter[3] = 1;

        //*==========+===========================================================================================================
          
        





        System.out.println("============[ ITEM TYPES ]================");
        for (int i = 0; i < Shoptype.length ; i++) 
        {
            System.out.println("            ["+counter[0] +"] "+ Shoptype[i]);
                
            counter [0] = counter[0] + 1;
        }
        System.out.println("==========================================");

        int selectType = user.nextInt();



        switch (selectType) 
        {
            
            //!===================================[   WEAPON TYPES    ]===========================================================
            case 1: 
            System.out.println("============[ WEAPON TYPES ]================");
            for (int i = 0; i < weaponName.length ; i++) 
            {
            System.out.println("            ["+counter[1] +"] "+ weaponName[i] + " < " + weapons[i] + " >");
                
            counter [1] = counter[1] + 1;
            }

            System.out.println("==========================================");

            selectweapon = user.nextInt();
            
            
            
            
         
            for (int wn = 0 ; wn != weaponName.length ; wn ++)
            {
               

                if( wn == selectweapon - 1) 
                    {
                            

                            System.out.println("( enter the amount of ["+ weaponName[wn ] + "] you want to purchase )");
                            int buy = user.nextInt(); 
                                    
                            if (coins >= weapons[wn]) 
                                {
                                    double weapon = weapons[wn];
                                    weapon = weapon * buy;
                                    Winventory [wn] += buy;
                                   
                                    
                                    

                                    if (coins >= weapon)
                                        {
                                            System.out.println("\n[ Transaction successful ]");
                                            coins=coins - weapon;               
                                            break;

                                            
                                        }

                                    else 
                                        {
                                            System.out.println("\n[ insufficient balance ]");
                                        }

                                    break;
                                }  

                            else if (coins < weapons[wn] )
                                {
                                    System.out.println("\n[ insufficient balance ]");
                                    break;
                                }

                            else 
                            {
                                System.out.println("\n[ INVALID INPUT ]");
                                break;
                            }
                    }



            } 
            break;
                
        
       
    }



    
    return coins;

}






}