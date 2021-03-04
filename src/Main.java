public class Main {




    public static void main(String[] args) {



        Dog dog = new Dog("Бобик");
        Dog dog2 = new Dog("Бобик");
        Dog dog3 = new Dog("Бобик");
        Cat cat = new Cat("Мурзик");
        Animals dogs = new Dog("Олег");
        Animals cats = new Cat("Леха");

        System.out.println(cat.catCount);
        System.out.println(dog.dogCount);

        System.out.println(dogs.animalsCount);


    }
}
