public class Module4_3 {
    public static void main(String[] args) {
        Dog doggy = new Dog();
        Cat kitty = new Cat();
        doggy.catchCat(kitty);
        Human firstHuman = new Human();
        Human secondHuman = new Human((byte) 26, "Nick", "Ivanov", "football");
        Human thirdHuman = new Human((byte) 36, "Alex", "Petrov");
    }
}

interface Animal {
    void sayHello();

}

class Cat implements Animal {

    @Override
    public void sayHello() {
        System.out.println("Мяу!");
    }
}

class Dog implements Animal {

    @Override
    public void sayHello() {
        System.out.println("Гав!");
    }

    public void catchCat(Cat cat) {
        System.out.println("Кошка поймана");
        sayHello();
        cat.sayHello();
    }
}

class Human {
    int age;
    String name;
    String secondName;
    String favoriteSport;

    public Human() {
    }

    public Human(byte age, String name, String secondName, String favoriteSport) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
        this.favoriteSport = favoriteSport;
    }

    public Human(byte age, String name, String secondName) {
        this.age = age;
        this.name = name;
        this.secondName = secondName;
    }
}
