public class Watermelon extends Fruit{
    private String juicy;
    private String sweetTaste;
    private boolean seed;

    public Watermelon(String juicy, String sweetTaste, boolean seed,
                      String size, double weight)
    {
        super("Yellow-White-(Red)", size, weight);
        this.juicy = juicy;
        this.sweetTaste = sweetTaste;
        this.seed = seed;
    }

    @Override
    public String toString() {
        return "Watermelon{" +
                "juicy='" + juicy + '\'' +
                ", sweetTaste=" + sweetTaste +
                ", seed='" + seed + '\'' +
                "} " + super.toString();
    }

    @Override
    public void stale(int staleRate){
        super.stale(staleRate);
        watermelonStale(staleRate);
    }

    @Override
    public void discoloration(int rate){
        super.discoloration(rate);
        watermelonDiscoloration(rate);
    }

    private void watermelonStale(int rate){
        if(rate>7)
            System.out.print("Watermelon is stinks. ");
        else if(rate<8 && rate>3)
            System.out.println("Watermelon is edible.");
        else
            System.out.println("Watermelon is fresh.");
    }

    private void watermelonDiscoloration(int rate){
        if(rate > 7)
            System.out.println("Watermelon looks like a ghost.");
        else if(rate<8 && rate>3)
            System.out.println("Watermelon looks fine.");
        else
            System.out.println("The colors are beautiful!");
    }
}
