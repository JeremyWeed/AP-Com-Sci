import java.util.*;
public class AssigOne{
    ArrayList<Character> vowel = new ArrayList<Character>(Arrays.asList('a','e','i','o','u'));

    public double averageVowels(ArrayList<String> l){
        double size = 0;
        double v = 0;
        if (l.size() == 0){
            return 0;
        }else{
            for(int i = 0; i < l.size(); i++){
                size += l.get(i).length();
                for (int e = 0; e < l.get(i).length(); e++){
                    for (int y = 0; y < vowel.size(); y++){
                        if(l.get(i).charAt(e) == vowel.get(y)){
                            v++;
                    }
                }
            }
            }
        }
        return v/size;
    }
    
    public ArrayList<String> swapPairs(ArrayList<String> l){
        if (l.size() == 1 || l.size() == 0){
            return l;
        }
        for (int i = 1; i <= l.size(); i += 2){
            String temp = l.get(i -1);
            l.set(i - 1, l.get(i));
            l.set(i, temp);
        }
        return l;
    }
    
    public ArrayList<Integer> intersect (ArrayList<Integer> one, ArrayList<Integer> two){
        ArrayList<Integer> three = new ArrayList<Integer>();
        for (int i = 0; i < one.size(); i++){
            for (int e = 0; e < two.size(); e++){
                if(one.get(i) == two.get(e)){
                    three.add(one.get(i));
                }
            }
            
        }
        return three;
    }
    
    public ArrayList<String> removeEvenLength(ArrayList<String> l){
        for (int i = 0; i < l.size(); i++){
            if (l.get(i).length()%2 == 0){
                l.remove(i);
            }
        }
        return l;
    }
    
    public ArrayList<String> doubleList(ArrayList<String> l){
        for (int i = 0; i < l.size(); i += 2){
            l.add(i,l.get(i));
        }
        return l;
    }
    
    public ArrayList<Integer> minToFront(ArrayList<Integer> l){
        int e = l.get(0);
        for (int i = 0; i < l.size(); i++){
             if(e > l.get(i)){
                 e = l.get(i);
                }
            }
        l.remove(l.indexOf(e));
        l.add(0,(Integer)e);
        
        return l;
    }
    
    public ArrayList<String> removeDuplicates(ArrayList<String> l ){
         for (int i = 0; i < l.size(); i++){
             for(int e = 0; e < l.size(); e++){
                 if (l.get(i).equals(l.get(e)) && e != i){
                     l.remove(e);
                     e--;
                    }
                }
            }
            return l;
        }
        
    public ArrayList<String> stutter(ArrayList<String> l, int k){
        if(k <= 0){
            l.clear();
        }else{
            for (int i = 0; i < l.size() * k; i += k){
                for (int e = 0; e < k - 1; e++){
                    l.add(i ,l.get(i));
                }
            }
        }
        return l;
    }
}








































