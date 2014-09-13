public class Sam implements Hearable, Movable, Comparable{
    int l;
    
    public Sam(int l){
        this.l = l;
    }
    
    public void move(){
        System.out.println("sam waddles");
    }
    
    public int speak(){
        System.out.println((l>HUMAN_HEARING_THRESHOLD) ? "my GPA is 4.0" : (l>40) ? "baldjfga/sdlk'akg" : (l<10) ? "shh" : "");
        return l;
    }
    
    public int compareTo(Object o){
        Sam h = (Sam) o;
        return (h.speak()>this.speak())? -1 : (h.speak()==this.speak()) ? 0 : 1;
    }
}
    