import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\java\\test.txt");
            int i;
            while((i = fis.read()) != -1){
                System.out.print((char) i);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }



        /*try {
            FileOutputStream fos = new FileOutputStream("C:\\java\\test.txt", true);
            String text = "hello world";
            byte[] buffer = text.getBytes();
            fos.write(buffer);
        } catch (Exception e) {
            e.printStackTrace();
        }*/


        /*Scanner scanner = new Scanner(System.in);
        try {
            int a = scanner.nextInt();
            System.out.println(5/a);
        }catch (Exception e){
            e.printStackTrace();
        }

        System.out.println("Программа работает нормально");*/

        /*ArrayList<String> cars = new ArrayList<>();
        cars.add("audi");
        cars.add("bmw");
        cars.add("kia");
        System.out.println(cars);
        cars.remove("bmw");
        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println(cars.get(0));*/
    }
}
