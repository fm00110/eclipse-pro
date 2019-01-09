package scoketser;
/**
 * 封装了端口号，再InetAddress基础上+端口号
 * @author fm
 *
 */

import java.net.InetAddress;
import java.net.InetSocketAddress;

public class NetSocketDemo01 {

	public static void main(String[] args) {
		InetSocketAddress addr = new InetSocketAddress("14.215.177.39",8080);
		System.out.println(addr.getHostName());
		System.out.println(addr.getPort());
		InetAddress address = addr.getAddress();
		System.out.println(address.getHostAddress());
		System.out.println(address.getHostName());
	}
}
