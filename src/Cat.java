public class Cat extends Animals{
    static int catCount = 0;

    Cat(String name) {

        super(name);
        catCount++;
    }

    void swim (int distance) {

    }

    void run(int distance) {
        if(distance <= 200) System.out.println(name + " пробежал" + distance + " метров");
        else
        {
            System.out.println(name + "столько пробежать не сможет");
        }
    }
}
