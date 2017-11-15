package cn.uc.yiqibang.servlet;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;





public class BaseServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// ��ȡ���������action,��ȷ�û�����Ҫ����servlet����һ��������������
        String action=request.getParameter("action");
	    if(action==null||"".equals(action)){//û�л�ȡ��action��˵���û������ʱ��û�����action����
	    	response.getWriter().println("��������Ƿ�������Я��action������ͼ��");
	    }else{
	    	System.out.println("�û�Ҫ���еĲ���"+action);
	        //��BaseServlet�������У��Ѿ���������صĲ�����������������Ҫ����action���е���
	    	//ʹ�÷�����ƣ���ȡ��action������Ȼ����þͿ�����
	   
		try {
			  Method method = this.getClass().getMethod(action,HttpServletRequest.class,HttpServletResponse.class);
			  if(method!=null){
		    	  method.invoke(this,request,response);
		      }else{
		    	  response.getWriter().println("�����������û�иò���");
		      }
		      
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalArgumentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	    
	    }
        
        
        
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
