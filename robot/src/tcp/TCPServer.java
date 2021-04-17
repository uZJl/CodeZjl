package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLOutput;

/**
 * Created by JiaLe on 2021/4/15 19:26
 * tcp服务器端
 */



public class TCPServer {
    //端口号
    private static final int port = 9002;

    public static void main(String[] args) throws IOException {
        //1.创建并启动TCP服务器
        ServerSocket serverSocket = new ServerSocket(port);
        System.out.println("服务器已启动");
        //2.等待客户端的链接
        Socket clientSocket = serverSocket.accept();
        //当执行到这一步，表示已经有客户端连接
        System.out.println(String.format("已经有客户端连接了，IP：%s，端口号：%d",
                clientSocket.getInetAddress().getHostAddress(),clientSocket.getPort()));


        //try-resourse
        try(
                BufferedWriter writer = new BufferedWriter(
                        new OutputStreamWriter(clientSocket.getOutputStream()));
                BufferedReader reader = new BufferedReader(
                        new InputStreamReader(clientSocket.getInputStream()));
                ) {
                //3.收发消息
                while (true) {
                    String clientMsg = reader.readLine();
                    if (clientMsg != null && !clientMsg.equals("")) {
                        System.out.println("接收到客户端的信息" + clientMsg);


                        String serverMsg = "我收到了";
                        writer.write(serverMsg + "\n"); // \n 不能省略
                        // 发送缓冲区刷新操作【执行此步骤意味着里面将缓冲区的消息发送出去】
                        writer.flush();
                    }
                }
        }
    }
}
