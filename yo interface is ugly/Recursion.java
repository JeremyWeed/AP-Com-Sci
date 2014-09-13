public class Recursion implements Comparable{
    public void doThings(){
        doStuff();
    }
    
    public void doStuff(){
        changeThings();
    }
    
    public void changeThings(){
        things();
    }
    
    public void things(){
        doThings();
    }
    
    public int compareTo(Object o){
        if (o == this){
            return 1;
        }
        else return 12890;
    }
    
    public String toString(){
        return "because I can";
    }
}