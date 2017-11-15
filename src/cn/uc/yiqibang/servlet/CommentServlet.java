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
       
     //插入一条评论
     public void insertComment(HttpServletRequest request,HttpServletResponse response){
    	 String content=request.getParameter("content");
    	 System.out.println("执行插入评论操作,评论内容为"+content);
    	 PrintWriter out=null;
    	 try {
			out=response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 out.println("插入成功"+content);
    	   	 
     }
     
     //珊瑚一条评论
     public void deleteComment(HttpServletRequest request,HttpServletResponse response){
    	 String commId=request.getParameter("commId");
    	 System.out.println("执行删除评论操作，要删除评论的id为"+commId);
    	 PrintWriter out=null;
    	 try {
			out =response.getWriter();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	 out.println("删除成功"+commId);
     }
     
     
     
     
     
     
     

}
