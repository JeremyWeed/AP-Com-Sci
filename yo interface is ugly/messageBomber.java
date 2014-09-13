public class messageBomber{
    static Sendable s[] = {new Pigeon("Bill Clinton") , new Skype("Bill Gates"), new Text("Bill Nye")};
    
    public static void sendMessage(Sendable s, String r){
        for( int i = 0; i < 25; i ++){
            s.sendMessage("you just got bombed by " + s.getSender(), r);
        }
    }
    
    public static void main(String args[]){
        sendMessage(s[1], "diego");
    }
    
    
}