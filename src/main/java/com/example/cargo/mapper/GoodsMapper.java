package com.example.cargo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cargo.entity.Goods;
import org.apache.ibatis.annotations.Mapper;

/**
 * 货物 Mapper 接口
 */
@Mapper
public interface GoodsMapper extends BaseMapper<Goods> {

}
