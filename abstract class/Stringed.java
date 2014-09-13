public class Stringed extends Instrument
{
    public void play(){
        System.out.println("play() for the Stringed class");
    }
    public String toString(){
        return "Stringed";
    }
    public void adjust(){
        System.out.println("adjust() for the Stringed class");
    }
}