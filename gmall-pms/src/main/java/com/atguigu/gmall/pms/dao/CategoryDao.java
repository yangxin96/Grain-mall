package com.atguigu.gmall.pms.dao;

import com.atguigu.gmall.pms.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author xy
 * @email lxf@atguigu.com
 * @date 2020-05-20 10:35:12
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
