package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.concurrent.BlockingDeque;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/CommentServlet")
public class CommentServlet extends BaseServlet {
	private static final long serialVersionUID = 1L;
       
     //����һ������
     public void insertComment(HttpServletRequest request,HttpServletResponse response){
    	 String content=request.getParameter("content");
    	 System.out.println("ִ�в������۲���,��������Ϊ"+content);
    	 PrintWriter out=null;
    	 try {
			out=response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 out.println("����ɹ�"+content);
    	   	 
     }
     
     //ɺ��һ������
     public void deleteComment(HttpServletRequest request,HttpServletResponse response){
    	 String commId=request.getParameter("commId");
    	 System.out.println("ִ��ɾ�����۲�����Ҫɾ�����۵�idΪ"+commId);
    	 PrintWriter out=null;
    	 try {
			out =response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 out.println("ɾ���ɹ�"+commId);
     }
     
     
     
     
     
     
     

}
