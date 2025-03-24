package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZhibudongtaiDao;
import com.entity.ZhibudongtaiEntity;
import com.service.ZhibudongtaiService;
import com.entity.vo.ZhibudongtaiVO;
import com.entity.view.ZhibudongtaiView;

@Service("zhibudongtaiService")
public class ZhibudongtaiServiceImpl extends ServiceImpl<ZhibudongtaiDao, ZhibudongtaiEntity> implements ZhibudongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZhibudongtaiEntity> page = this.selectPage(
                new Query<ZhibudongtaiEntity>(params).getPage(),
                new EntityWrapper<ZhibudongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZhibudongtaiEntity> wrapper) {
		  Page<ZhibudongtaiView> page =new Query<ZhibudongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZhibudongtaiVO> selectListVO(Wrapper<ZhibudongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZhibudongtaiVO selectVO(Wrapper<ZhibudongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZhibudongtaiView> selectListView(Wrapper<ZhibudongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZhibudongtaiView selectView(Wrapper<ZhibudongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
