package tcp.scoket;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
/**
 * 1、创建服务器，指定端口new ServerSocket(8888)
 * 2、接受客户端的连接，阻塞式
 * 3、发送数据
 * @author fm
 *
 */
public class MutiServer {

	public static void main(String[] args) throws Exception {
		//1、创建服务器，指定端口new ServerSocket(8888)
		ServerSocket server = new ServerSocket(8888);
		//2、接受客户端的连接，阻塞式
		
		while(true) {
		Socket socket = server.accept();
		System.out.println("一个客户端建立连接");
		
		/*String msg = "欢迎使用";
		
		DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
		dos.writeUTF(msg);
		dos.flush();*/
		}
	}
}
