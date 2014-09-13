public class Race
{
    public static void main(String[] args) throws Exception
    {
        Cycle[] cycles = { new Unicycle("Uni"), new Tricycle("Tri"), new Road("Road", 5, "Mongoose"), new Mountain("Mount", 5, "what" ) };
        
        startRace(cycles);
    }
    
    public static void printCycleProgress(Cycle c)
    {
        System.out.print(c.getB() + ":\t");
        
        for (int i = 0; i < c.getP() / 5; i++)
            System.out.print("*");
        System.out.println();
    }
    
    public static void startRace(Cycle[] cycles) throws Exception
    {
        for (;;)
        {
            System.out.print("\f");
            
            // make all the cycles move
            for (Cycle c : cycles)
            {
                c.move();
                printCycleProgress(c);
            }
            
            // check to see if any of them have won
            for (Cycle c : cycles)
            {
                if (c.getP() >= 200)
                {
                    System.out.println( c.getB() + c.getP());
                    System.out.println("\nCycle " + c.getB() + " won!");
                    for(Cycle e: cycles){
                        System.out.println( e.getB() + e.getP());
                    }
                    return;
                }
            }
            
            
            Thread.sleep(500);
        }
    }
}
