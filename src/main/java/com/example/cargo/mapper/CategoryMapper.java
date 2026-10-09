package com.example.cargo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.cargo.entity.Category;
import org.apache.ibatis.annotations.Mapper;

/**
 * 分类 Mapper 接口
 * 继承 BaseMapper 后，自动拥有增删改查所有方法
 */
@Mapper
public interface CategoryMapper extends BaseMapper<Category> {

}