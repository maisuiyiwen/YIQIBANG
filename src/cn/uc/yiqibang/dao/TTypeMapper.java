package cn.uc.yiqibang.dao;

import cn.uc.yiqibang.bean.TType;
import cn.uc.yiqibang.bean.TTypeExample;
import cn.uc.yiqibang.utils.Result;

import java.util.List;

public interface TTypeMapper {
   

    
    List<TType> selectByExample(TTypeExample example);

  
    Result deleteByPrimaryKey(Integer id);
    
    Result insert(TType record);
    
    Result insertSelective(TType record);
    
    Result selectByPrimaryKey(Integer id);
    
    Result updateByPrimaryKeySelective(TType record);
    
    Result updateByPrimaryKey(TType record);
    
    Result selectAll();
    
    
}