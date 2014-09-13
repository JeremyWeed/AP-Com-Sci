public class Sprinkles extends SugarCookie{
    private int sprinkles;
    
    public Sprinkles(int oT, int s){
        super(oT);
        sprinkles = s;
    }
    @Override
    public String getIngrediants(){
        return super.getIngrediants() + "sprinkles: " + sprinkles;
    }
    @Override
    public String getRecipe(){
        return super.getRecipe() + "add "+ sprinkles + " sprinkles too";
    }
    @Override
    public String[] getImage(){
        String[] s = {"__________",
               "| .    . |" ,
               "|    .   |" ,
               "|  .    .|" ,
               "__________" };
               return s;
            }
   
   public int getSprinkles(){
       return sprinkles;
   }
}