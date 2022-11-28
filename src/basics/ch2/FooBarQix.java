package basics.ch2;
import java.util.Scanner;
public class FooBarQix {
    static String compute(int a){
        String s = "";
        if(a%3==0){
            s=s.concat("Foo");
        }
        if(a%5==0){
            s=s.concat("Bar");
        }
        if(a%7==0){
            s=s.concat("Qix");
        }

        int x = 0;
        while(a!=0){
            x=x*10+(a%10);
            a=a/10;
        }

        while(x!=0){
            if(x%10==3){
                s=s.concat("Foo");
            }
            if(x%10==5){
                s=s.concat("Bar");
            }
            if(x%10==7){
                s=s.concat("Qix");
            }
            x=x/10;
        }
        return s;
    }

    static String compute2(int a){
        String s = "";
        if(a%3==0){
            s=s.concat("Foo");
        }
        if(a%5==0){
            s=s.concat("Bar");
        }
        if(a%7==0){
            s=s.concat("Qix");
        }

        int x = 0;
        while(a!=0){
            x=x*10+(a%10);
            a=a/10;
        }

        while(x!=0){
            if(x%10==3){
                s=s.concat("Foo");
            }
            if(x%10==5){
                s=s.concat("Bar");
            }
            if(x%10==7){
                s=s.concat("Qix");
            }
            if(x%10==0){
                s=s.concat("*");
            }
            x=x/10;
        }
        return s;
    }

    public static void main(String[] args) {
        int a;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter any number: ");
        a = scan.nextInt();
        String s = compute(a);
        String s2 = compute2(a);
        System.out.println(s);
        System.out.println(s2);
    }
}
