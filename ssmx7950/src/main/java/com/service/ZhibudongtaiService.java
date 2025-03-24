package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.ZhibudongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.ZhibudongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhibudongtaiView;


/**
 * 支部动态
 *
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
public interface ZhibudongtaiService extends IService<ZhibudongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ZhibudongtaiVO> selectListVO(Wrapper<ZhibudongtaiEntity> wrapper);
   	
   	ZhibudongtaiVO selectVO(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
   	
   	List<ZhibudongtaiView> selectListView(Wrapper<ZhibudongtaiEntity> wrapper);
   	
   	ZhibudongtaiView selectView(@Param("ew") Wrapper<ZhibudongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ZhibudongtaiEntity> wrapper);
   	

}

