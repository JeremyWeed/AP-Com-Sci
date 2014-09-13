public class Pigeon implements Sendable{
    String sender;
    
    public Pigeon(String s){
        sender = s;
    }
    
    public void sendMessage(String contents, String recip){
        System.out.println("sending a pigeon to " + recip + " saying " + contents);
    }
    
    public String getSender(){
        return sender;
    }
}