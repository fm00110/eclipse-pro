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
public class MutiClient {

	public static void main(String[] args) throws Exception {
		
		for(int i = 0;i<=10;i++) {
			Socket client = new Socket("localhost",8888);
		}
		
	}
}
