package url;

import java.net.MalformedURLException;
import java.net.URL;

public class UrlDemo {

	public static void main(String[] args) throws MalformedURLException {
		URL url = new URL("http://www.baidu.com:80/indet.html");
		System.out.println(url.getProtocol());
		System.out.println(url.getPath());
		System.out.println(url.getPort());
		System.out.println(url.getHost());
	}
}
