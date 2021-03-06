package com.atguigu.gmall.ums.dao;

import com.atguigu.gmall.ums.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author xy
 * @email lxf@atguigu.com
 * @date 2020-05-23 16:29:24
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
