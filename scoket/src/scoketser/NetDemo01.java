package scoketser;

import java.net.InetAddress;
import java.net.UnknownHostException;
/**
 * 
 * @author fm
 *  不包含端口号
 */
public class NetDemo01 {

	public static void main(String[] args) throws UnknownHostException {
		//使用getLocalHost()方法创建的InetAddress对象
		InetAddress addr = InetAddress.getLocalHost();
		System.out.println(addr.getHostAddress());  //返回主机IP地址
		System.out.println(addr.getHostName());//返回主机名
		
		//根据域名获得InetAddress对象
		addr = InetAddress.getByName("www.baidu.com");
		System.out.println(addr.getHostAddress());//返回阿里巴巴服务器的IP地址
		System.out.println(addr.getHostName());//输出www.alibaba.com
		
		//根据IP获得InetAddress对象
		addr = InetAddress.getByName("14.215.177.39");
		System.out.println(addr.getHostAddress());
		System.out.println(addr.getHostName());//返回的是一个IP地址
	}
	
}
