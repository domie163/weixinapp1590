package com.entity.model;

import com.entity.DangjianxuexiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 党建学习
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-04-28 20:16:25
 */
public class DangjianxuexiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 资料名称
	 */
	
	private String ziliaomingcheng;
		
	/**
	 * 知识分类
	 */
	
	private String zhishifenlei;
		
	/**
	 * 资料简介
	 */
	
	private String ziliaojianjie;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 相关视频
	 */
	
	private String xiangguanshipin;
		
	/**
	 * 发布日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date faburiqi;
		
	/**
	 * 赞
	 */
	
	private Integer thumbsupnum;
		
	/**
	 * 踩
	 */
	
	private Integer crazilynum;
		
	/**
	 * 最近点击时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date clicktime;
		
	/**
	 * 点击次数
	 */
	
	private Integer clicknum;
				
	
	/**
	 * 设置：资料名称
	 */
	 
	public void setZiliaomingcheng(String ziliaomingcheng) {
		this.ziliaomingcheng = ziliaomingcheng;
	}
	
	/**
	 * 获取：资料名称
	 */
	public String getZiliaomingcheng() {
		return ziliaomingcheng;
	}
				
	
	/**
	 * 设置：知识分类
	 */
	 
	public void setZhishifenlei(String zhishifenlei) {
		this.zhishifenlei = zhishifenlei;
	}
	
	/**
	 * 获取：知识分类
	 */
	public String getZhishifenlei() {
		return zhishifenlei;
	}
				
	
	/**
	 * 设置：资料简介
	 */
	 
	public void setZiliaojianjie(String ziliaojianjie) {
		this.ziliaojianjie = ziliaojianjie;
	}
	
	/**
	 * 获取：资料简介
	 */
	public String getZiliaojianjie() {
		return ziliaojianjie;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：相关视频
	 */
	 
	public void setXiangguanshipin(String xiangguanshipin) {
		this.xiangguanshipin = xiangguanshipin;
	}
	
	/**
	 * 获取：相关视频
	 */
	public String getXiangguanshipin() {
		return xiangguanshipin;
	}
				
	
	/**
	 * 设置：发布日期
	 */
	 
	public void setFaburiqi(Date faburiqi) {
		this.faburiqi = faburiqi;
	}
	
	/**
	 * 获取：发布日期
	 */
	public Date getFaburiqi() {
		return faburiqi;
	}
				
	
	/**
	 * 设置：赞
	 */
	 
	public void setThumbsupnum(Integer thumbsupnum) {
		this.thumbsupnum = thumbsupnum;
	}
	
	/**
	 * 获取：赞
	 */
	public Integer getThumbsupnum() {
		return thumbsupnum;
	}
				
	
	/**
	 * 设置：踩
	 */
	 
	public void setCrazilynum(Integer crazilynum) {
		this.crazilynum = crazilynum;
	}
	
	/**
	 * 获取：踩
	 */
	public Integer getCrazilynum() {
		return crazilynum;
	}
				
	
	/**
	 * 设置：最近点击时间
	 */
	 
	public void setClicktime(Date clicktime) {
		this.clicktime = clicktime;
	}
	
	/**
	 * 获取：最近点击时间
	 */
	public Date getClicktime() {
		return clicktime;
	}
				
	
	/**
	 * 设置：点击次数
	 */
	 
	public void setClicknum(Integer clicknum) {
		this.clicknum = clicknum;
	}
	
	/**
	 * 获取：点击次数
	 */
	public Integer getClicknum() {
		return clicknum;
	}
			
}
