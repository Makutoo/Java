package InetAddress;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class MyInetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
        //1. 获取InetAddress的对象
        InetAddress address = InetAddress.getByName("192.168.1.100");
        System.out.println(address);

        String name = address.getHostName();
        System.out.println(name);

        String ip = address.getHostAddress();
        System.out.println(ip);
    }

}
