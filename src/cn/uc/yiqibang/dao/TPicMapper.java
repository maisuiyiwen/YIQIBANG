package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.TPic;
import cn.uc.yiqibang.bean.TPicExample;
import cn.uc.yiqibang.utils.Result;

import java.util.List;

public interface TPicMapper {
   
    int deleteByPrimaryKey(Integer id);

    
    int insert(TPic record);

   
    Result insertSelective(TPic record);

   
    List<TPic> selectByExample(TPicExample example);

 
    TPic selectByPrimaryKey(Integer id);

 
    int updateByPrimaryKeySelective(TPic record);

  
    int updateByPrimaryKey(TPic record);
    
    Result deleteByCondition(TPic pic);
}