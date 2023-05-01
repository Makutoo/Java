package TCP01;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    //TCP协议，发送数据

    public static void main(String[] args) throws IOException {
        //1.创建Socket对象，在创建对象的同时连接服务端，如果连接不上，代码报错
        Socket socket = new Socket("127.0.0.1", 10000);

        //2.从连接通道中获取输出流
        OutputStream os = socket.getOutputStream();
        os.write("Hello".getBytes());

        //3.释放资源
        os.close();
        socket.close();
    }
}
