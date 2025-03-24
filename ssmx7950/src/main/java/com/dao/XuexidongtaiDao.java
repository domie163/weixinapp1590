package com.dao;

import com.entity.XuexidongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.XuexidongtaiVO;
import com.entity.view.XuexidongtaiView;


/**
 * 学习动态
 * 
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
public interface XuexidongtaiDao extends BaseMapper<XuexidongtaiEntity> {
	
	List<XuexidongtaiVO> selectListVO(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
	
	XuexidongtaiVO selectVO(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
	
	List<XuexidongtaiView> selectListView(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);

	List<XuexidongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
	
	XuexidongtaiView selectView(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
	

}
