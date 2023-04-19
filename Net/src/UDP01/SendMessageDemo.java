package UDP01;


import java.io.IOException;
import java.net.*;

public class SendMessageDemo {
    public static void main(String[] args) throws IOException {
        //发送数据


        //1. 创建DatagramSocket对象（快递公司）
        //绑定端口，以后我们就是通过这个端口往外发送
        //空参数：所有可用端口中随机一个进行绑定
        //有参数：知道端口号绑定
        DatagramSocket ds = new DatagramSocket();


        //2.打包数据
        String str = "How are you?"; //不能直接发String
        byte[] bytes = str.getBytes();

        InetAddress address = InetAddress.getByName("127.0.0.1");
        int port = 10086;
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length, address, 10086);

        //3.发送数据
        ds.send(dp);

        //4.释放资源
        ds.close();
    }
}
