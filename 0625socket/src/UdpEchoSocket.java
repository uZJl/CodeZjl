import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * Created by JiaLe on 2021/6/25 16:13
 */
public class UdpEchoSocket {
    // 对于一个服务器来说，核心流程分为两步：
    // 1.进行初始化操作（实例化socket对象）
    // 2.进入主循环，接受并处理请求（主循环是一个死循环）
    //
    private DatagramSocket socket = null;

    public UdpEchoSocket(int port) throws SocketException {
        //绑定端口
        socket = new DatagramSocket(port);
    }

    public void start() throws IOException {
        System.out.println("服务器启动");
        while (true) {
            //a. 读取请求并解析
            DatagramPacket requestPacket = new DatagramPacket(new byte[4096], 4096);
            socket.receive(requestPacket);
            String request = new String(requestPacket.getData(),
                    0,requestPacket.getLength()).trim();
            //b. 根据请求计算响应
            String reponse = process(request);
            //c. 把响应写回客户端，响应数据就是response，需要包装成一个Packet对象
            DatagramPacket responsePacket = new DatagramPacket(reponse.getBytes(),
                    reponse.getBytes().length, requestPacket.getSocketAddress());

            socket.send(responsePacket);

            //打印请求日志
            System.out.printf("[%s:%d] req: %s; resp: %s\n",requestPacket.getAddress().toString(),
                    responsePacket.getPort(), request, reponse);
        }
    }

    private String process(String request) {
        //此处是一个echo server (回显)，请求数据是啥，相应内容就是啥
        //如果是一个更复杂的服务器，此处就需要包含很多的业务逻辑来进行具体计算
        return request;
    }
}
