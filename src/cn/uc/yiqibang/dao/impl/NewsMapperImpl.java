package cn.uc.yiqibang.dao.impl;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.ibatis.session.SqlSession;

import cn.uc.yiqibang.bean.TComment;
import cn.uc.yiqibang.bean.TNews;
import cn.uc.yiqibang.bean.TNewsExample;
import cn.uc.yiqibang.bean.TPic;
import cn.uc.yiqibang.dao.TCommentMapper;
import cn.uc.yiqibang.dao.TNewsMapper;
import cn.uc.yiqibang.dao.TPicMapper;
import cn.uc.yiqibang.utils.Constants;
import cn.uc.yiqibang.utils.MyBatisUtils;
import cn.uc.yiqibang.utils.Result;

public class NewsMapperImpl implements TNewsMapper{
    TPicMapper picDao=new PicMapperImpl();
    TCommentMapper commDao=new CommentMapperImpl();

	@Override
	public int insert(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Result insertSelective(TNews record) {
		Result result=new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		//添加新闻
		SqlSession session=MyBatisUtils.openSession();
		int row=session.insert(Constants.newsMapper_insertSelective,record);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		
		return result;
	}

	@Override
	public List<TNews> selectByExampleWithBLOBs(TNewsExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TNews> selectByExample(TNewsExample example) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public TNews selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKeyWithBLOBs(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(TNews record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Result selectAll() {
		Result result =new Result();
		SqlSession session=MyBatisUtils.openSession();
		List<TNews> newsList=session.selectList(Constants.newsMapper_selectAll);
		session.close();
		if(newsList!=null){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
			result.setRetData(newsList);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		return result;
	}

	@Override
	public Result insertNewsPic(HttpServletRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result selectByLike(String likeStr) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Result deleteByPrimaryKey(Integer id) {
		Result result =new Result();
		result.setRetCode(Constants.RETCODE_FAILED);
		result.setRetMsg(false);
		
		//删除该id关联的所有评论
		TPic pic=new TPic();
		pic.settNId(id);
		picDao.deleteByCondition(pic);
		
		//删除该id关联的所有评论
		TComment comm=new TComment();
		comm.settNId(id);
		commDao.deleteByCondition(comm);
		
		//删除新闻
		SqlSession session=MyBatisUtils.openSession();
		int row=session.delete(Constants.newsMapper_deleteByPrimaryKey,id);
		session.commit();
		session.close();
		if(row>0){
			result.setRetCode(Constants.RETCODE_SUCCESS);
			result.setRetMsg(true);
		}else{
			result.setRetCode(Constants.RETCODE_FAILED);
			result.setRetMsg(false);
		}
		
		return result;
	}



}
