package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.TNews;
import cn.uc.yiqibang.bean.TNewsExample;
import cn.uc.yiqibang.utils.Result;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

public interface TNewsMapper {
   

   
    int insert(TNews record);

    
    Result insertSelective(TNews record);

   
    List<TNews> selectByExampleWithBLOBs(TNewsExample example);

   
    List<TNews> selectByExample(TNewsExample example);

  
    TNews selectByPrimaryKey(Integer id);

 
    int updateByPrimaryKeySelective(TNews record);

 
    int updateByPrimaryKeyWithBLOBs(TNews record);

   
    int updateByPrimaryKey(TNews record);
    
    //��ȡ��������
    Result selectAll();
    //ɾ������
    Result deleteByPrimaryKey(Integer id);

    //��������ͼƬ
    Result insertNewsPic(HttpServletRequest request);
    
    Result selectByLike(String likeStr);
    
    
    
    
    
    
    
    
    
}