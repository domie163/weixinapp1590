package com.dao;

import com.entity.ZhibudongtaiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.vo.ZhibudongtaiVO;
import com.entity.view.ZhibudongtaiView;


/**
 * 支部动态
 * 
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
public interface ZhibudongtaiDao extends BaseMapper<ZhibudongtaiEntity> {
	
	List<ZhibudongtaiVO> selectListVO(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
	
	ZhibudongtaiVO selectVO(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
	
	List<ZhibudongtaiView> selectListView(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);

	List<ZhibudongtaiView> selectListView(Pagination page,@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
	
	ZhibudongtaiView selectView(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
	

}
