package Frog;

public class FrogSimulation {
    public int[] testHops;
    public int nextHopIndex;
    private int goalDistance;
    private int maxHops;
    public FrogSimulation(int dist, int numHops)
    {
        goalDistance = dist;
        maxHops = numHops;
    }

    private int hopDistance()
    {
        return (int) ((Math.random()*maxHops)-maxHops);
    }

    public boolean simulate()
    {
        int hops = 0;
        for (int i = 0; i < maxHops; i++)
        {
            hops = hops + hopDistance();
            if (hops >= goalDistance)
            {
                return true;
            }
            if (hops < 0)
            {
                return false;
            }
        }
        return false;
    }

    public double runSimulations(int num)
    {
        int number = 0;
        for (int x = 0; x<num; x++)
        {
            boolean y = simulate();
            if (y == true)
            {
                number++;
            }
        }
        return number/num;
    }
}