public class Ar{
    
    Percussion p = new Percussion();
    Wind w = new Wind();
    Stringed s = new Stringed();
    Woodwind wd = new Woodwind();
    Brass b = new Brass();
    Instrument[] in = {p,w,s,wd};
    
    public void main(){
        for (int i = 0; i < in.length; i++){
            in[i].toString();
        }
    }
}