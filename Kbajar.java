import java.util.Scanner;
public class Kbajar {
    public static void main(String[] args) {
        Scanner k = new Scanner(System.in);
        System.out.println("");
        System.out.println("");
        System.out.println("  \n **** Welcome To Koli's Bazar :) ****\n ");
        
        System.out.println("________________________________________________________________________\n");
        System.out.println("");
        int value;
        do {
            System.out.println("1] MenuCard \n2] End");
            value=k.nextInt();
            switch (value) {
                
                case 1: 

                    System.out.println("* Products * \n 1] Shoes \n 2] Cloths \n 3] Sunglasses \n 4] Mobiles \n  ");
                        int choice=k.nextInt();
                        System.out.println();
                        int puma=10000, nike=3000 , abibas=300 , kelwin=2500 , Lyvis=1500 , piterPiterson=500 , Raybone=1000 , Balkey=500 , Gussi=200 , Karbon=1000 , LAVA=5001 , iBall=3111;
                        int totalbill=0;
                        
                          switch (choice) {
                            case 1:
                                System.out.println("1] PUMA Price - 10000\n "+
                                                    "2]Nike Price - 3000\n"+
                                                    "3]Abibas Price - 300\n");
                                  
                                  int shoechoice=k.nextInt();
                                  
                                  if (shoechoice==1){
                                      System.out.print("You Purchase Puma Shoe");
                                      System.out.println(" Bill = "+puma);
                                      totalbill+=puma;
                                  }
                                  else if(shoechoice==2){
                                    System.out.print("You Purchase Nike Shoe");
                                    System.out.println(" Bill = "+nike);
                                    totalbill+=nike;
                                  }
                                  else if(shoechoice==3){
                                    System.out.print("You Purchase Abibas Shoe");
                                    System.out.println(" Bill = "+abibas);
                                    totalbill+=abibas;
                                  }

                                  System.out.println("Total Bill Of Shoe Shopping = "+totalbill);
                                
                                break;

                            case 2: 
                                  System.out.println("1]kelwin Price - 2500\n"+
                                                       "2] Lyvis Price - 1500\n"+
                                                        "3] piterPiterson Price - 500 "); 
                                    int clothchoice=k.nextInt();

                                  if(clothchoice==1){
                                      System.out.println("You purchase Kelwin cloths");
                                    System.out.println("Bill ="+kelwin);
                                    totalbill+=kelwin;
                                  }
                                  else if(clothchoice==2){
                                    System.out.println("You purchase Lyvis cloths");
                                    System.out.println("Bill ="+Lyvis);
                                    totalbill+=Lyvis;

                                  }
                                  else if(clothchoice==3){
                                    System.out.println("You purchase piterPiterson cloths");
                                    System.out.println("Bill ="+piterPiterson);
                                    totalbill+=piterPiterson;
                                  }
                                  System.out.println("Total Bill Of Cloths Shopping = "+totalbill);
                                  break;
                            
                            case 3: 
                                  System.out.println("1] Raybone Price - 1000\n"+
                                                      "2] Balkey Price - 500 \n"+
                                                        "3] Gussi Price - 200 ");

                                  int sunchoice=k.nextInt();

                                  if (sunchoice==1) {

                                    System.out.println("You purchase Raybone SunGlasses");
                                    System.out.println("Bill ="+Raybone);
                                    totalbill+=Raybone;                                    
                            
                                  }
                                  else if(sunchoice==2){
                                    System.out.println("You purchase Balkey SunGlasses ");
                                    System.out.println("Bill ="+Balkey);
                                    totalbill+=Balkey;
                                  }
                                  else if(sunchoice==3){
                                    System.out.println("You purchase Gussi SunGlsses");
                                    System.out.println("Bill ="+Gussi);
                                    totalbill+=Gussi;
                                  }
                                  System.out.println("Total Bill Of Sunglasses Shopping = "+totalbill);
                                  break;
                                
                            case 4: 
                                  System.out.println("1] Karbon Price - 1001 \n"+
                                                        "2] LAVA Price - 5001 \n "+
                                                          "3] iBall Price - 3111");
                                  int mobchoice =k.nextInt();
                                    if (mobchoice==1){
                                    System.out.println("You purchase Karbon Moblile");
                                    System.out.println("Bill ="+Karbon);
                                    totalbill+=Karbon;
                                    }
                                    else if(mobchoice==2){
                                    System.out.println("You purchase LAVA Moblile");
                                    System.out.println("Bill ="+LAVA);
                                    totalbill+=LAVA;
                                    }
                                    else if(mobchoice==3){
                                    System.out.println("You purchase iBall Moblile");
                                    System.out.println("Bill ="+iBall);
                                    totalbill+=iBall;

                                    }System.out.println("Total Bill Of Mobliles Shopping = "+totalbill);
                                    
                                    
                                    break;
                            default:
                                      System.out.println("* Products * \n 1] Shoes \n 2] Cloths \n 3] Sunglasses \n 4] Mobiles ");
                                break;
                        }
                      
                    
                        System.out.println("Tankuu for Shopping ");
                    break;
                
                 
                case 2: 
                        System.out.println(" Thankuu");
                    break;
                default: System.out.println(" ***** Plz Select number given below ***** ");
                System.out.println("\n");
                    break;
            }
            
        } while (value!=2);
           
    
   
        k.close();
    }
    
}
