package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 * 
 * @author xy
 * @email lxf@atguigu.com
 * @date 2020-05-23 16:10:40
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {
	
}
