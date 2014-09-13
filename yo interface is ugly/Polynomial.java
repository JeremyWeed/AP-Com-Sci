import java.util.*;

public class Polynomial
{

    public int[] equation;

    public  Vector <Integer> factorLast = new Vector <Integer>(0,1);
    public  Vector <Integer> factorFirst = new Vector <Integer>(0,1); 
    public  Vector <Double> possRoots = new Vector <Double> (0,1);
    public  Vector <Double> realRoots = new Vector <Double> (0,1);

    public Polynomial(int[] a){
        equation = a.clone();

        NO_TOUCHY();

    }

    public static void findFactors(Vector v, int a){
        for(int i = 1;  i <= Math.sqrt(Math.abs(a)); i++)
        {
            if(a % i == 0)
            {
                v.add(i);
                v.add(a/i);

            }
        }
    }

    public void findPossRoots(){
        Polynomial.findFactors(factorLast, equation[equation.length - 1]);
        Polynomial.findFactors(factorFirst, equation[0]);
        removeDupes(factorFirst);
        removeDupes(factorLast);
        for (int i = 0; i < factorFirst.size(); i++){
            for(int e = 0; e < factorLast.size(); e++){
                possRoots.add(((double)factorLast.get(e)/(double)factorFirst.get(i)));
            }
        }
        //I am an idiot
        int l = possRoots.size();
        for (int i = 0; i < l; i++){

            possRoots.add(-possRoots.get(i));
        }
        for (int i = 0; i < possRoots.size(); i++){
            

        }

    
    }

    public static boolean synDiv(int[] equa, double root){
        double current = equa[0];
        for (int i = 1; i < equa.length; i ++){
            current *= root;
            current += equa[i];
        }
        if(current == 0){
            return true;
        }else{
            return false;
        }
    }

    private void findRealRoots(){
        removeDupes(possRoots);
        for(int i = 0; i < possRoots.size(); i++){
            if(Polynomial.synDiv(equation, possRoots.get(i))){

                realRoots.add(possRoots.get(i));
            }
        }
    }

    public Vector getVRoots(){
        return realRoots;
    }

    public Double[] getARoots(){
        return realRoots.toArray(new Double[realRoots.size()]);
    }

    private void NO_TOUCHY(){
        findPossRoots();

        findRealRoots();
    }

    public static void removeDupes(Vector v)
    {
        for(int i=0;i<v.size();i++)
        {
            for(int j=0;j<v.size();j++)
            {
                if(i!=j)
                {
                    if(v.elementAt(i).equals(v.elementAt(j)))
                    {
                        v.removeElementAt(j);
                    }
                }
            }
        }
    }

            
    
}
