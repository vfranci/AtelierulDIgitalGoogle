package basics.ch1;

public class FizzBuzz {

    public static void main(String[] args) {
        for (int i=1;i<=100;i++) {
            if(i%3==0 && i%5==0) {
                System.out.println("FIZZBUZZ");
                continue;

            }

            if(i%3==0) {
                System.out.println("FIZZ");
                continue;
            }
            if(i%5==0) {
                System.out.println("BUZZ");
                continue;

            }
            System.out.println(i + " ");

        }
    }
}