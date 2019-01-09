package udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 服务端
 * 1、创建服务端
 * 2、准备接受容器
 * 3、封装成包
 * 4、接受数据
 * 5、分析数据
 * @author fm
 *
 */
public class MyServer {

	public static void main(String[] args) throws IOException {
		//1、创建服务端
		DatagramSocket ds = new DatagramSocket(8888); 
		//2、准备接受容器
		byte[] cont = new byte[1024];
		//3、封装成包
		DatagramPacket dp = new DatagramPacket(cont, cont.length);
		//4、接受数据￥￥$$
		ds.receive(dp);
		//5、分析数据
		byte[] data = dp.getData();
		int len = dp.getLength();
		System.out.println(new String(data,0,len));
		
		//6、释放资源
		ds.close();
	}
}
