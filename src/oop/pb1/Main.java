package oop.pb1;

public class Main {
    public static void main(String[] args) {
        Fighter f1 = new Fighter("Fighter 1", 100, 20);
        Fighter f2 = new Fighter("Fighter 2", 100, 20);
        BoxingMatch bn = new BoxingMatch(f1, f2);
        System.out.println(bn.fight());
    }
}
