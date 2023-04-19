package UDP01;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;


public class ReceiveMessageDemo {
    public static void main(String[] args) throws IOException {
        //接收数据


        //1. 创建DatagramSocket对象（快递公司）
        //绑定端口，以后我们就是通过这个端口接收
        //而且绑定的端口一定要和数据发去的端口一致
        DatagramSocket ds = new DatagramSocket(10086);


        //2. 接收数据包
        byte[] bytes = new byte[1024];
        DatagramPacket dp = new DatagramPacket(bytes, bytes.length);
        ds.receive(dp); //该方法是阻塞的，程序执行到这一步的时候会死等，直到接收到发送端的数据


        //3. 解析数据
        byte[] data = dp.getData();
        int len = dp.getLength();
        InetAddress address = dp.getAddress();
        int port = dp.getPort();

        System.out.println("Got Data: " + new String(data, 0, len));
        System.out.println("Data comes from: " + address + ", port: " +port);

        //4. 释放资源
        ds.close();

    }


}
