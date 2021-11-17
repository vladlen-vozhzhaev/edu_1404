import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\java\\ip.txt");
            int i;
            String result = "";
            while ((i=fis.read()) != -1){
                if(i==13) continue; // Пропускаем код 13 (перенос каретки)
                else if(i==10){ // Код 10 (перенос строки)
                    String[] ipAndPort = result.split(":"); // ["202.152.51.44", "8080"]
                    result="";
                    String ip = ipAndPort[0];
                    int port = Integer.parseInt(ipAndPort[1]);
                    checkProxy(ip, port);
                }else if(i == 9){ // Код 9 (табуляция)
                    result += ":";
                }else{
                    result += (char) i;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void checkProxy(String ip, int port){
        System.out.println("Проверяю "+ip+":"+port);
        try {
            Proxy proxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress(ip, port));
            URL url = new URL("https://vozhzhaev.ru/test.php");
            URLConnection urlConnection = url.openConnection(proxy); // Подключение к Web-серверу
            BufferedReader in = new BufferedReader(
                    new InputStreamReader(
                            urlConnection.getInputStream()));
            String inputLine;

            while ((inputLine = in.readLine()) != null)
                System.out.println(inputLine+" - работает");

        } catch (Exception e) {
            System.out.println(ip+" не работает");
        }
    }
}
