package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.TComment;
import cn.uc.yiqibang.bean.TCommentExample;
import cn.uc.yiqibang.utils.Result;

import java.util.List;

public interface TCommentMapper {
   
    int deleteByPrimaryKey(Integer id);

    
    int insert(TComment record);

  
    int insertSelective(TComment record);

   
    List<TComment> selectByExample(TCommentExample example);

   
    TComment selectByPrimaryKey(Integer id);

    
    int updateByPrimaryKeySelective(TComment record);

  
    int updateByPrimaryKey(TComment record);
    
    Result deleteByCondition(TComment comm);
}