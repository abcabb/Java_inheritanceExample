public class Main{
    public static void main(String[] args){
        Fruit fruit1 = new Fruit("pink", "big", 5.5);
        infoFruit(fruit1, 8, 9);

        Watermelon watermelon1 = new Watermelon("Juicy",
                "So sweet", true, "Big", 10.4);
        infoFruit(watermelon1, 2, 3);
    }

    public static void infoFruit(Fruit fruit, int discolorRate,int staleRate){
        System.out.println(fruit);
        fruit.stale(staleRate);
        fruit.discoloration(discolorRate);
        System.out.println("_________________");
    }
}