public class Fruit {
    private String color;
    private String size;
    private double weight;

    public Fruit(){
    }

    public Fruit(String color, String size, double weight)
    {
        this.weight = weight;
        this.color = color;
        this.size = size;
    }

    public void stale(int staleRate){
        System.out.println("The fruit is getting stale.");
        System.out.println("Stale rate is "+ staleRate +" out of 10");
    }

    public void discoloration(int rate){
        System.out.println("The fruit is getting discolorated.");
        System.out.println("Fruit discoloration is " + rate + " out of 10");
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", weight=" + weight +
                '}';
    }


}