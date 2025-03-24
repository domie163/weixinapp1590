package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.XuexidongtaiEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.XuexidongtaiVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.XuexidongtaiView;


/**
 * 学习动态
 *
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
public interface XuexidongtaiService extends IService<XuexidongtaiEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<XuexidongtaiVO> selectListVO(Wrapper<XuexidongtaiEntity> wrapper);
   	
   	XuexidongtaiVO selectVO(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
   	
   	List<XuexidongtaiView> selectListView(Wrapper<XuexidongtaiEntity> wrapper);
   	
   	XuexidongtaiView selectView(@Param("ew") Wrapper<XuexidongtaiEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<XuexidongtaiEntity> wrapper);
   	

}

