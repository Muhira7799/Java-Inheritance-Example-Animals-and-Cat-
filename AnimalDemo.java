class Animals {
    String name;
    
    void eat() {
        System.out.println("Animals can eat");
    }
}

class Cat extends Animals {
    int legs;

    void move() {
        System.out.println("Cat can move");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.name = "Bob";
        System.out.println("Cat name is: " + c.name);
        c.eat();

        c.legs = 4;
        System.out.println("Legs: " + c.legs);
        c.move();
    }
}