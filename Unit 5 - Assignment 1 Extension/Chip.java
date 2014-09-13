public class Chip extends SugarCookie{
    
    private int chips;
    
    public Chip(int oT, int c){
        super(oT);
        chips = c;
    }
    @Override
    public String getIngrediants(){
        return super.getIngrediants() + "Chocolate Chips: " + chips;
    }
    @Override
    public String getRecipe(){
        return super.getRecipe() + ", add " +chips + " Chocolate Chips";
    }
    @Override
    public String[] getImage(){
        String[] s = {"__________", 
               "| o    o |", 
               "|    o   |" ,
               "|  o    o|" ,
               "__________" };
               return s;
            }
   
   public int getChips(){
       return chips;
   }
}
