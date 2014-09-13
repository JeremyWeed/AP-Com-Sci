public class Dog implements Hearable, Movable{
    int volume;
    public Dog (int l){
        volume = l;
    }
    
    public void move(){
        System.out.println("Dogs run");
    }
    
    public int speak(){
        System.out.println((volume>HUMAN_HEARING_THRESHOLD) ? "bark bark woof" : (volume > 40) ? "barkabrkbakrbasdfla;sdjf" : (volume < 10) ? "" : "bark" );
        return volume;
    }
}
    