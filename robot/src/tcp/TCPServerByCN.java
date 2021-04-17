package tcp;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by JiaLe on 2021/4/15 20:44
 */
public class TCPServerByCN {
    private static final String ip = "127.0.0.1";
    private static final int port = 9003;
    public static void main(String[] args) throws IOException {
        //1.创建服务器
        ServerSocket serverSocket = new ServerSocket(port);
        //2.等待客户端连接
        Socket socket = serverSocket.accept();
    }
}
