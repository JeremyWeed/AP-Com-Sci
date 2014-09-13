public class Text implements Sendable{
    String sender;
    
    public Text(String s){
        sender = s;
    }
    
    public void sendMessage(String contents, String recip){
        System.out.println("sending a text to " + recip + " saying " + contents);
    }
    
    public String getSender(){
        return sender;
    }
}