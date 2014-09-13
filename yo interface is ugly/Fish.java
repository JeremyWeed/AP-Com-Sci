public class Fish implements Hearable, Movable{
    int l;
    
    public Fish(int l){
        this.l = l;
    }
    
    public void move(){
        System.out.println("Fish swim with fins");
    }
    
    public int speak(){
        System.out.println((l>HUMAN_HEARING_THRESHOLD) ? "blub blub" : (l>40) ? "blublublublublublublubl" : (l<10) ? "" : "blub");
        return l;
    }
}
    