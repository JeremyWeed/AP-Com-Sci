public class Skype implements Sendable{
   String sender;
   
   public Skype(String s){
       sender = s;
   }
    
   public void sendMessage(String contents, String recip){
       System.out.println("sending a skype message to " + recip + " saying " + contents);   
    }
    
    public String getSender(){
        return sender;
    }
}
    