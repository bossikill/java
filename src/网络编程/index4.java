package 网络编程;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

//使用HttpURLConnection发送GET请求
public class index4 {
    //Web服务网址
    static String urlString = "http://www.51work6.com/service/mynotes/WebService.php?" +
            "email=550476877@qq.com&type=JSON&action=query";

    public static void main(String[] args) {
        BufferedReader br = null;
        HttpURLConnection conn = null;

        try {
            URL reqURL = new URL(urlString);
            conn = (HttpURLConnection) reqURL.openConnection();
            conn.setRequestMethod("GET");

            //打开网络通信输入流
            InputStream is = conn.getInputStream();
            //通过is创建InputStreamReader对象
            InputStreamReader isr = new InputStreamReader(is, "utf-8");
            //通过isr创建BufferedReader对象
            br = new BufferedReader(isr);

            StringBuilder sb = new StringBuilder();
            String line = br.readLine();
            while (line != null) {
                sb.append(line);
                line = br.readLine();
            }
            //日志输出
            System.out.println(sb);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (conn != null) {
                conn.disconnect();
            }
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
