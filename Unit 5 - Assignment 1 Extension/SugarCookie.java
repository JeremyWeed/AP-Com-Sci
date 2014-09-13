public class SugarCookie
{
    private int ovenTemperature;// fahrenheit 
    
    // all of these ingrediants together make 12 cookies
    private int eggs = 2;
    private double flour = 3;   // cups
    private double sugar = .5;  // cups
    private double milk = 1;    // cups
    private int cookieCount = 12;
    //Automatically constructs a tray of 12 cookies.  
    //If you want a different amount you must call the adjustIngrediants method to verify if it is a legal amount
    public SugarCookie(int ovenTemperature)
    {
           this.ovenTemperature = ovenTemperature;   
    }
    
    /* Returns the ingrediants needed to make the cookie
       use the fields in the class to get the amount of each ingrediant */
    public String getIngrediants()
    {
        
        return "eggs: " + eggs + " flour: " + flour + " sugar: " + sugar + " milk: " + milk;
    }
    
    /* Returns a string that tells the user how to make the cookie, step by step
       use the ingrediant fields and the mix method to help you */
    public String getRecipe()
    {
        return mix(sugar +" sugars",  flour + " flours") + ", " + mix(milk + " milks" , eggs + " eggs") + ", and then mix both together. bake at " + ovenTemperature + ".  ???, profit";
    }
    
    /* Returns a string that tells the baker to mix the two ingrediants, for example
       if the caller passed in "2 eggs" and "3 cups of flour", then it should return:
       "Mix the 2 eggs and 3 cups flour together" */
    public String mix(String i1, String i2)
    {
        return "mix the " + i1 + " and the " + i2 + " together";
    }
    
    /* Adjusts the ingrediant fields for the amount of cookies that the caller wants
       to make. Check the cookieCount to ensure that it's possible. For example, it's
       impossible to make only 3 cookies because you can't split an egg in half. If
       the requested cookie amount is impossible, then don't update any of the fields
       and return false. If it's possible, then return true and update the fields */
    public boolean adjustIngrediants(int cookieCount)
    {
        this.cookieCount = (cookieCount%6 == 0) ? cookieCount: this.cookieCount;
        eggs = 2 /(12/cookieCount);
        flour = 3 / (12/cookieCount);
        sugar = .5 / (12/cookieCount);
        milk = 1/(12/cookieCount);
        return (cookieCount%6 == 0);
        
    }

    /* Return an "image" of the cookie represented with characters. You could make it
       as simple or as complex as you want. Here's just a basic sugar cookie example
       ___________
       |         |
       |         |
       |         |
       ¯¯¯¯¯¯¯¯¯¯¯
       If you want to get crazy, then check this out http://www.ascii-code.com/ and scroll
       down to the extended characters, that's where I got the ¯ character
     */
    public String[] getImage()
    {
       String[] s = {"__________",
               "|        |",
               "|        |",
               "|        |",
               "__________"} ;
               return s;
    }
    
    /* This should return the cook time, in minutes, based on the oven temperature and
       the amount of cookies that the caller wants to bake. You can use whatever algorithm
       you want to get the time, it doesn't really matter. Just make it reasonable. */
    public int getCookTime()
    {
        return ovenTemperature/((int) Math.PI * (int)Math.sqrt(9));
        
    }
    
    public int getEggs()
    {
        return eggs;
    }
    
    public double getFlour()
    {
        return flour;
    }
    
    public double getSugar()
    {
        return sugar;
    }
    
    public double getMilk()
    {
        return milk;
    }
    
    public String getTray(){
    String t = "";
    t += " _________________________________________________________________________________ \n";
        for(int i = 0; i < cookieCount/6; i++){          
            for (int e = 0; e < 5; e++){
                t += "|   ";
                for(int n = 0; n < 6; n++){
                    t += getImage()[e] + "   ";
                }
                t += "|\n";
            }
        }
           t += " _________________________________________________________________________________ \n";
           return t;
    }
    
}