package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by JiaLe on 2021/4/15 21:29
 */
public class MyHTTP {
    private static final int port = 9004;

    public static void main(String[] args) throws IOException {
        //创建一个服务器
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器已启动~");

        //等待客户端连接
        Socket socket = serverSocket.accept();

        //构建读写对象
        try(
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(socket.getOutputStream());
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(socket.getInputStream()));
                ) {
            //得到客户端信息
            //得到首行信息
            String firstLine = reader.readLine();
            String[] firstLineArr = firstLine.split(" ");
            //方法类型
            String method = firstLineArr[0];
            //uri
            String uri = firstLineArr[1];
            //http版本号
            String httpVersion = firstLineArr[2];

            System.out.println(String.format("首行信息 -> 方法类型：%s,URI：%s,HTTP版本号：%s",
                    method, uri, httpVersion));

            //构建返回内容
            String content = "";
            if (uri.contains("404")) {
                content = "<h1>没有找到此页面</h1>";
            } else if (uri.contains("200")) {
                content = "<h1>你好，世界</h1>";
            }

            //内容输出

        }

    }
}
