/*
 * 
 * import java.util.Scanner;
public class menus 
{
    String bar = "=================================================================================================================";
    String mainmenu = "            [0] BACK TO MAIN MENU ";
    String successbought= "$$ bought [ %,1d ] %s for < %,1.2f > coins $$\n";
    String insuffecient = "\n[ insufficient balance ]";
    String success = "\n         [ Transaction successful ]";   
    String enteramount = "( enter the amount of [ %s ] you want to purchase )\n";
    String wordcode = "I have dipped my balls in sulfuric acid";




   
    

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


    public static void bars ()
    {
        menus men = new menus();
        System.out.println(men.bar);
        System.out.println(men.mainmenu);
        System.out.println(men.bar);
    }

    
    

    public static double ho (double coin, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        double coins = 0 ;
        coins = coins + coin;
        System.out.println("2coins: " + coins);

        System.out.printf(men.enteramount,obj.weaponName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.weapons[wn]) 
        {
            double weapon = obj.weapons[wn];
            weapon = weapon * buy; 

            if (coins >= weapon)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.weaponName[wn ],weapon);
                    coins=coins - weapon;
                    System.out.println("3coins: " + coins);               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                } 
            
        }  

    else if (coins < obj.weapons[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }

        System.out.println("4coins: " + coins);
        

        return coins;
    }




    public static double ho2 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.gearName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.gear[wn]) 
        {
            double gear = obj.gear[wn];
            gear = gear * buy; 

            if (coins >= gear)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.gearName[wn ],gear);
                    coins=coins - gear;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.gear[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }


    public static double ho3 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.potionName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.potion[wn]) 
        {
            double potion = obj.potion[wn];
            potion = potion * buy; 

            if (coins >= potion)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.potionName[wn ],potion);
                    coins=coins - potion;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.potion[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }


    public static double ho4 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.CompanionName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.companion[wn]) 
        {
            double companion = obj.companion[wn];
            companion = companion * buy; 

            if (coins >= companion)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.CompanionName[wn ],companion);
                    coins=coins - companion;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.companion[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }


    public static double ho5 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.bookName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.book[wn]) 
        {
            double book = obj.book[wn];
            book = book * buy; 

            if (coins >= book)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.bookName[wn ],book);
                    coins=coins - book;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.book[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }



    public static double ho6 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.craftName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.craftprice[wn]) 
        {
            double craftprice = obj.craftprice[wn];
            craftprice = craftprice * buy; 

            if (coins >= craftprice)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.craftName[wn ],craftprice);
                    coins=coins - craftprice;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.craftprice[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }



    public static double ho7 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.musicName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.musicprice[wn]) 
        {
            double musicprice = obj.musicprice[wn];
            musicprice = musicprice * buy; 

            if (coins >= musicprice)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.musicName[wn ],musicprice);
                    coins=coins - musicprice;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.musicprice[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }


    public static double ho8 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.toyName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.toyprice[wn]) 
        {
            double toyprice = obj.toyprice[wn];
            toyprice = toyprice * buy; 

            if (coins >= toyprice)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.toyName[wn ],toyprice);
                    coins=coins - toyprice;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.toyprice[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }



    public static double ho9 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);

        System.out.printf(men.enteramount,obj.memeName[wn ]);
        int buy = user.nextInt(); 
        

        
        if (coins >= obj.memeprice[wn]) 
        {
            double memeprice = obj.memeprice[wn];
            memeprice = memeprice * buy; 

            if (coins >= memeprice)
                {
                    System.out.println(obj.success);
                    System.out.printf(obj.successbought,buy,obj.memeName[wn ],memeprice);
                    coins=coins - memeprice;               
                    
                }

            else 
                {
                    System.out.println(obj.insuffecient);
                }
            
        }  

    else if (coins < obj.memeprice[wn] )
        {
            System.out.println(obj.insuffecient);
            
        }
        

        return coins;
    }



    public static double ho10 (double coins, int wn)
    {
        baligya obj = new baligya();
        menus men = new menus();
        Scanner user=new Scanner(System.in);


        System.out.printf(men.enteramount,obj.blackmarket[wn]);
        int buy = user.nextInt(); 

        Scanner use=new Scanner(System.in);
        System.out.println("                password:");
        
        String password = use.nextLine();

        if (password.equalsIgnoreCase(men.wordcode))
        {

            if (coins >= obj.blacksale[wn]) 
            {
                double blacksale = obj.blacksale[wn];
                blacksale = blacksale * buy; 

                if (coins >= blacksale)
                    {
                        System.out.println(obj.success);
                        System.out.printf(obj.successbought,buy,obj.blackmarket[wn ],blacksale);
                        coins=coins - blacksale;               
                        
                    }

                else 
                    {
                        System.out.println(obj.insuffecient);
                    }
                
            }  

            else if (coins < obj.blacksale[wn] )
            {
                System.out.println(obj.insuffecient);
                
            }
        

        }

        else
        {
            System.out.println("             [wrong password]");
        }   
        

        return coins;
    }


}

 */
