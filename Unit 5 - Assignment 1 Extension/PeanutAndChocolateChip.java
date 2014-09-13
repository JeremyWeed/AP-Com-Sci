public class PeanutAndChocolateChip extends Chip{
    

    
    private int chip2;
    
    public PeanutAndChocolateChip(int oT, int c, int c2){
        super(oT,c);
        chip2 = c2;
    }
    @Override
    public String getIngrediants(){
        return super.getIngrediants() + "Peanut Chips: " + chip2;
    }
    @Override
    public String getRecipe(){
        return super.getRecipe() + ", add " +chip2 + " peanut chips too";
    }
    @Override
    public String[] getImage(){
        String[] s =  {"__________" ,
               "| o 0  o |" ,
               "| 0  o  o|" ,
               "|  o o  0|" ,
               "__________" };
               return s;
            }
   
   public int getPChips(){
       return chip2;
   }
}
