import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(G(6));
        /*System.out.println(min(4,7));
        System.out.println(min(8,2));*/
        /*sayHi("ivan");
        sayHi("alex");*/
        /*System.out.println(f(5));
        System.out.println(f(6));
        System.out.println(f(3));*/
    }

    static void getExchange(int num){
        if(num >= 10){
            System.out.println(10);
            getExchange(num-10);
        }else if(num >= 5){
            System.out.println(5);
            getExchange(num-5);
        }else if(num >= 2){
            System.out.println(2);
            getExchange(num-2);
        }else if(num >= 1){
            System.out.println(1);
            getExchange(num-1);
        }
    }

    static int min(int a, int b){
        if (a<b){
            return a;
        }else{
            return b;
        }
    }

    static void sayHi(String name){
        System.out.println("hello "+name);
    }

    static int f(int x){
        return x*x;
    }

    static int F(int n){
        if (n > 2)
            return F(n-1) + G(n-2);
        else return n;
    }

    static int G(int n)
    {
        if (n > 2)
            return G(n-1) + F(n-2);
        else return n+1;
    }

    // G(6) = G(5) + F(4) = 10+7=17
    // G(5) = G(4) + F(3) = 6+4=10
    // G(4) = G(3) + F(2) = 4+2=6
    // G(3) = G(2) + F(1) = 3+1=4
    // F(3) = F(2) + G(1) = 2+2=4
    // F(4) = F(3) + G(2) = 4+3=7

}
