package cn.uc.yiqibang.utils;

import java.io.IOException;
import java.io.InputStream;

import javax.xml.parsers.FactoryConfigurationError;

import org.apache.ibatis.builder.StaticSqlSource;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtils {
	//懒汉mos
     static SqlSessionFactory factory=null;
     static String config="config.xml";
     
     //获取应用唯一的factory对象
    private static SqlSessionFactory factory(){
       if(factory==null){
	
			InputStream is=MyBatisUtils.class.getClassLoader().getResourceAsStream(config);
		    factory= new SqlSessionFactoryBuilder().build(is);
       }
			
	  return factory;
    }
    
	
	public static SqlSession openSession(){
		return factory().openSession();
	}
	
}
