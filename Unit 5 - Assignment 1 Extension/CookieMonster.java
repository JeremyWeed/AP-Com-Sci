public class CookieMonster
{
    public static void main(String[] args)
    {
        Sprinkles s = new Sprinkles(200, 12);
        SugarCookie c = new SugarCookie(180);
        PeanutAndChocolateChip j = new PeanutAndChocolateChip(196, 12, 34);
        Chip p = new Chip(210, 2);
        System.out.println(p.getChips());
        System.out.println(s.getCookTime());
        System.out.println(s.getImage());
        System.out.println(j.getImage());
        System.out.println(j.getRecipe());
        System.out.println(j.getTray());
    }
    
   
}
