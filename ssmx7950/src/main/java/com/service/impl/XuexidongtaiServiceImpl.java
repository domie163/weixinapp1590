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


import com.dao.XuexidongtaiDao;
import com.entity.XuexidongtaiEntity;
import com.service.XuexidongtaiService;
import com.entity.vo.XuexidongtaiVO;
import com.entity.view.XuexidongtaiView;

@Service("xuexidongtaiService")
public class XuexidongtaiServiceImpl extends ServiceImpl<XuexidongtaiDao, XuexidongtaiEntity> implements XuexidongtaiService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<XuexidongtaiEntity> page = this.selectPage(
                new Query<XuexidongtaiEntity>(params).getPage(),
                new EntityWrapper<XuexidongtaiEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<XuexidongtaiEntity> wrapper) {
		  Page<XuexidongtaiView> page =new Query<XuexidongtaiView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<XuexidongtaiVO> selectListVO(Wrapper<XuexidongtaiEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public XuexidongtaiVO selectVO(Wrapper<XuexidongtaiEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<XuexidongtaiView> selectListView(Wrapper<XuexidongtaiEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public XuexidongtaiView selectView(Wrapper<XuexidongtaiEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
