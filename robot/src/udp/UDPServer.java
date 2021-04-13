package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;
import java.sql.SQLOutput;

/**
 * Created by JiaLe on 2021/4/13 20:52
 */
public class UDPServer {
    //端口号
    private static final int port = 9001;
    //数据最大值
    private static final int bleng = 1024;
    public static void main(String[] args) throws IOException {
        //1.启动一个udp服务器端(IP 端口号)
        DatagramSocket socket = new DatagramSocket(port);
        System.out.println("服务器已启动！");
        while(true) {
            //2.初始化数据包
            DatagramPacket clientPacket = new DatagramPacket(
                    new byte[bleng],
                    bleng
            );
            //3.等待客户端的链接
            socket.receive(clientPacket);
            //4.接收到客户端的信息
            String msg = new String(clientPacket.getData());
            System.out.println("接收到客户端的信息：" + msg);
            //给客户端一个响应
            String serMsg = "我收到了";
            //发送信息
            DatagramPacket serPacket = new DatagramPacket(
                    serMsg.getBytes(),
                    serMsg.getBytes().length,
                    clientPacket.getAddress(),
                    clientPacket.getPort()
            );
            socket.send(serPacket);
        }
    }
}
