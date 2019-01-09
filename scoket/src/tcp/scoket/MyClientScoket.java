package tcp.scoket;


import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStreamReader;
import java.net.Socket;
/**
 * 1、创建客户端
 * @author fm
 *
 */
public class MyClientScoket {

	public static void main(String[] args) throws Exception {
		
		//1、创建客户端
		Socket client = new Socket("localhost",8888);
		//2、接受数据
		/*BufferedReader br = 
				new BufferedReader(new InputStreamReader(client.getInputStream()));
		String echo = br.readLine(); //阻塞式方法
		System.out.println(echo);*/
		DataInputStream dis = new DataInputStream(client.getInputStream());
		String echo = dis.readUTF();
		System.out.println(echo);
		
	}
}
