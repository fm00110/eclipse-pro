package url;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * 获取资源，源代码
 * @author fm
 *
 */
public class UrlDemo02 {

	public static void main(String[] args) throws MalformedURLException {
		//获取网络流
		URL url = new URL("https://www.baidu.com");   //主页默认资源
		try {
			InputStream is = url.openStream();
			byte[] flush = new byte[1024];
			int temp =0;
			while((temp=is.read(flush)) != -1) {
				System.out.println(new String(flush,0,temp));
			}
			is.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
