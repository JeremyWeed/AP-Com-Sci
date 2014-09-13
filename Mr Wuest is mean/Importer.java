import java.io.*;
import java.util.*;
public class Importer{
    BufferedReader f;
    
    public Importer(String s){
        try{
            f = new BufferedReader(new FileReader(s));
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    
    public ArrayList<String> importIt(){
        ArrayList<String> s = new ArrayList<String>();
        String line = null;
        try{
        while((line = f.readLine()) != null){
            s.add(line.trim());
        }
        }catch(Exception e){
            e.printStackTrace();
        }
        return s;
    }
    
    
}