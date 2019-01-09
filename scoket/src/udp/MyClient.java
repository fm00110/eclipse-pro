package udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 客户端
 * 1、创建客户端
 * 2、准备数据
 * 3、打包（发送的地点及端口）
 * 4、发送
 * @author fm
 *
 */
public class MyClient {

	public static void main(String[] args) throws Exception {
		//1、创建客户端
		DatagramSocket ds = new DatagramSocket(6666);
		
		// 2、准备数据
		String msg = "网络编程";
		byte[] data = msg.getBytes();
		//3、打包（发送的地点及端口）
		DatagramPacket dp = 
				new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
		ds.send(dp);
		ds.close();
		
		
	}
}
