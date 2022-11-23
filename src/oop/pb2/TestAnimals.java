package oop.pb2;

public class TestAnimals {
    public static void main(String[] args) {
        Fish d = new Fish();
        Cat c = new Cat("Fluffy");
        Animal a = new Fish(); //se face upcasting automat
        Animal e = new Spider();
        Pet p = new Cat();

        d.eat();
        d.walk();
        d.setName("Pestisorul de aur");
        System.out.println(d.getName());
        System.out.println();

        c.setName("Tommy");
        System.out.println(c.getName());
        c.eat();
        c.walk();
        c.play();
        System.out.println();

        a.eat();
        a.walk();
        System.out.println();

        e.eat();
        e.walk();
        System.out.println();

        p.setName("Miti");
        System.out.println(p.getName());
        p.play();
        System.out.println();

    }
}
