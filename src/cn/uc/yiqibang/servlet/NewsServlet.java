package cn.uc.yiqibang.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.uc.yiqibang.dao.TNewsMapper;
import cn.uc.yiqibang.dao.impl.NewsMapperImpl;
import cn.uc.yiqibang.utils.Result;
import cn.uc.yiqibang.utils.WriteResultToClient;
import net.sf.json.JSONObject;


@WebServlet("/NewsServlet")
public class NewsServlet extends BaseServlet {
	private static final long serialVersionUID = 2901354022165043875L;
       
    TNewsMapper newsDao=new NewsMapperImpl();
    
    public void getAllNews(HttpServletRequest request,HttpServletResponse response){
    	System.out.println("getAllNews");
    	Result result =newsDao.selectAll();
    	String jsonObj=JSONObject.fromObject(result).toString();
    	
    	
    	try {
			response.getWriter().println(jsonObj);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}    	
    }
    
    public void adminDeleteNewsById(HttpServletRequest request,HttpServletResponse response){
    	int newsid=Integer.parseInt(request.getParameter("id"));
    	Result result =newsDao.deleteByPrimaryKey(newsid);
    	WriteResultToClient.writeMethod(result, response);
    }
    
 

}
