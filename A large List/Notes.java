import java.util.*;

public class Notes{
    
    static ArrayList<String> list = new ArrayList<String>();
    
    public static void main(String[] args){
        list.add("sam is better at math than me");
        list.add("go deigo go");
        list.add("teddy is so kawaii");
        System.out.println(list.set(2, "haha, nope"));
        System.out.println(list);
    }
}