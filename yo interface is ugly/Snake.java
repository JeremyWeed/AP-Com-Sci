public class Snake implements Hearable, Movable{
    int l;
    
    public Snake(int l){
        this.l = l;
    }
    
    public void move(){
        System.out.println("snakes slither");
    }
    
    public int speak(){
        System.out.println((l>HUMAN_HEARING_THRESHOLD) ? "ssss" : (l>40) ? "ssssssss" : (l<10) ? "" : "ss");
        return l;
    }
}
    