public class Race
{
    public static void main(String[] args) throws Exception
    {
        Cycle[] cycles = { new Unicycle("Adam"), new Tricycle("Bob"), new Unicycle("Rick") };
        
        startRace(cycles);
    }
    
    public static void printCycleProgress(Cycle c)
    {
        System.out.print(c.getName() + ":\t");
        
        for (int i = 0; i < c.getPosition() / 5; i++)
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
                if (c.getPosition() >= 200)
                {
                    System.out.println("\nCycle " + c.getName() + " won!");
                    return;
                }
            }
            
            Thread.sleep(500);
        }
    }
}
