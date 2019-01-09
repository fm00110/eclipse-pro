package com.ncu.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

/**
 * Servlet implementation class UploadServlet
 */
@WebServlet("/uploadServlet")
@MultipartConfig    //表明当前Servlet可以处理文件的上传和下载
public class UploadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		//String path = this.getServletContext().getRealPath("images");  //获取服务端保存上传文件的目录路径
		String path = "D:\\";
		//从请求中获取Multipart请求中的上传部分文件对象
		Part part = request.getPart("photo");
		
		//获取指定的头部属性
		String header = part.getHeader("content-Disposition");
		System.out.println(header);
		//对字符串进行解析
		int index = header.indexOf("filename=");//找到filename=之后的索引号，可以用substring方法截取
		//System.out.println(index);  25
		//注意在不同的浏览器下的filename可能不同，需要自己解析，有些浏览器可能会将文件的目录一起写入
		//所以截取时要将那些目录名都删掉
		String filename = header.substring(index+28,header.length()-1);
		System.out.println(filename);
		
		part.write(path+"/"+filename);
	}

}
