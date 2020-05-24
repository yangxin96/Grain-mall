package com.atguigu.gmall.oms.dao;

import com.atguigu.gmall.oms.entity.PaymentInfoEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 支付信息表
 * 
 * @author xy
 * @email lxf@atguigu.com
 * @date 2020-05-23 16:10:40
 */
@Mapper
public interface PaymentInfoDao extends BaseMapper<PaymentInfoEntity> {
	
}
