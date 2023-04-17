   //=====================================================================================================\\
   //===============================[   SAMUEL JAMES A. CINCO   ]===========================================\\
  //=========================================================================================================\\
 //===========================[   GRADE 11    BLOCK 2   BERNERS   ]===========================================\\
//=============================================================================================================\\


/*
 * 
 * import java.util.Scanner;

public class mon extends baligya
{
           
            
            //MY METHODS YOO
              
        public static double shop (double monar,int pass)  
        {
            baligya obj = new baligya();
           
            Scanner user=new Scanner(System.in);
           
            //*==========[ VARIABLES ]=============================================================================================================================================
           
            int [] counter = 
            {
                1, //1 item type
                1, //2 weapon
                1, //3 armor
                1, //4 consumable
                1, //5 companion
                1, //6 books
                1, //7 crafting
                1, //8 music
                1, //9 toys
                1, //10 memes
                1, //11 blacklisted            
            };

            double coins = 0;
            coins = coins + monar;
            int selectweapon=0;
            String formatString = "\t[%-2d]\t%-60s\t<%,15.2f  >  |  [%-2d]\n";
            
            
            
           
           
            String bar = "=================================================================================================================";
            String mainmenu = "            [0] BACK TO MAIN MENU ";
            String ba = "=";
            String barname ="============[ %s TYPES ]=======================================================================================\n";
            String market ="============[ BLACK MARKET SALES ]===============================================================================";
           
            //*====================================================================================================================================================================    
            
            System.out.printf(barname,obj.Shope[0]);
            for (int i = 0; i < obj.Shoptype.length ; i++) 
            {                
                System.out.printf("\t    [%1d] %s\n",counter[0], obj.Shoptype[i]);                  
                counter [0] = counter[0] + 1;
            }
            if (pass > 0) 
            {
                System.out.printf("\t    [%1d] BLACKMARKET\n",counter[0]);
            }
            System.out.println(bar);   
            int selectType = user.nextInt();
       
            switch (selectType) 
            {
                case 1:

                System.out.printf(barname,obj.Shope[1]);
                    for (int i = 0; i < obj.weaponName.length ; i++) 
                    {                  
                        System.out.printf(formatString, counter[1], obj.weaponName[i], obj.weapons[i],counter[1]);               
                        counter [1] = counter[1] + 1;
                    }

                    menus.bars();
                    
                    selectweapon = user.nextInt();
           
                    for (int wn = 0 ; wn != obj.weaponName.length ; wn ++)
                    {
                        if( wn == selectweapon - 1) 
                        { System.out.println("1coins: " + coins);
                            double buy = coins;            
                            menus.ho(buy,wn);         
                            coins = buy; 
                            System.out.println("5coins: " + coins);
                        }

                    } 
                    break;
                            
           
        
                case 2:
                    
                System.out.printf(barname,obj.Shope[2]);
                    for (int i = 0; i < obj.gearName.length ; i++) 
                    {                       
                        System.out.printf(formatString, counter[2], obj.gearName[i],obj. gear[i],counter[2]);                       
                        counter [2] = counter[2] + 1;
                    }       
                     menus.bars();
        
                    selectweapon = user.nextInt();                  
                    
                    for (int an = 0 ; an != obj.gearName.length ; an ++)
                    {            
        
                        if( an == selectweapon - 1) 
                        {            
                            menus.ho2(coins,an);           
                        }
                    } 
                    break;
                
            
                case 3: 

                System.out.printf(barname,obj.Shope[3]);
                    for (int i = 0; i < obj.potionName.length ; i++) 
                    {
                        System.out.printf(formatString, counter[3],obj. potionName[i], obj.potion[i],counter[3]);                        
                        counter [3] = counter[3] + 1;
                    }       
                    menus.bars();
        
                    selectweapon = user.nextInt(); 
                    
                    for (int pn = 0 ; pn !=obj. potionName.length ; pn ++)
                    {
    
                        if( pn == selectweapon - 1) 
                        {  
                            menus.ho3(coins,pn);
        
                        }
                    } 
                    break;
                


                 case 4: 
                    
                    System.out.printf(barname,obj.Shope[4]);
                    for (int i = 0; i <  obj.CompanionName.length ; i++) 
                    {            
                        System.out.printf(formatString, counter[4], obj.CompanionName[i],obj. companion[i], counter[4]);                        
                        counter [4] = counter[4] + 1;
                    }       
                    menus.bars();
        
                    selectweapon = user.nextInt();
                            
                    for (int pn = 0 ; pn !=obj. CompanionName.length ; pn ++)
                    {
                         if( pn == selectweapon - 1) 
                            {
                               menus.ho4(coins,pn);
                                        
                                 
                            }
                    } 
                    break;



                 case 5: 

                    System.out.printf(barname,obj.Shope[5]);
                    for (int i = 0; i < obj. bookName.length ; i++) 
                    {                        
                        System.out.printf(formatString, counter[5], obj.bookName[i],obj. book[i],counter[5]);                       
                        counter [5] = counter[5] + 1;
                    }        
                    menus.bars();
        
                    selectweapon = user.nextInt();
                    
                    for (int pn = 0 ; pn !=obj. bookName.length ; pn ++)
                    { 
                        if( pn == selectweapon - 1) 
                        {                                   
                        menus.ho5(coins, pn);
                        }
                    } 
                    break;


                    case 6: 

                    System.out.printf(barname,obj.Shope[6]);
                    for (int i = 0; i < obj. craftName.length ; i++) 
                    {                 
                        System.out.printf(formatString, counter[6], obj.craftName[i],obj. craftprice[i],counter[6]);                 
                        counter [6] = counter[6] + 1;
                    }
        
                    menus.bars();
        
                    selectweapon = user.nextInt();
        
                    
                    for (int pn = 0 ; pn !=obj. craftName.length ; pn ++)
                    {
                        
        
                        if( pn == selectweapon - 1) 
                        {
                            menus.ho6(coins, pn);
                        }
                    } 
                    break;




                    case 7: 

                    System.out.printf(barname,obj.Shope[7]);
                    for (int i = 0; i < obj. musicName.length ; i++) 
                    { 
                        System.out.printf(formatString, counter[7], obj.musicName[i],obj. musicprice[i],counter[7]);    
                        counter [7] = counter[7] + 1;
                    }
                    menus.bars();
        
                    selectweapon = user.nextInt();
        
                    for (int pn = 0 ; pn !=obj. musicName.length ; pn ++)
                    {
                        if( pn == selectweapon - 1) 
                        {
                            menus.ho7(coins, pn);
                              
                        }
                    } 
                    break;



                    case 8: 

                    System.out.printf(barname,obj.Shope[8]);
                    for (int i = 0; i < obj. toyName.length ; i++) 
                    {   
                        System.out.printf(formatString, counter[8], obj.toyName[i],obj. toyprice[i],counter[8]);     
                        counter [8] = counter[8] + 1;
                    }
                    menus.bars();
        
                    selectweapon = user.nextInt();
        
                    for (int pn = 0 ; pn !=obj. toyName.length ; pn ++)
                    {
                        if( pn == selectweapon - 1) 
                        {
                           menus.ho8(coins, pn);
                        }
                    } 
                    break;


                    case 9: 

                    System.out.printf(barname,obj.Shope[9]);
                    for (int i = 0; i < obj. memeName.length ; i++) 
                    { 
                        System.out.printf(formatString, counter[9], obj.memeName[i],obj. memeprice[i],counter[9]);                     
                        counter [9] = counter[9] + 1;
                    }      
                    menus.bars();
        
                    selectweapon = user.nextInt();
                      
                    for (int pn = 0 ; pn !=obj. memeName.length ; pn ++)
                    {  
                        if( pn == selectweapon - 1) 
                        {
                           menus.ho9(coins, pn);
                        }
                    } 
                    break;


                    case 10: 

                    System.out.println(market);
                    for (int i = 0; i < obj.blackmarket.length ; i++) 
                    {    
                        System.out.printf(formatString, counter[10], obj.blackmarket[i],obj.blacksale[i],counter[10]);                    
                        counter [10] = counter[10] + 1;
                    } 
                    menus.bars();
        
                    selectweapon = user.nextInt();

                    if (pass > 0)
                    {
                        for (int pn = 0 ; pn !=obj.blackmarket.length ; pn ++)
                        {
                            if( pn == selectweapon - 1) 
                            {
                                menus.ho10(coins, pn);                
                            }
                        } 
                        break;
                    }

                    else 
                    {
                        menus.warning();
                        coins = -999999999 ;
                    }        
                                   
            }
        return coins;
        }
}
             
 * 
 */
