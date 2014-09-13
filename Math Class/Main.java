
import java.util.*;
public class Main
{
    Scanner scan = new Scanner(System.in);
    Creature player = new Creature(10,5,5);
    int h = 10; 
    int a = 2;
    int l = 2;
    
    public static void main(String args[]){
       Main m = new Main();
       m.mainish();
    }
    
    public void attacked(Creature e){
        if (e.roll() < 5){
            player.health -= Math.sqrt(e.attack);
            System.out.println("critical miss");
            System.out.println("it does " + (int)Math.sqrt(e.attack) + " damage");
        }else if (e.roll() == 20){
            player.health -= Math.pow(e.attack, 1.25);
            System.out.println("critical hit");
             System.out.println("it does " + (int)Math.pow(e.attack, 1.25) + " damage");
        }else{
            player.health -= e.attack;
            System.out.println("it does " + e.attack + " damage");
        }
        
}

public void attack(Creature e){
    if (player.roll() < 5){
            e.health -= Math.sqrt(player.attack);
            System.out.println("critical miss");
             System.out.println("You do " +(int)Math.sqrt(player.attack) + " damage");
        }else if (e.roll() == 20){
            e.health -= Math.pow(player.attack, 1.25);
           
            System.out.println("critical hit");
            System.out.println("You do " +(int)Math.pow(player.attack, 1.25) + " damage");
        }else{
            e.health -= player.attack;
            System.out.println("You do " +player.attack + " damage");
        }
}
public void mainish(){
      System.out.println("You enter a forest.");
        System.out.println("You have a sword and a shield.");
        System.out.println("An orc stands across from you, what will you do?"); 
        
        
        while(Math.max(player.health + 1, 0) != 0)  {
            
            Creature enemy = new Creature(h, a, l);
            
            while(Math.max(enemy.health + 1, 0) != 0){
                System.out.println("attack/run");
                String s = scan.next();
            
            if(s.equals("attack")){
                System.out.println("You attack");
               
                attack(enemy);
                 if(enemy.health <= 0){
                    
                    break;
                }else{
                    System.out.println("enemy's health is " + enemy.health);
                }
                System.out.println("The enemy attacks");
                attacked(enemy); 
                 if(player.health <= 0){
                    System.out.println("you died");
                    break;
                }else{
                    System.out.println("your health is " + player.health);
                }
                
            }else if (s.equals("run")){
                System.out.println("You fall off a cliff and die");
                scan.next();
                System.exit(1);
            }
        }
        System.out.println("The enemy died");
        h++;
        a++;
        l++;
        System.out.println("A stronger orc takes his place");
            
        }
}
}


