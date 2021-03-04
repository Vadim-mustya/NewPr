class Dog extends Animals{

    static int dogCount = 0;

    Dog(String name) {

        super(name);
        dogCount++;
    }

    void swim (int distance) {
        if (distance <= 10) System.out.println(name+" проплыл "+ distance+ " метров");
        else
        {
            System.out.println(name+ " столько проплыть не сможет");
        }
    }

    void run(int distance) {
        if(distance <= 500) System.out.println(name + " пробежал" + distance + " метров");
        else
        {
            System.out.println(name + "столько пробежать не сможет");
        }
    }



}
