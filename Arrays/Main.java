import java.util.*;
public class Main
{
    static Scanner scan = new Scanner(System.in);
    public static void main(String args[]){
        System.out.println("Welcome to Jeremy's Nvidia Graphics Card Stats Program.");
        System.out.println("I have informtion on cards from the 560ti to the 780");
        while(true){
        System.out.println("What would you like to know? (just type the stuff in the parentheses)");
        System.out.println("cheapest,(cheap) most powerful(power), least amount of power draw(powerdraw), most connectors(connections),");
        System.out.println("average price(price), most RAM(mRAM), average RAM clock(RAMc), average RAM(aRAM),");
        System.out.println("most power for power draw(powerforpower), standard devaition in price{stddev), and most bang for your buck(buck)");
        String s = scan.next();
        switch (s){
            case "cheap":
                System.out.println("The " + cheapest() + " is the cheapest");
                break;
            case "power":
                System.out.println("The " + mostPowerful() + " is the most powerful");
                break;
            case "powerdraw":
                System.out.println("The " + leastPowerDraw() + " draws the least amount of power");
                break;
            case "connections":
                System.out.println("The  " + mostConnectors() + " has the most connectors for your displays");
                break;
            case "price":
                System.out.println("The average price of all the cards is " + avgPrice() + " dollars");
                break;
            case "mRAM":
                System.out.println("The " + mostRAM() + " has the most RAM");
                break;
            case "RAMc":
                System.out.println("The average RAM clock of the cards is " + avgRAMClock() + " MHz");
                break;
            case "aRAM":
                System.out.println("The average amount of RAM in a card is " + avgRAM() + " Gbs");
                break;
            case "powerforpower":
                System.out.println("The " + powerForPower() + " has the most graphical power for the electricity it uses");
                break;
            case "buck":
                System.out.println("Enter your minimum price: ");
                String s2 = scan.next();
                String s3;
                
                try{
                    s3 = bangForBuck(Integer.parseInt(s2));
                }catch(Exception e){
                    s3 = bangForBuck();
                }
                System.out.println("The " + s3 + " would most likely have the most power for the lowest price");
                break;
            case "stddev":
                System.out.println("The standard deviation in price is " + stdDev());
                break;
            case "jeremyspick":
                System.out.println("That GTX 770 looks real nice");
                break;
            }
            System.out.println();
        }
        
    }
    //what card is cheapest
    public static String cheapest (){
        double low = Stuff.stats[Stuff.price][Stuff.gtxTitan];
        int card = 0;
        int current = 0;
        for (int i = 0; i< Stuff.stats.length; i++){

            if (low > Stuff.stats[i][Stuff.price]){
                low = Stuff.stats[i][Stuff.price];
                card = current;
            }
            current++;
        }
        return Stuff.names[card];
    }
        //what card is the most powerful
    public static String mostPowerful (){
        double power = 0;
        int card = 0;
        int current = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            double core = Stuff.stats[i][Stuff.coreClock] + Stuff.stats[i][Stuff.boostClock];
            core = core/2;
            core += Stuff.stats[i][Stuff.coreCount];
            core = core/2;
            if (power < core){
                card = current;
                power = core;
            }
            current++;
        }
        return Stuff.names[card];
    }
        //what card requires the least amount of watts
    public static String leastPowerDraw (){
        double low = 0;
        int card = 0;
        int current = 0;
        for (int i = 0; i< Stuff.stats.length; i++){

            if (low > Stuff.stats[i][Stuff.powerReq]){
                low = Stuff.stats[i][Stuff.powerReq];
                card = current;
            }
            current++;
        }
        return Stuff.names[card];
    }
    //wha t card has trhe most connections
    public static String mostConnectors(){
        double max = 0;
        int card = 0;

        for (int i = 0; i < Stuff.stats.length; i++){
            double con = Stuff.stats[i][Stuff.DVI] + Stuff.stats[i][Stuff.HDMI] + Stuff.stats[i][Stuff.displayPort];
            if (con > max){
                max = con;
                card = i;
            }
        }
        return Stuff.names[card];
    }
    //averrage prcie of the cards
    public static double avgPrice(){
        double total = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            total += Stuff.stats[i][Stuff.price];
        }
        return total/Stuff.stats.length;
    }
    //which cartd has the most RAM
    public static String mostRAM(){
        double low = 0;
        int card = 0;
        
        for (int i = 0; i< Stuff.stats.length; i++){

            if (low > Stuff.stats[i][Stuff.RAM]){
                low = Stuff.stats[i][Stuff.RAM];
                card = i;
            }
           
        }
        return Stuff.names[card];
    }
    //average RAM clock speed
    public static double avgRAMClock(){
        double total = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            total += Stuff.stats[i][Stuff.memoryClock];
        }
        return total/Stuff.stats.length;
    }
    //average amount of ram
    public static double avgRAM(){
        double total = 0;
         for (int i = 0; i < Stuff.stats.length; i++){
            total += Stuff.stats[i][Stuff.RAM];
        }
        return total/Stuff.stats.length;
    }
    //greatest grpahical power for wattage used
    public static String powerForPower(){
        double ratio = 0;
        int card = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            double cRatio = Stuff.stats[i][Stuff.coreClock] + Stuff.stats[i][Stuff.boostClock];
            cRatio = cRatio/2;
            cRatio += Stuff.stats[i][Stuff.coreCount];
            cRatio = cRatio/2;
            cRatio = cRatio/Stuff.stats[i][Stuff.powerReq];
            if (ratio < cRatio){
                ratio = cRatio;
                card = i;
            }
        }
        return Stuff.names[card];
    }
    //greatest graphical power for the smallest price
    public static String bangForBuck(){
        double ratio = 0;
        int card = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            double cRatio = Stuff.stats[i][Stuff.coreClock] + Stuff.stats[i][Stuff.boostClock];
            cRatio = cRatio/2;
            cRatio += Stuff.stats[i][Stuff.coreCount];
            cRatio = cRatio/2;
            cRatio = cRatio/Stuff.stats[i][Stuff.price];
            if (ratio < cRatio){
                ratio = cRatio;
                card = i;
            }
        }
        return Stuff.names[card];
    }
    //same as above, but min is the minmun amount you wish to spend
     public static String bangForBuck(int min){
        double ratio = 0;
        int card = 0;
        for (int i = 0; i < Stuff.stats.length; i++){
            double cRatio = Stuff.stats[i][Stuff.coreClock] + Stuff.stats[i][Stuff.boostClock];
            cRatio = cRatio/2;
            cRatio += Stuff.stats[i][Stuff.coreCount];
            cRatio = cRatio/2;
            cRatio = cRatio/Stuff.stats[i][Stuff.price];
            if (ratio < cRatio && Stuff.stats[i][Stuff.price] > min){
                ratio = cRatio;
                card = i;
            }
        }
        return Stuff.names[card];
    }
    //standard deviation of the price of the cards
     public static double stdDev(){
            double avg = avgRAM();
            double sum = 0;
            
            for (int i = 0; i < Stuff.stats.length; i++){
            sum += (Stuff.stats[i][Stuff.price]-avg) * (Stuff.stats[i][Stuff.price]-avg);
            }
            return Math.sqrt(sum/(Stuff.stats.length - 1));
        }
}
