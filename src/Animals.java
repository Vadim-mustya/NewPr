abstract class Animals {
    static int animalsCount  = 0;

    String name;
    Animals(String name) {
        animalsCount++;
        this.name = name;
    }


    abstract void swim(int distance);
    abstract void run(int distance);


}
